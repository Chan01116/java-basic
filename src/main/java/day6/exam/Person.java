package day6.exam;

public class Person {
    int age;
    String name;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("사람이 태어납니다.");
    }//맨위에 있는 것이 좋음
    public void introduce(){
//        System.out.println("안녕하세요 "+ age +"살 "+ name +"입니다.");
        System.out.printf("안녕하세요 %d살 %s입니다.\n", age, name); // d는 숫자 s는 문자 순서대로 단 줄바꿈은 안됨
    }

    //this는 메서드를 수행하는 객체를 의미한다.
}
