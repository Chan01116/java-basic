package Day3;

public class Object {
    public static void main(String[] args) {

        //폴더 -> 배열
        //폴더 -> 숫자 문자 가리지 않고 다 저장 가능한 개념 ==> 객체
        //사람을 표현하는 방법은 무한가지.
        //자바는 변수 저장할 때 자료형을 요구
        //객체는 먼저 어떻게 생겼는지 저의되어야 자바가 만들어 줄 수있다. -> 설계도(class)를 먼저 만들다
        // new 를 할때 마다 객체(인스턴스)를 새로 만든다.

        int a;

        Person hong; //폴더가 만들어 졌는가? X
        hong = new Person(); //Person 설계도에 따라서 객체를 하나 만들어줘. 그라고 c 변수에 담아줘
        Person lee = new Person();

        hong.name = "hong";
        hong.age = 20;
        hong.home = "서울";
        lee.name = "lee";
        lee.age = 30;
        lee.home = "대전";

        System.out.println(hong.age + "살, "+ hong.home +" 사는 " + hong.name+ "입니다.");
        System.out.println(lee.age + "살, "+ lee.home +" 사는 " + lee.name+ "입니다.");
    }
}
