package day6.objectArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectArrayList {
    public static void main(String[] args) {

        String name1 = "홍길동";
        int age1 = 21;

        ArrayList<String> names = new ArrayList<>();
        names.add(name1);
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(age1);

        Person p1 = new Person();
        p1.name = name1;

        //
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> Persons = new ArrayList<>();
        while (true){
            System.out.println("이름입력 : ");
            String name = sc.nextLine();

            System.out.println("나이입력 : ");
            int age = Integer.parseInt(sc.nextLine());

            // 지역변수 => 특정 지역에서 만들어져서 지역이 끝나면 사라진다.
            Person p2 = new Person();
            Persons.add(p2); // p2 변수가 사자지기전에 p2에 저장된 person 리모콘을 배열에 저장

            // 객체 -> 리모컨(참조값)
            // 객체 -> 변수(상태) + 메서드(동작)




        }


    }
}
