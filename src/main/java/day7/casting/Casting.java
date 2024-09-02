package day7.casting;

public class Casting {
    public static void main(String[] args) {
        // 자바의 대전제
        // 자료형(타입)이 같은 것만 변수에 저장해준다. int는 int String은 String

//        int num = 10; // 정수 변수
//        double num2 = 10.1; // 실수 변수
////        num = num2; // num2값을 num에 대입 => X double 타입이 int 타입에 대입될 수 없다.
//        num2 = num; // num의 값을 num2에 대입 => O int 타입이 double 타입에 대입되었다 -> X
        // int 타입이 double 타입으로 모습을 바꿔서(형변환) 대입되었다.(O)

        //정수가 실수가 되는 것은 안전.  정수에 .0하면 실수
        // 실수를 정수가 되는 것은??  위험하다.  3.14 -> 3 어거지로 만든다
        // 안전한 변환은 자바가 대신 자동으로 해줌. (자동형변환)
        //위험한 변환은 자바가 막음. 에러가 나고. 개발자가 강제로 변환은 가능(수동형변환)

//        num2 = num; // 안전한 자동 형변환
//        num = (int)num2; // 값 앞에 ()표현으로 형변환을 강제로 시도할 수 있다. 이경우는 int 값으로 강제 형변환

        // 변수는 수정하지 않습니다.
        int num1 = 10;
        int num2 = 4;


        // 정수는 정수끼리만 계산 -> 정수는 계산 결과는 정수
        // 실수는 실수끼리만 계산 -> 실수 계산 결과는 실수
        System.out.println((double) num1 / (double) num2); // 출력 : 2.5

    }
}
