package Day3;

import java.util.Scanner;

public class NameAppSelf {
    public static void main(String[] args) {
        String[] names = new String[1000];
        int index = 0;
        int[] age = new int[1000];

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("명령어 : ");
            String command = sc.nextLine();
            if(command.equals("help")){
                System.out.println("add : 이름추가");
                System.out.println("list : 이름목록 확인");
                System.out.println("exit : 종료");
            } else if (command.equals("add")) {
                System.out.print("이름을 입력해주세요 : ");
                names[index] = sc.nextLine();
                System.out.println(names[index] + "이 명부에 저장 되었습니다.");
                System.out.print("나이를 입력해 주세요 : ");
                age [index] = Integer.parseInt(sc.nextLine());
                System.out.println(age[index] + " 가 명부에 저장 되었습니다. ");
                index++;

            } else if (command.equals("list")) {
                for(int i = 0; i < index; i ++){
                    System.out.println(names[i]+", "+age[i]);
                }

            } else if (command.equals("exit")) {
                System.out.println("exit");
                System.out.println("프로그램이 종료됩니다.");
                break;

            }
        }
    }
}
