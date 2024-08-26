package Day2;

public class Day2shape {
    public static void main(String[] args) {
//        for(int heigt = 0; heigt < 5; heigt++) {
//            for(int width = 0; width <8; width++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        int higt = 5; // 출력할 줄의 수
//
//        // 행을 반복합니다 (1부터 lines까지)
//        for (int i = 1; i <= higt; i++) {
//            // 열을 반복합니다 (1부터 i까지)
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*"); // 별을 출력
//            }
//            System.out.println(); // 줄바꿈
//        }


//        int lines = 3; // 출력할 줄의 수
//
//        // 행을 반복합니다 (1부터 lines까지)
//        for (int i = 1; i <= lines; i++) {
//            // 공백을 출력합니다 (줄 수 - 현재 줄 수만큼)
//            for (int j = 1; j <= lines - i; j++) {
//                System.out.print(" ");
//            }
//            // 별을 출력합니다 (현재 줄 수만큼)
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            // 줄바꿈
//            System.out.println();
//        }
//        int h = 5;
//        for (int i = 1; i <= h; i++){
//            for(int j = 1; j <= h - i; j++){
//                System.out.print(" ");
//            }
//            for (int k = 1; k<= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int h = 3;
        for (int i = 1; i <= h; i++){
            for(int j = 1; j<=h-i; j++){
                System.out.println(" ");
            }
        }

    }
}

