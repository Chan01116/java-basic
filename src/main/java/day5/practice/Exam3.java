package day5.practice;

import java.util.ArrayList;

public class Exam3 {
    public static void main(String[] args) {

        // 사람 새성
        // 이름, 나이로 생성

//        ArrayList<String> names = new ArrayList<>();
//        ArrayList<Integer> ages = new ArrayList<>();
//
//        names.add("홍길동");
//        names.add("이순신");
//        names.add("임꺽정");
//        names.add("황진이");
//
//        ages.add(20);
//        ages.add(30);
//        ages.add(35);
//        ages.add(40);
//
//        for(int i = 0; i < names.size(); i++){
//            System.out.println("안녕하세요 "+ages.get(i)+"살"+names.get(i)+" 입니다.");
//        }
//        names.remove(1);
//        ages.remove(1);
//        System.out.println("===========================================");
//        for(int i = 0; i < names.size(); i++){
//            System.out.println("안녕하세요 "+ages.get(i)+"살"+names.get(i)+" 입니다.");
//        }
//
//        Person p1 = new Person();
//        p1.age = 24;
//        p1.name = "홍길동";
//
//        Person p2 = new Person();
//        p2.age = 30;
//        p2.name = "이순신";
//
//        Person p3 = new Person();
//        p3.age = 41;
//        p3.name = "을지문덕";
//
//        Person p4 = new Person();
//        p4.age = 32;
//        p4.name = "황진이";
//
//        ArrayList<Person> people = new ArrayList<>();
//        people.add(p1);
//        people.add(p2);
//        people.add(p3);
//        people.add(p4);
//
//        Person p5 = people.get(0);
//        System.out.println(p5.name);
//
//        for (int i = 0; i < people.size(); i++) {
//            Person p = people.get(i);
//            System.out.println(p.name);
//        }
//        people.remove(1);
//        System.out.println("=======================");
//        for (int i = 0; i < people.size(); i++) {
//            Person p = people.get(i);
//            System.out.println(p.name);
//            //2개 이상의 데이터로 표현되는 개념, 사물은 무조건 객체로 만들어라.
//
//
//        }

        Person p1 = new Person();
        p1.age = 24;
        p1.name = "홍길동";

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";

        Person p3 = new Person();
        p3.age = 41;
        p3.name = "을지문덕";

        Person p4 = new Person();
        p4.age = 32;
        p4.name = "황진이";



        ArrayList<Person> p = new ArrayList<>();
        // 1. 네 사람을 ArrayList에 저장
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        // 2. 네 사람에게 자기소개 시키기 (자기소개 문구 : 안녕하세요 ~~살 ~~~입니다.)
        for(int i = 0; i < p.size(); i++){
            Person a = p.get(i);
            a.introduce();
        }
        // 3. 30대인 사람에게만 자기소개 시키기






    }
}
