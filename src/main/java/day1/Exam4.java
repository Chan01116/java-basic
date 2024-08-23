package day1;

public class Exam4 {public static void main(String[] args) {
    //홀수와 짝수를 구별해주세요.
    // num이 짝수면 even, 홀수면 odd 출력해주세요.
    // 짝수 판별 : 2로 나누어서 떨어지면 짝수


    int num = 321875;

    if (num % 2 == 0) {
        System.out.println("even");
    }
    else {
        System.out.println("odd");
    }

    // 두수 num1과 num2가 주어집니다.
    // 두 수중 더 큰수에서 더 작은 수를 뺀 결과를 출력해주세요.

    int num1 = 20;
    int num2 = 10;

    if(num2 > num1) {
        System.out.println(num2 - num1);
    }
    if(num1 > num2) {
        System.out.println(num1 - num2);
    }

    // 문제 : 할인 대상인지 아닌지 출력해주세요.
    // 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
    // 조건 : 출력예시 처럼 출력되어야 합니다.
    // 조건 : `구현시작` 부분만 수정 할 수 있습니다..
    // 조건 : 2가지 이상의 방법으로 풀어야 합니다.

    int age = 19; // 이 값을 바꿔가면서 실행해보세요.

    System.out.println("당신의 나이는 " + age + "살 입니다.");

    // 구현시작
    if(age <=19) {
        if(age >=60) {
        System.out.println("할인대상입니다.");
        }
    }


    // 구현 끝

    // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
}
}
