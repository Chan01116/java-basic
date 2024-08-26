package Day2;

import java.util.Scanner;

public class InputExam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해 주세요 : ");
        String str = sc.nextLine();
        System.out.print("나이를 입력해 주세요 : ");
        String str2 = sc.nextLine();
        System.out.println("안녕하세요 " + str2 +"세 " + str + "입니다.");
    }
}
