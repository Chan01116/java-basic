package day8.staticExam2;

public class IntNum {
            static int num = 10;
        public static void printValue(String name){
            System.out.println(name);
        }
        public static void main(String[] args) {
            // static이 붙은 메서드는 static이 붙지 않은 것은 사용 불가
            System.out.println(num); // 출력 : 10

            printValue("안녕");
            // 출력 : 안녕
        }
    }
