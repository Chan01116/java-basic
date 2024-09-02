package day7;

public class LeeCorparation {
    public static void main(String[] args) {

        // Kildong이와 Kilsoon이를 고용해서 leeCorp가 java와 python 수주가 가능하도록 해주세요

//        int a = 10;

        LeeCorp leeCorp = new LeeCorp();
//        leeCorp.kildong = new Kildong();
        leeCorp.kildong = new Jinee();
        leeCorp.kilsoon = new Kilsoon();

        leeCorp.java(); // 자바 프로그래밍
        leeCorp.python(); // 파이썬 프로그래밍
    }
}
class LeeCorp{
//    Kildong kildong;
    Jinee kildong; //이부분을 교체하기 까지 수시로 변경해야함 번거로움
    Kilsoon kilsoon;
    public void java(){
        kildong.java();

    }
    public void python(){
        kilsoon.python();

    }
}
class Kildong{
    public void java(){
        System.out.println("자바 프로그래밍");
    }

}
class Kilsoon{
    public void python(){
        System.out.println("파이썬 프로그래밍");
    }

}
class Jinee{
    public void java(){
        System.out.println("아주 뛰어난 자바 프로그래밍");
    }