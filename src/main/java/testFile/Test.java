package testFile;

import testFile.post.PostController;
import testFile.post.PostRepository;

import java.util.Scanner;

public class Test {
    public void run() {
        Scanner sc = new Scanner(System.in);
        PostController postController = new PostController();
        while (true) {
            System.out.print("명령어를 입력해주세요 : ");
            String command = sc.nextLine();
            if (command.equals("exit")) {
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
            }
        }
    }

}
