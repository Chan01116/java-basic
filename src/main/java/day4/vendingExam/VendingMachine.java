package day4.vendingExam;

public class VendingMachine {
    int remainder = 0;
    public int inputMoney(int input){
        remainder = remainder + input;
        return input;

    }
    public void getRemainder(int num){
        System.out.println(remainder); return;

    }

}
