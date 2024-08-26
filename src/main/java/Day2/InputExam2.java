package Day2;

import java.util.Scanner;

public class InputExam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : ");
            int num = sc.nextInt();
            if (num == 1) {
                System.out.print("첫번째 숫자를 입력해 주세요 : ");
                int num2 = sc.nextInt();
                System.out.print("두번째 숫자를 입력해 주세요 : ");
                int num3 = sc.nextInt();
                System.out.println(num2 + num3);

            }
            if (num == 2) {
                System.out.print("첫번째 숫자를 입력해 주세요 : ");
                int num2 = sc.nextInt();
                System.out.print("두번째 숫자를 입력해 주세요 : ");
                int num3 = sc.nextInt();
                System.out.println(num2 - num3);
            }
            if (num == 3) {
                System.out.print("첫번째 숫자를 입력해 주세요 : ");
                int num2 = sc.nextInt();
                System.out.print("두번째 숫자를 입력해 주세요 : ");
                int num3 = sc.nextInt();
                System.out.println(num2 * num3);
            }
            if (num == 4) {
                System.out.print("첫번째 숫자를 입력해 주세요 : ");
                int num2 = sc.nextInt();
                System.out.print("두번째 숫자를 입력해 주세요 : ");
                int num3 = sc.nextInt();
                System.out.println(num2 / num3);
            }

            if (num == 5) {
                break;
            }
            else {
                System.out.println("그런기능은 존재 하지 않습니다.");

            }


        }


        System.out.println("프로그램이 종료되었습니다.");

    }
}
