package Day3;

import java.util.Scanner;

// 명명 규칙
// 크래스명은 대문자로 시작
// 의미가 바뀔 때 대문자로 구분. 두단어 이상의 조합으로 이름 지을 때 의가 바뀌면 바뀌는 단어는 앞문자를 대문자로
// 카멜 표기법
// 함수나 변수는 소문자로 시작.
// 상수는 모두 대문자 띄어쓰기는 _
public class NameApp {
    public static void main(String[] args) {

        // 명령어 입력 : help
        // add : 이름 입력
        // list : 이름 목록
        // exit : 종료
        // 명령어 입력 : add
        // 이름을 입력해주세요 : john
        // john이 명부에 저장되었습니다.
        // 명령어 입력 : list
        // ===== 이름 목록 =====
        // 1. john
        // =====================
        // 명령어 입력 : add
        // 이름을 입력해주세요 : tomas
        // tomas이 명부에 저장되었습니다.
        // 명령어 입력 : add
        // 이름을 입력해주세요 : chris
        // chris이 명부에 저장되었습니다.
        // 명령어 입력 : list
        // ===== 이름 목록 =====
        // 1. john
        // 2. tomas
        // 3. chris
        // =====================
        // 명령어 입력 : exit
        // 이름 프로그램이 종료됩니다.
        // 배열이 어려우면 일단 한명의 이름을 저장하고 출력해본다.

        // 문자는 .equals를 통해서한다
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("명령어 입력 :  ");
//            String ch = sc.nextLine();
//            if (ch.equals("help")) {
//                System.out.println("add : 이름입력");
//                System.out.println("list : 이름목록");
//                System.out.println("exit : 종료");
//            } else if (ch.equals("add")) {
//                System.out.print("이름입력 : ");
//                String ch2 = sc.nextLine();
//                String[] arr = new String[1000];
//                String name;
//                name = sc.nextLine();
//            } else if (ch.equals("list")) {
//                System.out.println("=====이름목록====");
//                System.out.println("1" + arr[1]);
//            } else if (ch.equals("exit")) ;
//                System.out.println("이프로그램이 종료됩니다.");
//                break;
//
//        }
//        Scanner sc = new Scanner(System.in);
//
//        while(true) {
//            System.out.print("명령어 : ");
//            String command = sc.nextLine();
//
//            if(command.equals("help")) {
//                System.out.println("help");
//            } else if(command.equals("add")) {
//                System.out.println("add");
//            } else if(command.equals("list")) {
//                System.out.println("list");
//            } else if(command.equals("exit")) {
//                System.out.println("exit");
//            }
//        }

    }
}
