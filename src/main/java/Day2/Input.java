package Day2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

//        Scanner sc = new Scanner (System.in);
//
//        int num1 = sc.nextInt(); // 숫자를 입력받는 명령어
//        System.out.println("당신이 입력한 값은" + num1);
//
//        int num2 = sc.nextInt();
//        System.out.println(num2);
//
//        System.out.println(num1+num2);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("첫번째 숫자를 입력해주세요 : ");
//        int num1 = sc.nextInt();
//        System.out.print("두번째 숫자를 입력해 주세요 :");
//        int num2 = sc.nextInt();
//        System.out.println(num1 + num2);

        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 단을 입력해 주세요 : ");
        int num1 = sc.nextInt();
        for(int i = 1; i<=9; i++) {
                System.out.println(i + "X" + i + num1 * i );
            }
        }


    }

