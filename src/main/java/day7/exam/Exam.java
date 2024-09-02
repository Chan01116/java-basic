package day7.exam;

public class Exam {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        p1.arm = new Arm(); // Arm 타입.

        System.out.println(p1.arm.length + "cm"); // .왼쪽에 있는 것이 가지고 있는것
        // 출력 : 100cm


        // 객체가 가지고 있는 변수, 메서드
        // ()있므면


//        Weapon w1 = new Sword();
//        w1.attck();
//        // 출력 : 칼로 공격합니다.
//        w1 = new Arrow();
//        w1.attck();
//        // 출력 : 활로 공격합니다.

    }
}
//class Weapon{
//
//}
//class Arrow extends Weapon{
//
//}
//class Sword extends Weapon{
//
//}




//class Weapon{
//    public void attck(){
//
//    }
//    }
//class Sword extends Weapon{
//    public void attck(){
//        System.out.println("칼로 공격합니다.");
//    }
//
//}
//class Arrow extends Weapon{
//    public void attck(){
//        System.out.println("활로 공격합니다.");
//    }
//
//}

class Arm{
//    int length = 100;
    int length;
    public Arm(){
        length = 100;
    }

}
class Person {
    int age;
//    ?? arm;
    Arm arm;// Arm은 Arm 그러므로 Arm 클래스를 만들어야함
}
