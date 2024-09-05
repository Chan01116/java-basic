package queast2;

import queast2.post.Post;
import queast2.post.PostController;
import queast2.post.PostRepository;
import queast2.post.PostView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {
    // main 메서드와 findPostById 메서드가 같이 사용해야 하므로 main 밖으로 빼주고 static 붙여줌
    // static은 공유 목적. 자바에서 기본은 non-static
    // main에 무조건 static을 붙여야 해서 핵심로직은 main에 작성하지 않는다.
    // 핵심로직을 객체로 빼면 된다.
    Scanner sc = new Scanner(System.in);
    PostController postController = new PostController();
    // 값의 초기화는 대부분 생성자에서 해주는 것을 권장합니다. 다향한 로직 수행 가능합니다.
    public void run() {
        //가장 최신의 id값. id값의 고유성을 유지하기 위해 1씩 증가시킬 계획임
        while (true) {
            System.out.print("명령어 : ");
            String command = sc.nextLine();
            if (command.equals("add")) {
                postController.add();
            } else if (command.equals("list")) {
                postController.list();
            } else if (command.equals("update")) {
                postController.update();
            } else if (command.equals("delete")) {
                postController.delete();
            } else if (command.equals("detail")) {
                postController.detail();
            } else if (command.equals("search")) {
                postController.search();
            }
            if (command.equals("exit")) {
                System.out.println("프로그램을 종료");
                break;
            }
        }
    }









    // 이름 짓는거 정말 정말 중요!!!
    // 리턴타입이라 보이드가 아님





}