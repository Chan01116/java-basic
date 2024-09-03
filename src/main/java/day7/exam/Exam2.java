package day7.exam;

public class Exam2 {
    public static void main(String[] args) {
//        Warrior w1 = new Warrior();
//
//        w1.age = 20;
//        w1.weapon = new Bow();
//        w1.weapon = new Spear();
//    }
//}
//class Warrior{
//    int age;
//    Weapons weapon;
//}
//class Weapons{
//
//}
//class Bow extends Weapons{
//    public void attck(){
//        System.out.println("활로 공격합니다.");
//    }
//
//}
//class Spear extends Weapons{
//    public void attck(){
//        System.out.println("창으로 공격합니다.");
//    }
//
//        전사 a전사 = new 전사();
//
//        String 이름 = "홍길동";
//        a전사.이름 = 이름;
//        a전사.나이 = 20;
//        a전사.자기소개();
//        // 안녕하세요 저는 20살 홍길동입니다.
//
//        a전사.a무기 = new 활();
//        a전사.공격();
//        // 출력 : 홍길동이/가 활로 공격합니다.
//
//        a전사.a무기 = new 칼();
//        a전사.공격();
//        // 출력 : 홍길동이/가 칼로 공격합니다.
//    }
//}
//
//class 전사 {
//    // 인스턴스 변수
//    String 이름;
//    // 인스턴스 변수
//    int 나이;
//    // 인스턴스 변수
//    무기 a무기;
//
//    public void 공격(){
//        System.out.println(이름 + "이/가 "+a무기+"로 공격합니다.");
//    }
//    void 자기소개() {
//        System.out.println("안녕하세요. 저는 " + 나이 + "살 " + 이름 + " 입니다.");
//    }
//}
//
//class 무기 {
//
//}
//
//class 칼 extends 무기 {
//    public void 공격(){
//        System.out.println("칼로 공격합니다.");
//    }
//
//}
//
//class 활 extends 무기 {
//    public void 공격(){
//        System.out.println("활로 공격합니다.");
//    }

//        Warrior warrior = new Warrior();
//
//        String name = "홍길동";
//        warrior.name = name;
//        warrior.age = 20;
//        warrior.introduce();
//        // 안녕하세요 저는 20살 홍길동입니다.
//
//        warrior.weapon = new Bow();
//        warrior.attack();
//        // 출력 : 홍길동이/가 활로 공격합니다.
//        warrior.useSkill();
//        // 출력 : 홍길동이/가 불화살 스킬을 사용합니다. 1.5배(15)의 피해를 입힙니다.
//
//        warrior.weapon = new Sword();
//        warrior.attack();
//        // 출력 : 홍길동이/가 칼로 공격합니다.
//        warrior.useSkill();
//        // 출력 : 홍길동이/가 연속 베기 스킬을 사용합니다. 2배(30)의 피해를 입힙니다.
//    }
//}
//class Warrior {
//    // 인스턴스 변수
//    String name;
//    // 인스턴스 변수
//    int age;
//    // 인스턴스 변수
//    Weapon weapon;
//    void attack(){
//        System.out.print(name+"이/가 ");
//        weapon.attack();
//    }
//
//    void introduce() {
//        System.out.println("안녕하세요. 저는 " + age + "살 " + name + " 입니다.");
//    }
//    void useSkill(){
//        System.out.print(name+"이/가 ");
//        weapon.useSkill();
//
//    }
//}
//
//class Weapon {
//    public void attack(){
//        System.out.println("기본공격");
//
//    }
//
//    public void useSkill() {
//        System.out.println("기본 스킬");
//    }
//}
//
//class Sword extends Weapon {
//    public void attack(){
//        System.out.println("검으로 공격합니다.");
//    }
//    public void useSkill(){
//        System.out.println("연속 베기 스킬을 사용합니다. 2배(30)의 피해를 입힙니다.");
//    }
//
//}
//
//class Bow extends Weapon {
//    public void attack(){
//        System.out.println("활로 공격합니다.");
//    }
//    public void useSkill(){
//        System.out.println("불화살 스킬을 사용합니다. 1.5배(15)의 피해를 입힙니다.");
//    }
//
//}
        Warrior warrior = new Warrior();

        String name = "홍길동";
        warrior.name = name;
        warrior.age = 20;
        warrior.introduce();
        // 안녕하세요 저는 20살 홍길동입니다.

        warrior.weapon = new Bow();
        warrior.attack();
        // 출력 : 홍길동이/가 활로 공격합니다.

        warrior.useSkill();
        // 출력 : 홍길동이/가 불화살 스킬을 사용합니다. 1.5배(15)의 피해를 입힙니다.

        warrior.weapon = new Sword();
        warrior.attack();
        // 출력 : 홍길동이/가 칼로 공격합니다.

        warrior.useSkill();
        // 출력 : 홍길동이/가 연속 베기 스킬을 사용합니다. 2배(30)의 피해를 입힙니다.
    }
}
class Warrior {
    // 인스턴스 변수
    String name;
    // 인스턴스 변수
    int age;
    // 인스턴스 변수
    Weapon weapon;

    void introduce() {
        System.out.println("안녕하세요. 저는 " + age + "살 " + name + " 입니다.");
    }
    void attack(){
        System.out.print(name + "이/가 ");
        weapon.attack();

    }
    void useSkill(){
        System.out.print(name + "이/가 ");
        weapon.useSkill();

    }
}

class Weapon {
    public void attack(){
        System.out.println("기본공격");
    }
    public void useSkill(){
        System.out.println("기본스킬");
    }

}

class Sword extends Weapon {
    public void attack(){
        System.out.println("칼로 공격합니다.");
    }
    public void useSkill(){
        System.out.println("연속 베기 스킬을 사용합니다. 2배(30)의 피해를 입힙니다.");

    }

}

class Bow extends Weapon {
    public void attack(){
        System.out.println("활로 공격합니다.");
    }
    public void useSkill(){
        System.out.println("불화살 스킬을 사용합니다. 1.5배(15)의 피해를 입힙니다.");

    }

}