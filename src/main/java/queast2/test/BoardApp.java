package queast2.test;

import queast2.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {

    // main 메서드와 findPostById 메서드가 같이 사용해야 하므로 main 밖으로 빼주고 static 붙여줌
    // static은 공유 목적. 자바에서 기본은 non-static
    // main에 무조건 static을 붙여야 해서 핵심로직은 main에 작성하지 않는다.
    // 핵심로직을 객체로 빼면 된다.
    ArrayList<Post> posts = new ArrayList<>();

    // 값의 초기화는 대부분 생성자에서 해주는 것을 권장합니다. 다향한 로직 수행 가능합니다.
    public BoardApp() {
        Post p1 = new Post(1, "안녕하세요 반갑습니다. java공부중입니다.", "냉무", currentDateTime(), 0);
        Post p2 = new Post(2, "java 질문", "냉무", currentDateTime(), 0);
        Post p3 = new Post(3, "정처기", "냉무", currentDateTime(), 0);

        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int lastestId = 4; //가장 최신의 id값. id값의 고유성을 유지하기 위해 1씩 증가시킬 계획임
        while (true) {
            System.out.print("명령어 : ");
            String command = sc.nextLine();
            if (command.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String body = sc.nextLine();
                // 1부터 1씩 증가 -> 고유값 유지하는데 편리
                Post post = new Post(lastestId, title, body, currentDateTime(), 0);

//                post.setTitle(title);
//                post.setBody(body);
                posts.add(post);
                System.out.println("게시물이 등록되었습니다.");
                lastestId++; // 다음 게시물의 id를 부여하기 위해 1증가


            } else if (command.equals("list")) {
//                System.out.println("==========");// fof post 로 바꿔도됨
//                for (int i = 0; i < posts.size(); i++) {
//                    System.out.printf("번호 : %d\n", posts.get(i).getId());
//                    System.out.printf("제목 : %s\n ", posts.get(i).getTitle());
//                    System.out.println("==========");
//                }

                printPostList(posts);
//
//                System.out.println("==========");
//                for (Post post : posts) {
//                    System.out.printf("번호 : %d\n", post.getId());
//                    System.out.printf("제목 : %s\n ", post.getTitle());
//                    System.out.println("==========");//메서드로 만든다


//                }
            } else if (command.equals("update")) {
                System.out.println("수정할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());

                // 논리연산자
                // 조건1 || 조건2  -> 둘 중 하나만 만족해도 실행
                // 조건1 && 조건2  -> 동시에 만족(모두 만족)해야만 실행
//                if (targetId < 1 || targetId >= posts.size()) {
//                    System.out.println("없는 게시물 번호입니다.");
//                    continue;
//                }

                Post post = findPostById(targetId);
                if (post == null) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                }
                System.out.println("수정할 제목 : ");
                String newTitle = sc.nextLine();
                System.out.println("수정할 내용 : ");
                String newBody = sc.nextLine();
                post.setTitle(newTitle);
                post.setBody(newBody);// 더확작성 있음
                System.out.println("수정이 완료되었습니다.");
//                for (Post post : posts) {
//                    if (post.getId() == targetId) {
//
//
//
//
//
//
//
//                        break;
//                    }
//                }
//            Post post = posts.get(targetIdx - 1);
//                Post post = posts.get(targetIdx - 1);

            } else if (command.equals("delete")) {
                System.out.println("삭제할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());
//                for (Post post : posts) {
//                    if (post.getId() == targetId) {
//                        posts.remove(post); // index가 아닌 값을 넣어서 해당 값을 삭제할 수도 있다.
//                        System.out.println("삭제가 완료되었습니다.");
//                        break;
//                    }
//
//
//                }

                Post post = findPostById(targetId);
                posts.remove(post);
                if (post == null) {
                    System.out.println("없는 게시물 입니다.");
                    continue;

                }
                System.out.println("삭제가 완료되었습니다.");
                break;
            } else if (command.equals("detail")) {
                System.out.println("상세보기 할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());

                Post post = findPostById(targetId);

                if (post == null) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                }
                post.increaseHit();
                System.out.printf("번호 : %d\n", post.getId());
                System.out.printf("제목 : %s", post.getTitle());
                System.out.printf("내용 : %s", post.getBody());
                System.out.printf("등록날짜 : %s", post.getHit());


            } else if (command.equals("search")) {
                System.out.println("검색 키워드 : ");
                String keyword = sc.nextLine();

//                System.out.println("==========");
//                for (Post post : posts) {
//                    if (post.getTitle().contains(keyword)) {
//                        System.out.printf("번호 : %d\n", post.getId());
//                        System.out.printf("제목 : %s\n ", post.getTitle());
////                        System.out.println("==========");
//                    }
//                }
                ArrayList<Post> searchedPostList = new ArrayList<>();
                for(Post post : posts){
                    if(post.getTitle().contains(keyword)){
                        searchedPostList.add(post);
                    }
                }
                printPostList(searchedPostList);

            }


            if (command.equals("exit")) {
                System.out.println("프로그램을 종료");
                break;
            }
        }
    }

    // 이름 짓는거 정말 정말 중요!!!
    // 리턴타입이라 보이드가 아님

    public Post findPostById(int id) {

        // 만약 내가 찾고자 하는 게시물이 없다면?
        for (Post post : posts) {
            if (post.getId() == id) {
                return post; // return을 만나면 메서드는 그 즉시 종료.
            }
        }

        return null; // null은 없다라는 의미
    }

    public String currentDateTime() {

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        return formattedDateTime;
    }

    public void printPostList(ArrayList<Post> targetList) {
        System.out.println("==========");
        for (Post post : targetList) {
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n ", post.getTitle());
            System.out.println("==========");//메서드로 만든다
        }

    }
}


