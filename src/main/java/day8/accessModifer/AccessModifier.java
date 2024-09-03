package day8.accessModifer;
// 접근제어자
public class AccessModifier {
    public static void main(String[] args) {

        // 자원(변수 + 메서드)에 접근할 수 있는 권한.
        // public : 모두 사용 가능
        // private : 자신만 사용 가능


        // 몰라도 됨    // protected : 상속 관계 + 같은 폴더 안에 있는 객체끼리 사용 가능
        // 몰라도 됨  // default : 같은 폴더 안에 있는 객체끼리 사용 가능

        Calculator c1 = new Calculator();
        c1.divide();
//        c1.num2 = 0; // 여기서 0을 넣은게 문제의 원인. 누구나 접근해서 바꿔버릴수 있음. private를 이용해 Calulator의 데이터를 보호할 수 있다.
        c1.divide();

        // c1.num1 = 10; 넘1이 프라이빗이라 접근 불가능
        c1.setNum1(10); // 셋넘메서드는 퍼블릭이라 접근 가능
        c1.setNum2(0);
        c1.divide();
        System.out.println(c1.getNum1());


        // 객체 변수는 객체 내의 모든 메서드에 영향을 주므로 외부의 접근 일반적으로 private으로 막는다.
        // 변수에 접근이 필요하면 getter 와 setter 메서드를 public으로 만들어 사용한다.

        Person p1 = new Person();
        p1.setId(20);

        System.out.println("제 번호는 " + p1.getId(20)+ " 입니다.");
        // 출력 : 제 번호는 20 입니다.


    }

}


