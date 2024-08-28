package day4.vendingExam;

public class VendingMachine {
    int remainder = 0;
    String[] target = {"콜라", "사이다", "커피"};
    int[] price = {1000, 1200, 800};



    public int inputMoney(int input){
        remainder = remainder + input;
        return input;

    }
    public int getRemainder(){
        System.out.println(remainder);
        return remainder;

    }
    public void printBeverages(){
        for(int  i = 0; i < target.length; i++){
            System.out.println("== 음료수 목록==\n" + i + " .  "+target[i]+" : "+ price[i]+"원");
        }
    }
    public void selectBeverage(int num){
        for(int i = 0; i < target.length; i++){
            System.out.println(target[i]);
        }

        }

    }

