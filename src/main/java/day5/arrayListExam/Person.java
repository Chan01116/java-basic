package day5.arrayListExam;

import java.util.ArrayList;

public class Person {
    ArrayList<String> person = new ArrayList<>();
    int age;
    String name;
    public void introduce(){
        System.out.println("안녕하세요 "+ age +"살 "+ name +"입니다.");

    }
}
