package day6.exam;

public class Car {
    String model;
    String color;
    int speed;
    public Car(){
        System.out.println("자동차가 만들어 집니다.");
    }
    public void drive(){
        System.out.println(color+ model +"이 "+speed+"km로 달립니다.");
        System.out.printf("%s %s 이/가 %dkm로 달립니다. ", color, model, speed);//원래는 this를 붙여야함
    }
}
