package day6.aaa;

import day6.hamberger.Buger;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Buger> burgers = new ArrayList<>();
        ArrayList<Buger> burgercart = new ArrayList<>();
        while (true){
            System.out.println("1. 햄버거 선택");
            System.out.println("2. 사이드 선택");
            System.out.println("3. 음료수 선택");
            System.out.println("4. 메뉴 취소");
            int menu = Integer.parseInt(sc.nextLine());
            // 5. 주문 하기
        }
    }
}
