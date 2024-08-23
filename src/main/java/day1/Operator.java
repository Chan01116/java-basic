package day1;

public class Operator {
    public static void main(String[] args) {
        // 산술 연산자
        // + - * / %(나머지)
        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        System.out.println(10 % 5);


        System.out.println(10 / 3); //정수
        System.out.println(10.0 / 3.0); // 실수
        System.out.println(10 % 3); // 나머지 구하는 공식

        // 비교 연산자 -> 논리값으로 결과가 나옴
        // <,>,<=,>=, ,==, !=
        // 논리값 앞에 !을 붙이면 반대값

        System.out.println(10 > 5); //맞음.
        System.out.println(10 < 5); //틀림.
        System.out.println(100); // 숫자
        System.out.println("100"); // 문자
        System.out.println();
        System.out.println();

        // 자료형(타입)
        //숫자(정수) - int, 문자 - String, 숫자(실수) - double, 논리값(참/거짓) - boolean

    }
}