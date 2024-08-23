package day1;

public class Print {
// 주석(comment) : 사람이 보기 우한 코멘트. 컴퓨터는 무시합니다. 한줄주석
// 여러줄 주석 :  컨트롤 + /
    //프로그램 명령어(코드)는 위에서 아래로 순차 실행.
    public static void main(String args[]){//출력 -> System.out.print() 괄호안의 값을 콘솔에 출력
        System.out.print(100);
        System.out.print(777);


        // 출력 -> System.out.println() 출력후 줄바꿈해주는 멸령어
        System.out.println(100);
        System.out.println(777);

        //문자의 경우는 ""를 이용해 구별해야 한다.
        System.out.println("채형찬");

        // 더하기
        System.out.println(100+200);

        // "100 + 200 = 300"전체를 표현하고 싶을경우
        // 숫자 + 숫자 = 더하기 산술 연산
        // 문자 + 문자 = 이어 붙이기
        // 문자 + 숫자 = 숫자가 문자가 되어서 이어 붙이기
        System.out.println("100+200=300");
        System.out.println("100+200=" + 300);
        System.out.println("100+200="+ (100+200));

        // 하나의 출력문에서 줄꿈하기
        // 줄바꿈 문자 :\n
        System.out.println("안녕하세요\n반갑습니다.");


        // 구구단 2단을 System.out.println 한번만 사용 해서 출력해주세요.
            //System.out.println(" 2 x 1 = "+ (2*1)+\n" 2 x 2 = "+ (2*2)); // 오답
        System.out.println("2 x 1 = " + (2 * 1) + "\n2 x 2 = " + (2 * 2) +
                "\n2 x 3 = " + (2 * 3) + "\n2 x 4 = " + (2 * 4) +
                "\n2 x 5 = " + (2 * 5) + "\n2 x 6 = " + (2 * 6) + "\n2 x 7 = " + (2 * 7)+"\n2 x 8 = " + (2 * 8) +
                        "\n2 x 9 = " + (2 * 9));
        //풀이 System.out.println("2 X 1 = "+ (2*1) + "\n2 X 2 = (2*2)")

    }
}
