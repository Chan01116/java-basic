package day6.vendingExam;

import java.util.ArrayList;

public class VendingMachine {
//    int remainder = 0;
//    String[] target = {"콜라", "사이다", "커피"};
//    int[] price = {1000, 1200, 800};


    //    public int inputMoney(int input){
//        remainder = remainder + input;
//        return input;
//
//    }
//    public int getRemainder(){
//        System.out.println(remainder);
//        return remainder;
//
//    }
//    public void printBeverages(){
//        for(int  i = 0; i < target.length; i++){
//            System.out.println("== 음료수 목록==\n" + i + " .  "+target[i]+" : "+ price[i]+"원");
//        }
//    }
//    public void selectBeverage(int num){
//        for(int i = 0; i < target.length; i++){
//            System.out.println(target[i]);
//        }
//
//        }






//    int remainder = 0;
//    String[] target = {"콜라", "사이다", "커피"};
//    int[] price = {1000, 1200, 800};
//    int[] stock = {1, 2, 1};
//
//
//    // 돈을 투입하는 메서드
//    public void inputMoney(int input) {
//        remainder += input;
//        System.out.println(input + "원이 투입되었습니다.");
//    }
//
//    // 현재 잔액을 반환하는 메서드
//    public int getRemainder() {
//        return remainder;
//    }
//
//    // 음료 목록을 출력하는 메서드
//    public void printBeverages() {
//        System.out.println("== 음료수 목록 ==");
//        for (int i = 0; i < target.length; i++) {
//            System.out.println(i + " . " + target[i] + " : " + price[i] + "원, 남은 수량 : " + stock[i]);
//        }
//    }
//
//    //음료를 선택하는 메서드
//    public String selectBeverage(int num) {
//        if (num < 0 || num >= target.length) {
//            return "유효하지 않은 음료 코드입니다.";
//        }
//
//        if (remainder < price[num]) {
//            return "잔액이 부족합니다.";
//        }
//
//        if (stock[num] <= 0){
//            return  "수량이 부족합니다.";
//
//        }
//        remainder -= price[num];
//        stock[num]--;
//        return target[num] + "을/를 뽑으셨습니다.";


//        }
    // 값을 세팅 X
    // 연습용으로 하나의 객체만 사용할 때는 미리 넣어 두는 것이 편하니까 그냥 넣어둠
    int remainder = 0;
//    String[] ba = {"콜라", "사이다", "커피"};
//    int[] price = {1000, 1200, 800};
//    int[] stock = {1, 2, 1};
    ArrayList<Beverage> beverages = new ArrayList<>();
    public VendingMachine(){
        Beverage b1 = new Beverage("콜라", 1000, 1);
        Beverage b2 = new Beverage("사이다", 1200, 2);
        Beverage b3 = new Beverage("커피", 800, 1);
        beverages.add(b1);
        beverages.add(b2);
        beverages.add(b3);
    }

    public void inputMoney(int money){
//        remainder = remainder + money; //증감연산
        // 증감연산의 경우 짧게 표현하는 방법 존재
        remainder += money; // 위와 같은 코드
    }
    public String selectBeverage(int target){
        Beverage beverage = beverages.get(target);///다시 생각====================================
        if(beverage.stock <= 0){
            return "수량이 부족합니다.";
        }
        if(beverage.price > remainder){
            return "잔액 부족"; // return 하게 되면 메서드는 거기서 종료 더이상 밑으로 안내려감.
        }
//        remainder = remainder - price[target];
        remainder -= beverage.price;//위와 같은 코드
//        stock[target] = stock[target] - 1;
        beverage.stock--; //위와 같은 코드
        return beverage.name;

    }

    public int getRemainder(){
        return remainder;
    }
    public void printBeverages(){
        System.out.println("== 음료수 목록==");
        for(int  i = 0; i < beverages.size(); i++){
            System.out.println( + i + " .  "+beverages.get(i).name+" : "+ beverages.get(i).price+"원, 남은 수량 : " + beverages.get(i).stock);
        }

    }

    }


