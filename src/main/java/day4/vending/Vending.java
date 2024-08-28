package day4.vending;

import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
////        VendingClass v1 = new VendingClass();
////        String[] vending = new String[3];
//        int reminder = 0;
//
//
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.print("기능 선택 (1. 돈투입, 2 음료 선택, 3 음료 목록 확인, 4 잔액 확인, 5. 사용종료) : ");
//            String command = sc.nextLine();
//            if (command.equals("1")) {
//                System.out.print("돈을 투입해주세요 : ");
//                int input = sc.nextInt();
//                reminder = reminder + input;
//                System.out.println("현재 투입된 돈은 " + reminder + "원 입니다.");
//            } else if (command.equals("2")) {
//                System.out.println("음료수를 선택해 주세요");
//                System.out.println("== 음료수 목록 ==\n" +
//                        " 0. 콜라 : 1000원\n" +
//                        " 1. 사이다 : 1200원\n" +
//                        " 2. 커피 : 800원");
//                int ch = sc.nextInt();
//                if (command.equals("0")) {
//                    System.out.println("콜라를 뽑았습니다. \n 현재 잔액은 " + (reminder - 1000) + "원 입니다.");}
//                if(reminder < 1000){
//                    System.out.println("잔액이 부족합니다.");
//                }
//
//
//            } else if (command.equals("3")) {
//                System.out.println("음료수 목록확인");
//                System.out.println("== 음료수 목록 ==\n" +
//                        "     0. 콜라 : 1000원\n" +
//                        "     1. 사이다 : 1200원\n" +
//                        "     2. 커피 : 800원");
//
//            } else if (command.equals("4")) {
//                System.out.println("현재 잔액은 " + reminder + "원 입니다.");
//            } else if (command.equals("5")) {
//                System.out.println("자판기 프로그램을 종료합니다. 남은돈" + reminder +"원을 반환합니다.");
//                break;
//
//            }

        Scanner sc = new Scanner(System.in);
        int reminder = 0;
        String[] ba = {"콜라", "사이다", "커피"};
        int[] price = {1000, 1200, 800};

        while (true) {
            System.out.print("기능 선택 (1. 돈투입, 2 음료 선택, 3 음료 목록 확인, 4 잔액 확인, 5. 사용종료) : ");
            int command = Integer.parseInt((sc.nextLine()));
            if (command == 1) {
                System.out.print("돈을 투입해 주세요 : ");
                int input = Integer.parseInt((sc.nextLine()));
                reminder = reminder + input;
                System.out.println("현재 투입된 돈은 " + reminder + "원 입니다.");


            } else if (command == 2) {
                System.out.println("음료수를 선택해 주세요");
                System.out.println("== 음료수 목록 ==");
                for (int i = 0; i < ba.length; i++) {
                    System.out.println(i + ". " + ba[i] + ":" + price[i] + "원");
                }
                int ch = Integer.parseInt((sc.nextLine()));
                if (reminder < price[ch]) {
                    System.out.println("잔액이 부족합니다.");
                    continue;
                }
                System.out.println(ba[ch] + "를 뽑았습니다.");
                reminder = reminder - price[ch];
                System.out.println("잔액은 " + reminder + "원 입니다.");

            } else if (command == 3) {
                System.out.println("== 음료수 목록 ==");
                for (int i = 0; i < ba.length; i++) {
                    System.out.println(i + ". " + ba[i] + ":" + price[i] + "원");
                }

            } else if (command == 4) {
                System.out.println("현재 잔액은 " + reminder + "원 입니다.");

            } else if (command == 5) {
                System.out.println("자판기 프로그램을 종료합니다. 남은돈" + reminder + "원을 반환합니다.");
                break;

            }

        }


    }

}


// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 1
// 돈을 투입해주세요 : 2000
// 현재 투입된 금액은 2000원입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 4
// 현재 잔액은 2000원 입니다.


// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 3
// == 음료수 목록 ==
// 0. 콜라 : 1000원
// 1. 사이다 : 1200원
// 2. 커피 : 800원

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 2
// 음료수를 선택해주세요 : 0
// 콜라 를 뽑으셨습니다.
// 잔액은 1000 원입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 4
// 현재 잔액은 1000원 입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 3
// == 음료수 목록 ==
// 0. 콜라 : 1000원
// 1. 사이다 : 1200원
// 2. 커피 : 800원

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 2
// 음료수를 선택해주세요 : 1
// 잔액이 부족합니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 1
// 돈을 투입해주세요 : 200
// 현재 투입된 금액은 200원입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 4
// 현재 잔액은 1200원 입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 3
// == 음료수 목록 ==
// 0. 콜라 : 1000원
// 1. 사이다 : 1200원
// 2. 커피 : 800원

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 2
// 음료수를 선택해주세요 : 2
// 커피 를 뽑으셨습니다.
// 잔액은 400 원입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 5
// 자판기 프로그램을 종료합니다. 남은 돈 400원이 반환됩니다.
