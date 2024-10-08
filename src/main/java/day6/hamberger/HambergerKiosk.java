package day6.hamberger;

import java.util.ArrayList;
import java.util.Scanner;

public class HambergerKiosk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kiosk ki = new Kiosk();
        ArrayList<Buger> bugerscart = new ArrayList<>();
        ArrayList<Side> sidescart = new ArrayList<>();
        ArrayList<Beverage> beveragescart = new ArrayList<>();
        int reminder = 0;

        while (true) {
            System.out.print("1. 햄버거 선택\n2. 사이드 선택\n3. 음료수 선택\n4. 메뉴 취소\n5. 주문하기\n ======주문목록======\n");
            for(int i = 0; i < beveragescart.size(); i++){
                System.out.print("버거 : " + bugerscart.get(i));
                System.out.print("사이드 : " + sidescart.get(i));
                System.out.print("음료수 : " + beveragescart.get(i));
            }
            System.out.println("총금액 : ");
            reminder :
            System.out.print("무엇을 하시겠습니까? : ");
            int menu = Integer.parseInt(sc.nextLine());
            if (menu == 1) {
                System.out.println("===햄버거 목록===");
                ki.bugersmenu();
                System.out.print("어떤 버거를 고르시겠습니까? : ");
                int target = Integer.parseInt(sc.nextLine()) - 1;
                Buger selectbuger = ki.getBugers(target);
                bugerscart.add(selectbuger);
                System.out.println(selectbuger.name+ "을/를 고르셨습니다.");
            }
            else if (menu == 2){System.out.println("===사이드 목록===");
                ki.sidemenu();
                System.out.print("어떤 사이드를 고르시겠습니까? : ");
                int target = Integer.parseInt(sc.nextLine()) -1;
                Side selecside = ki.getSides(target);
                sidescart.add(selecside);
                System.out.println(selecside.name+ "을/를 고르셨습니다.");
            }
            else if (menu == 3){System.out.println("===음료수 목록===");
                ki.beberagemenu();
                System.out.print("어떤 음료수를 고르시겠습니까? : ");
                int target = Integer.parseInt(sc.nextLine()) -1;
                Beverage selectbeverage = ki.getBeverage(target);
                beveragescart.add(selectbeverage);
                System.out.println(selectbeverage.name + "을/를 고르셨습니다.");
            } else if (menu == 4) {
                System.out.println("어떤 메뉴를 취소 하시겠습니까?\n1. 버거\n2. 사이드\n3. 음료수");
                int target = Integer.parseInt(sc.nextLine()) +1;


            } else if (menu == 6) {
                break;

            }
        }

        // 햄버거 키오스크 v1
        // 1. 햄버거 선택
        // 2. 사이드 선택
        // 3. 음료수 선택
        // 4. 메뉴 취소
        // 5. 주문 하기
        //====== 주문 목록 =====
        // 버거: []
        // 사이드 : []
        // 음료수 : []
        // 총금액 : 0
        // 무엇을 하시겠습니까 : 1

        // === 햄버거 목록 ===
        // 1. 한우불고기버거 6000
        // 2. 치즈버거 3000
        // 3. 치킨버거 3500
        // 4. 새우버거 3200
        // 어떤 버거를 고르시겠습니까 : 1
        // 한우불고기버거를 고르셨습니다.


        // ================================================================


        // 햄버거 키오스크 v1
        // 1. 햄버거 선택
        // 2. 사이드 선택
        // 3. 음료수 선택
        // 4. 메뉴 취소
        // 5. 주문 하기
        //====== 주문 목록 =====
        // 버거: [한우불고기버거]
        // 사이드 : []
        // 음료수 : []
        // 총금액 : 6000
        // 무엇을 하시겠습니까 : 2

        // === 사이드 목록 ===
        // 1. 감자튀김 1800
        // 2. 치즈스틱 2000
        // 3. 치킨너겟 2500
        // 4. 오징어링 2700
        // 어떤 사이드를 고르시겠습니까 : 2
        // 치즈스틱을 고르셨습니다.

        // ================================================================

        // 햄버거 키오스크 v1
        // 1. 햄버거 선택
        // 2. 사이드 선택
        // 3. 음료수 선택
        // 4. 메뉴 취소
        // 5. 주문 하기
        //====== 주문 목록 =====
        // 버거: [한우불고기버거]
        // 사이드 : [치즈스틱]
        // 음료수 : []
        // 총금액 : 8000
        // 무엇을 하시겠습니까 : 2

        // === 사이드 목록 ===
        // 1. 감자튀김 1800
        // 2. 치즈스틱 2000
        // 3. 치킨너겟 2500
        // 4. 오징어링 2700
        // 어떤 사이드를 고르시겠습니까 : 1
        // 감자튀김을 고르셨습니다.

        // ================================================================

        // 햄버거 키오스크 v1
        // 1. 햄버거 선택
        // 2. 사이드 선택
        // 3. 음료수 선택
        // 4. 메뉴 취소
        // 5. 주문 하기
        //====== 주문 목록 =====
        // 버거: [한우불고기버거]
        // 사이드 : [치즈스틱, 감자튀김]
        // 음료수 : []
        // 총금액 : 9800
        // 무엇을 하시겠습니까 : 3

        // === 음료수 목록 ===
        // 1. 콜라 1000
        // 2. 에이드 2000
        // 3. 커피 1500
        // 4. 쉐이크 2500
        // 어떤 음료수를 고르시겠습니까 : 2
        // 에이드를 고르셨습니다.

        // ================================================================

        // 햄버거 키오스크 v1
        // 1. 햄버거 선택
        // 2. 사이드 선택
        // 3. 음료수 선택
        // 4. 메뉴 취소
        // 5. 주문 하기
        //====== 주문 목록 =====
        // 버거: [한우불고기버거]
        // 사이드 : [치즈스틱, 감자튀김]
        // 음료수 : [에이드]
        // 총금액 : 11800
        // 무엇을 하시겠습니까 : 4

        // 어떤 메뉴를 취소하겠습니까?
        // 1. 버거
        // 2. 사이드
        // 3. 음료수
        // 선택 : 2

        // 품목을 선택해주세요.
        // 1. 치즈스틱
        // 2. 감자튀김
        // 선택 : 1
        // 치즈스틱이 취소되었습니다.

        // ================================================================

        // 햄버거 키오스크 v1
        // 1. 햄버거 선택
        // 2. 사이드 선택
        // 3. 음료수 선택
        // 4. 메뉴 취소
        // 5. 주문 하기
        //====== 주문 목록 =====
        // 버거: [한우불고기버거]
        // 사이드 : [감자튀김]
        // 음료수 : [에이드]
        // 총금액 : 9800
        // 무엇을 하시겠습니까 : 5

        // 정말 주문하시겠습니까?(y/n) : y
        // 결제 금액을 입력해주세요 : 20000

        // 영수증 발급하시겠습니까?(y/n) : y

        // ==== 영수증 =====
        // 버거: [한우불고기버거]
        // 사이드 : [감자튀김]
        // 음료수 : [에이드]
        // 총금액 : 9800
        //==================

        // 거스름든 : 10200원
        // 이용해주셔서 감사합니다.

        // ================================================================
    }
}
