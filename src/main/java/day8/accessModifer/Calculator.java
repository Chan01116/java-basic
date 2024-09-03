package day8.accessModifer;

public class Calculator {
    private int num1 = 10;
    private int num2 = 2;


    // 메서드는 변수를 사용해서 작동하는게 대부분.
    // 객체의 변수에 잘못된 데이터가 들어오면 메서드가 고장난다.
    // 객체의 변수는 함부로 바꾸면 안된다.
    public void divide() {
        System.out.println(num1 / num2);
    }

    //넘1을 세팅할수 있는 메서드 퍼블릭으로 열어놈



    // setter
    // 명명규칙 set변수명() -> 카멜표기법!!!!!!
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    // 메서드로 하는 이유 안전장치를 마련할수 있다.
    public void setNum2(int num2) {
        if(num2 == 0){
            System.out.println("0은 나눌 수 없습니다. 기본값이 1로 초기화합니다.");
            num2 = 1;
        }
        this.num2 = num2;
    }

    // getter
    // 명명규칙 -> get변수명() => 카멜표기법 적용!!!!!!!!!!!!
    public int getNum1(){
        return num1;
    }


}
