package quest;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Quset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Post> posts = new ArrayList<>();
        int lastestId = 1;
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
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
                LocalDateTime date = currentDateTime;
                post.setHeadLines(headline);
                post.setContents(content);
                post.setId(lastestId);
                post.setDate(currentDateTime);
                posts.add(post);
                System.out.println("게시물이 등록되었습니다.");
                lastestId++;


            } else if (command.equals("list")) {
                System.out.println("===========");
                for (int i = 0; i < posts.size(); i++) {
                    System.out.printf("번호 : %d\n", i + 1);
                    System.out.printf("제목 : %s\n ", posts.get(i).getHeadLines());
                    System.out.println("==========");
                }


//                for (Post post : posts) {
//                    System.out.println("번호 : " + lastestId);
//                    System.out.println("제목 : " + post.getHeadLines());
//                    System.out.println("===========");
//
//            }


        } else if (command.equals("update")) {
            System.out.print("수정할 게시물 번호 : ");
            int pix = Integer.parseInt(sc.nextLine());
            if (pix < 1 || pix >= posts.size()) {
                System.out.println("없는 게시물 번호입니다.");
                continue;
            }for(Post post : posts){
                if(post.getId() == pix){
                    System.out.print("새로운 게시물 제목을 입력해 주세요 : ");
                    String newheadline = sc.nextLine();
                    System.out.print("새로운 게시물 내용을 입력해 주세요 : ");
                    String newcontent = sc.nextLine();
                    post.setHeadLines(newheadline);
                    post.setContents(newcontent);
                    System.out.println("수정이 완료되었습니다.");
                    break;
                }
                }
//            Post post = posts.get(pix - 1);//필요 없어짐


        } else if (command.equals("delete")) {
            System.out.print("삭제할 게시물 번호 : ");
            int del = Integer.parseInt(sc.nextLine());
            if (del < 1 || del >= posts.size()) {
                System.out.println("없는 게시물 번호입니다.");
                continue;
            }
            for(Post post : posts){
                if(post.getId() == del){
                    posts.remove(post);
                    System.out.println("수정이 완료되었습니다");
                    break;
                }

            }


        } else if (command.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
                int detail = Integer.parseInt(sc.nextLine());
                if (detail < 1 || detail > posts.size()) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                }
                for (Post post : posts){
                    if(post.getId() == detail){
                        System.out.println("제목 : "+ post.getHeadLines() );
                        System.out.println("내용 : "+ post.getContents() );
                        System.out.println("등록날짜 : "+ post.getDate());

                    }
                }


            } else if (command.equals("search")) {
                System.out.print("검색할 키워드를 입력해주세요 : ");
                String search = sc.nextLine();
                boolean contains = posts.contains(search);
                System.out.println(contains);

            } else if (command.equals("exit")) {
            System.out.println("프로그램이 종료됩니다.");
            break;
        }
    }
}}

