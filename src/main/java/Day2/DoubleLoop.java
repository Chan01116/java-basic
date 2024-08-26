package Day2;

public class DoubleLoop {
    public static void main(String[] args) {
        // while, for

        //
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
        }


        // 구구단 2단 만들기

        // 2 X 1 = 2
        // 2 X 2 = 4
        // 2 X 3 = 6
        // ...
        // 2 X 9 = 18


        //for(int i = 1; i <= 9; i++) {
        //System.out.println(i + "X" + i + (i*2));


        // 해답

        //int dan = 3;
        for (int dan2 = 2; dan2 <= 9; dan2++) {
            for (int i = 1; i <= 9; i++)
                System.out.println(dan2 + "X" + i + "=" + (dan2 * i));
        }
        // 개인이 최대한  고민할 수 있는 시간 정한다.
        // 검색 (구글, gpt)을 통해 해결()
        // 선생님께 질문

        // 문제 : 구구단 작성
        // 조건 : 짝수번째만 곱하기
        // /* 출력예시 :  2 * 2 = 4
        // 2 * 4 = 8
        // 2 * 6 = 12
        // 2 * 8 = 16
        // ...
        // 9단까지 이런식으로 나오면 됩니다.

        for (int dan3 = 2; dan3 <= 9; dan3++) {
            for (int j = 1; j <= 9; j++) {
                if (j % 2 == 0)
                    System.out.println(dan3 + "X" + j + "=" + (dan3 * j));
            }

        }

        // 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.
        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        /*  입출력 예시
            n은 4, m은 20, limit는 10
                5 * 2 = 10
                5 * 4 = 20
                5 * 6 = 30
                5 * 8 = 40
                5 * 10 = 50
                7 * 2 = 14
                7 * 4 = 28
                7 * 6 = 42
                7 * 8 = 56
                7 * 10 = 70
                ...
                ...
                19 * 2 = 38
                19 * 4 = 76
                19 * 6 = 114
                19 * 8 = 152
                19 * 10 = 190
                */
        //for (int dan4 = n; dan4 <=limit; m) {
            //if(dan4 % 2 !== 0 ) {
              //  System.out.println(dan4 + "X" + );
            }
        }



