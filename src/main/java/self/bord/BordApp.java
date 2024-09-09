package self.bord;

import self.user.User;
import self.user.UserRepository;

import java.util.Scanner;

public class BordApp {
    private Scanner sc = new Scanner(System.in);
    private PostController postController = new PostController();
    private User user = null;
    public void run() {
        while (true) {
            String prompt = "";
            if (user.getLoggedInUser() != null) {
                prompt = "[" + user.getID() + "(" + user.getNickname() + ")]";
            }
            System.out.print("명령어를 입력해 주세요" + prompt + " : ");
            String command = sc.nextLine();
            if (command.equals("exit")) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            } else if (command.equals("add")) {
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
            }else if (command.equals("signup")){
                postController.signup();
            } else if (command.equals("login")) {
                postController.login();
            }

        }

    }
}
