package Day3.method;

public class CarExam1 {
    public static void main(String[] args) {
        // 문제 : 자동차가 3번 달리게 해주세요.
        // 출력 : 자동차가 달립니다.
        //v1. 1개의 자동차가 3번 달리게 해주세요.

        //v2. 3개의 자동차가 1번씩 달리게 해주세요.

        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        Car c1 = new Car();
        c1.color = "black";
        Car c2 = new Car();
        c2.color = "red";
        Car c3 = new Car();
        c3.color = "white";
        c1.rush();
        c1.rush();
        c1.rush();
        c1.rush();
        c2.rush();
        c3.rush();
    }
}
