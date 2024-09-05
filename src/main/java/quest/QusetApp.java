package quest;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QusetApp {
    private static final String POSTS_FILE = "posts.ser";
    private static final String USERS_FILE = "users.ser";
    private ArrayList<Post> posts = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private User loggedInUser = null;
    private Scanner sc = new Scanner(System.in);
    private int lastestId = 1;
    private int perPage = 3;
    private int nowPage = 1;


    public void run() {
        createFileIfNotExists();
        loadData();

        while (true) {
            String prompt = "";
            if (loggedInUser != null) {
                prompt = "[" + loggedInUser.getID() + "(" + loggedInUser.getNickname() + ")]";

            }
            System.out.print("명령어를 입력해 주세요" + prompt + " : ");
            String command = sc.nextLine();
            if (command.equals("help")) {
                System.out.println("add : 게시글 및 내용작성\nlist : 게시글 및 내용 확인\nupdate : 선택한 게시물수정" +
                        "\ndelete : 선택한 게시물 삭제\nexit : 종료 ");
            } else if (command.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String headline = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String content = sc.nextLine();
                Post post = new Post();
                post.setHeadLines(headline);
                post.setContents(content);
                post.setId(lastestId);
                post.setDate(currentDateTime());
                post.setAuthor(loggedInUser);  //로그인한 사용자를 작성자로 설정
                posts.add(post);
                System.out.println("게시물이 등록되었습니다.");
                lastestId++;


            } else if (command.equals("list")) {
                displayPostList();

//                for (int i = 0; i < posts.size(); i++) {
//                    System.out.printf("번호 : %d\n", i + 1);
//                    System.out.printf("제목 : %s\n ", posts.get(i).getHeadLines());
//
//                }


//                for (Post post : posts) {
//                    System.out.println("번호 : " + lastestId);
//                    System.out.println("제목 : " + post.getHeadLines());
//                    System.out.println("===========");
//
//            }


            } else if (command.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int pix = Integer.parseInt(sc.nextLine());
//                if (pix < 1 || pix >= posts.size()) {
//                    System.out.println("없는 게시물 번호입니다.");
//                    continue;
//                }
                Post post = findPostById(pix);
                if (post == null) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                }
                if (!post.getAuthor().equals(loggedInUser)) {
                    System.out.println("자신의 게시물만 수정할수 있습니다.");
                    continue;

                }
                System.out.print("새로운 게시물 제목을 입력해 주세요 : ");
                String newheadline = sc.nextLine();
                System.out.print("새로운 게시물 내용을 입력해 주세요 : ");
                String newcontent = sc.nextLine();
                post.setHeadLines(newheadline);
                post.setContents(newcontent);
                System.out.println("수정이 완료되었습니다.");
                displayPostDetail(post);
                continue;
//                for (Post post : posts) {
//                    if (post.getId() == pix) {
//
//
//
//
//
//
//
//
//                    }
//                }
//            Post post = posts.get(pix - 1);//필요 없어짐


            } else if (command.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int del = Integer.parseInt(sc.nextLine());
                Post post = findPostById(del);
                if (post == null) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;

                }
//                posts.remove(post);
//                System.out.println("삭제가 완료되었습니다.");
//                if (del < 1 || del >= posts.size()) {
//                    System.out.println("없는 게시물 번호입니다.");
//                    continue;
//                }
//                for (Post post : posts) {
//                    if (post.getId() == del) {
//                        posts.remove(post);
//                        System.out.println("수정이 완료되었습니다");
//                        break;
//                    }
//
//                }
                if (!post.getAuthor().equals(loggedInUser)) {
                    System.out.println("자신의 게시물만 삭제할 수있습니다.");
                    continue;

                }
                System.out.println("정말 게시물을 삭제하시겠습니까? (y/n) : ");
                String confirmation = sc.nextLine();
                if (confirmation.equals("y")) {
                    posts.remove(post);
                    System.out.println(loggedInUser.getNickname() + "님의 " + post.getId() + "번의 게시물을 삭제 했습니다.");
                    displayPostList();

                }


            } else if (command.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
                int detail = Integer.parseInt(sc.nextLine());
                Post post = findPostById(detail);
                if (post == null) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                }
                displayPostDetail(post);


//                if (detail < 1 || detail > posts.size()) {
//                    System.out.println("없는 게시물 번호입니다.");
//                    continue;
//                }
//                for (Post post : posts) {
//                    if (post.getId() == detail) {
//
//
//
//
//
//                    }
//                }
            } else if (command.equals("search")) {
                System.out.print("검색할 키워드를 입력해주세요 : ");
                String keyword = sc.nextLine();
                boolean found = false;
                for (Post post : posts) {
                    if (post.getHeadLines().contains(keyword)) {
                        System.out.println("===========");
                        System.out.println(post);
                        System.out.println("===========");
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("검색결과를 찾을수 없습니다.");
                }


            } else if (command.equals("signup")) {
                System.out.println("===회원 가입을 진행합니다.===");
                System.out.print("아이디를 입력해주세요 : ");
                String ID = sc.nextLine();
                System.out.print("비밀번호를 입력해주세요 : ");
                String Password = sc.nextLine();
                System.out.print("닉네임을 입력해주세요 : ");
                String Nickname = sc.nextLine();
                User user = new User();
                user.setID(ID);
                user.setPassword(Password);
                user.setNickname(Nickname);
                users.add(user);
                System.out.println("===회원가입이 완료되었습니다.===");

            } else if (command.equals("login")) {
                System.out.println("아이디 : ");
                String logId = sc.nextLine();
                System.out.println("비밀번호 : ");
                String logPassword = sc.nextLine();
                boolean loggedIn = false;
                for (User user : users) {
                    if (logId.equals(user.getID()) && logPassword.equals(user.getPassword())) {
                        loggedInUser = user;
                        System.out.println(user.getNickname() + "님 환영합니다.");
                        loggedIn = true;
                        break;
                    }
                    if (!loggedIn) {
                        System.out.println("비밀번호를 틀렸거나 잘못된 회원정보입니다.");
                    }

                }


            } else if (command.equals("sort")) {
                sort();

            } else if (command.equals("page")) {
                page();

            } else if (command.equals("exit")) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
        }


    }

    private void page() {
        while (true){
            displayNowPage();
            displayNowPageNevi();
            System.out.println("페이징 명령어를 입력해주세요 ((1. 이전, 2. 다음, 3. 선택, 4. 뒤로가기): ");
            int paging = Integer.parseInt(sc.nextLine());
            if(paging == 1){
                nowPage--;
            } else if (paging == 2) {
                if(nowPage < getTotalPages()){
                    nowPage++;
                }

            } else if (paging == 3) {
                System.out.println("이동하실 페이지 번호를 입력해주세요 : ");
                int pageNum = Integer.parseInt(sc.nextLine());
                if(pageNum >= 1 && pageNum <= getTotalPages()){
                    nowPage = pageNum;
                }else {
                    System.out.println("유효하지 않은 페이지 번호입니다.");
                }

            } else if (paging == 4) {
                return;

            }else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
    private void displayNowPage(){
        int start = (nowPage - 1) * perPage;
        int end = Math.min(start+perPage, posts.size());
        System.out.println("===페이지"+ nowPage + "===");
        for(int i = start; i < end; i++){
            System.out.println(posts.get(i));
        }
    }
    private void displayNowPageNevi(){
        System.out.println("페이지 네비게이션:");
        System.out.println("현재 페이지: " + nowPage);
        System.out.println("총 페이지 수: " + getTotalPages());
        System.out.println("1. 이전 페이지");
        System.out.println("2. 다음 페이지");
        System.out.println("3. 특정 페이지로 이동");
        System.out.println("4. 뒤로가기");
    }
    private int getTotalPages(){
        return (int) Math.ceil((double) posts.size() / perPage);
    }

    private void sort() {
        System.out.println("정렬 대상을 선택해주세요. (1. 번호, 2. 조회수)");
        int sortTarget = Integer.parseInt(sc.nextLine());
        if(sortTarget == 1){
            System.out.println("정렬 방법을 선택해주세요. (1. 오름차순, 2.내림차순)");
            int sortDetailTarget = Integer.parseInt(sc.nextLine());
            if(sortDetailTarget == 1){
                Collections.sort(posts, Comparator.comparingInt(Post::getId));

            }
            if(sortDetailTarget == 2){
                Collections.sort(posts, Comparator.comparingInt(Post::getId).reversed());

            } else {
                System.out.println("정렬 방법이 잘못되었습니다.");
                return;}

        } else if (sortTarget == 2) {
            int sortDetailTarget = Integer.parseInt(sc.nextLine());
            if(sortDetailTarget == 1){
                Collections.sort(posts, Comparator.comparingInt(Post::getHits));

            }
            if(sortDetailTarget == 2){
                Collections.sort(posts, Comparator.comparingInt(Post::getHits).reversed());

            } else {
                System.out.println("정렬 방법이 잘못되었습니다.");
                return;}


        }else {
            System.out.println("그런 기능은 없습니다.");
            return;
        }
        displayPostList();
    }

    public Post findPostById(int id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;

            }
        }
        return null;

    }

    public String currentDateTime() {

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        return formattedDateTime;
    }
    public void displayPostList(){
        System.out.println("===========");
        for (Post post : posts) {
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getHeadLines());
            System.out.println("==========");
        }
    }

    public void displayPostDetail(Post post) {
        System.out.println("===========");
        System.out.println("제목 : " + post.getHeadLines());
        System.out.println("내용 : " + post.getContents());
        System.out.println("등록날짜 : " + post.getDate());
        System.out.println("조회수 : " + post.hit());
        String likeStatus;
        if (post.getLikedUsers().contains(loggedInUser)) {
            likeStatus = "♥ " + post.getLike();
        } else {
            likeStatus = "♡ " + post.getLike();
        }
        System.out.println("===========");
        System.out.println("=====댓글=====");
        for (String reply : post.getReply()) {
            System.out.println("- " + reply);

        }
        while (true) {
            System.out.print("상세보기 기능을 선택해주세요 (1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
            int detailTarget = Integer.parseInt(sc.nextLine());
            if (detailTarget == 1) {
                System.out.print("댓글을 입력해 주세요 : ");
                String reply = sc.nextLine();
                post.getReply().add(reply + "                 " + currentDateTime());
                System.out.println("댓글이 성공적으로 등록되었습니다.");

            } else if (detailTarget == 2) {
                if (post.getLikedUsers().contains(loggedInUser)) {
                    post.getLikedUsers().remove(loggedInUser);
                    System.out.println("해당 게시물의 좋아요를 해제합니다.");
                } else {
                    post.getLikedUsers().add(loggedInUser);
                    System.out.println("해당 게시물을 좋아합니다.");
                }
                displayPostDetail(post);


            } else if (detailTarget == 3) {
                if (post.getAuthor() != null && post.getAuthor().equals(loggedInUser)) {
                    System.out.print("새로운 게시물 제목을 입력해 주세요 : ");
                    String newheadline = sc.nextLine();
                    System.out.print("새로운 게시물 내용을 입력해 주세요 : ");
                    String newcontents = sc.nextLine();
                    post.setHeadLines(newheadline);
                    post.setContents(newcontents);
                    System.out.println("수정이 완료되었습니다.");
                    displayPostDetail(post);
                } else {
                    System.out.println("자신의 게시물만 수정할 수 있습니다.");
                }

            } else if (detailTarget == 4) {
                if(post.getAuthor() != null && post.getAuthor().equals(loggedInUser)){
                    System.out.println("정말 게시물을 삭제하시겠습니까? (y/n) : ");
                    String comfirmatiom = sc.nextLine();
                    if(comfirmatiom.equals("y")){
                        posts.remove(post);
                        System.out.println(loggedInUser.getNickname() + "님의 " + post.getId()+ "번의 게시물을 삭제했습니다." );
                        displayPostList();

                    }

                }else {
                    System.out.println("자신의 게시물만 삭제할 수 있습니다.");
                }

            } else if (detailTarget == 5) {
                System.out.println("상세보기 화면을 빠져나갑니다.");
                break;

            } else {
                System.out.println("알수 없는 명령어 입니다.");
                continue;
            }
        }
    }
    public void saveData() {
        try (ObjectOutputStream oosPosts = new ObjectOutputStream(new FileOutputStream(POSTS_FILE));
             ObjectOutputStream oosUsers = new ObjectOutputStream(new FileOutputStream(USERS_FILE))) {
            oosPosts.writeObject(posts);
            oosUsers.writeObject(users);
            System.out.println("데이터가 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("데이터 저장 중 오류 발생: " + e.getMessage());
        }
    }

    public void loadData() {
        try (ObjectInputStream oisPosts = new ObjectInputStream(new FileInputStream(POSTS_FILE));
             ObjectInputStream oisUsers = new ObjectInputStream(new FileInputStream(USERS_FILE))) {
            posts = (ArrayList<Post>) oisPosts.readObject();
            users = (ArrayList<User>) oisUsers.readObject();
            System.out.println("데이터가 로드되었습니다.");
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다. 새로운 데이터로 초기화합니다.");
            posts = new ArrayList<>();
            users = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("데이터 로드 중 오류 발생: " + e.getMessage());
            posts = new ArrayList<>();
            users = new ArrayList<>();
        }
    }
    private void createFileIfNotExists() {
        File postsFile = new File(POSTS_FILE);
        File usersFile = new File(USERS_FILE);

        if (!postsFile.exists()) {
            try {
                postsFile.getParentFile().mkdirs(); // 디렉토리 생성
                postsFile.createNewFile();
                System.out.println("게시물 데이터 파일이 생성되었습니다.");
            } catch (IOException e) {
                System.out.println("게시물 데이터 파일 생성 중 오류 발생: " + e.getMessage());
            }
        }

        if (!usersFile.exists()) {
            try {
                usersFile.getParentFile().mkdirs(); // 디렉토리 생성
                usersFile.createNewFile();
                System.out.println("사용자 데이터 파일이 생성되었습니다.");
            } catch (IOException e) {
                System.out.println("사용자 데이터 파일 생성 중 오류 발생: " + e.getMessage());
            }
        }
    }
}