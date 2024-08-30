package day6.hamberger;

import java.util.ArrayList;

public class Kiosk {
    ArrayList<Buger> bugers = new ArrayList<>();
    ArrayList<Side> sides = new ArrayList<>();
    ArrayList<Beverage> beverages = new ArrayList<>();


    public Kiosk() {
        Buger b1 = new Buger("한우불고기버거", 6000);
        Buger b2 = new Buger("치즈버거", 3000);
        Buger b3 = new Buger("치킨버거", 3500);
        Buger b4 = new Buger("새우버거", 3200);
        bugers.add(b1);
        bugers.add(b2);
        bugers.add(b3);
        bugers.add(b4);
        Side s1 = new Side("감자튀김", 1800);
        Side s2 = new Side("치즈스틱", 2000);
        Side s3 = new Side("치킨너겟", 2500);
        Side s4 = new Side("오징어링", 2700);
        sides.add(s1);
        sides.add(s2);
        sides.add(s3);
        sides.add(s4);
        Beverage d1 = new Beverage(1000, "콜라");
        Beverage d2 = new Beverage(2000, "에이드");
        Beverage d3 = new Beverage(1500, "커피");
        Beverage d4 = new Beverage(2500, "쉐이크");
        beverages.add(d1);
        beverages.add(d2);
        beverages.add(d3);
        beverages.add(d4);
    }

    public Buger getBugers(int target) {
        return bugers.get(target);

    }
    public Side getSides(int target) {
        return sides.get(target);

    }
    public Beverage getBeverage(int target) {
        return beverages.get(target);

    }

    public void bugersmenu() {
        for (int i = 0; i < bugers.size(); i++) {
            System.out.println(i+1 + ". "+ bugers.get(i).name + ": " + bugers.get(i).price);

        }

    }

    public void sidemenu() {
        for (int i = 0; i < sides.size(); i++) {
            System.out.println(i+1 + "." + sides.get(i).name + " : " + sides.get(i).price);

        }


    }

    public void beberagemenu() {
        for (int i = 0; i < beverages.size(); i++) {
            System.out.println(i+1 + ". "+ beverages.get(i).name + " : " + beverages.get(i).price);

        }


    }
}
