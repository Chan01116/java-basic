package Day3;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class InputGarbage {
    public static void main(String[] args) {
        // 이름 입력 : 홍길동
        // 나이 입력 : 24
        // 숫자를 입력받을 때 문자로 받고 숫자로 변환

        int num = Integer.parseInt("123");

        Scanner sc = new Scanner(System.in);
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("나이 : ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println();
    }
}
