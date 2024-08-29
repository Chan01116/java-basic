package day5.arrayListInt;

import java.util.ArrayList;

public class Test {
    int a = 10; // 변수선언 => 선언과 동시에 초기화
//    int a; // 변수 선언
//    a = 10; //대입 연산
//    // 멸령 코드 => 연산 은 class에서 실행 불가능. => 연산은 메서드에서만 가능
//    // 클래스에는 변수, 메서드 밖에 못옴
//
//    a = 20; // 대입연산
//    a++; // 증가 연산

    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>(){{
        add("apple");
        add("banana");
    }}; // ArrayList 선언과 동시에 초기화
}
