package day7.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.breath();
        Cat c1 = new Cat();
        c1.meow();
        c1.breath();
        // 중복 <- 가장 기피해야할 행위
        Person p1 = new Person();
        p1.breathe();

    }
}


class Person{
    public void breathe(){
        System.out.println("숨쉬다");
    }
}
