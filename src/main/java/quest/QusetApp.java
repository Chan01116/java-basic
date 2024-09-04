package quest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class QusetApp {
    ArrayList<Post> posts = new ArrayList<>();
    public void run(){
        Scanner sc = new Scanner(System.in);
        int lastestId = 1;
        LocalDateTime currentDateTime = LocalDateTime.now();
        while (true) {
            System.out.print("명령어를 입력해 주세요 \nhelp : 기능확인\nadd : 게시글 및 내용작성\nlist : 게시글 및 내용 확인\nupdate : 선택한 게시물수정" +
                    "\ndelete : 선택한 게시물 삭제\nexit : 종료\n");
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
                post.setDate(currentDateTime);
                posts.add(post);
                System.out.println("게시물이 등록되었습니다.");
                lastestId++;


            } else if (command.equals("list")) {
                System.out.println("===========");
                for(Post post : posts){
                    System.out.printf("번호 : %d\n", post.getId());
                    System.out.printf("제목 : %s\n", post.getHeadLines());
                    System.out.println("==========");
                }
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
                if(post == null){
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                }
                System.out.print("새로운 게시물 제목을 입력해 주세요 : ");
                String newheadline = sc.nextLine();
                System.out.print("새로운 게시물 내용을 입력해 주세요 : ");
                String newcontent = sc.nextLine();
                post.setHeadLines(newheadline);
                post.setContents(newcontent);
                System.out.println("수정이 완료되었습니다.");
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
                if(post == null){
                    System.out.println("없는 게시물 번호입니다.");
                    continue;

                }
                posts.remove(post);
                System.out.println("삭제가 완료되었습니다.");
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


            } else if (command.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
                int detail = Integer.parseInt(sc.nextLine());
                Post post = findPostById(detail);
                if(post == null){
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                }
                System.out.println("===========");
                System.out.println("제목 : " + post.getHeadLines());
                System.out.println("내용 : " + post.getContents());
                System.out.println("등록날짜 : " + post.getDate());
                System.out.println("조회수 : " + post.hit());
                System.out.println("===========");
                System.out.println("댓글 : "+ post.getReply());
                while (true) {
                    System.out.print("상세보기 기능을 선택해주세요 (1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
                    int detailTarget = Integer.parseInt(sc.nextLine());
                    if (detailTarget == 1) {
                        System.out.print("댓글을 입력해 주세요 : ");
                        String reply = sc.nextLine();
                        post.getReply().add(reply + currentDateTime);
                        System.out.println("댓글이 성공적으로 등록되었습니다.");

                    } else if (detailTarget == 2) {

                    } else if (detailTarget == 3) {

                    } else if (detailTarget == 4) {

                    } else if (detailTarget == 5) {
                        System.out.println("상세보기 화면을 빠져나갑니다.");
                        break;

                    } else {
                        System.out.println("알수 없는 명령어 입니다.");
                        continue;
                    }
                }

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


            } else if (command.equals("exit")) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
        }



    }
    public Post findPostById(int id){
        for(Post post : posts){
            if(post.getId() == id){
                return post;

            }
        }
        return null;

    }
}