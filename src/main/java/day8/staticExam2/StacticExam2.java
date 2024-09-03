package day8.staticExam2;

public class StacticExam2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.이름 = "홍길동";
        p1.나이 = 22;

        p1.자기소개();
        // 출력 : 저는 22살 홍길동 입니다.

        Person p2 = new Person();
        p2.이름 = "홍길순";
        p2.나이 = 25;

        p2.자기소개();
        // 출력 : 저는 25살 홍길순 입니다.

        p1.자기소개();
        // 출력 : 저는 22살 홍길동 입니다.
    }
    }
    class Person{
        int 나이;
        String 이름;

        public void 자기소개() {
            System.out.println("저는 " + 나이 + "살 " + 이름 + " 입니다.");
        }
    }
