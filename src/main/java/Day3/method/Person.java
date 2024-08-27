package Day3.method;
// 객체(사물 표현) -> 상태/동작 -> 변수와 메서드의 집합이다.
public class Person {

    // 변수는 상태를 표현한다.
    int age;
    public String name;

    //메서드는  동작(연산)을 표현한다.

    // 접근제어자 리턴타입 메서드명 (매개변수) { 내용 }
    // 동작은 일단 쉽게 출력으로 대체할 것임.
    public void walk(){
        System.out.println("사람이 걷습니다.");
    }

    // 매게변수
    public void introduce() {
        System.out.println("안녕하세요 "+ age + "살" + name +"입니다.");
    }

}
