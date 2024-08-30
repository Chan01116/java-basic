package day6.nameApp;

import day6.objectArrayList.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class NameAppSelf {
    public static void main(String[] args) {
//        String[] names = new String[1000];
//        int index = 0;
//        int[] age = new int[1000];
//        Integer.parseInt

        //이름 짓는 고민 -> 대충 짓고 넘어가면 -> 큰일 난다.
        //이름 짓는 고민 -> 많이 해도 괜찮음.
        // 변수->명사(저장하려는 값과 관계 있어야 함), 메서드(동작) -> 동사(동작하는 것과 관계가 있어야 함)
        //person p1 = people.get


        ArrayList<Name> persons = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("명령어 : ");
            String command = sc.nextLine();
            if(command.equals("help")){
                System.out.println("add : 이름추가");
                System.out.println("list : 이름목록 확인");
                System.out.println("exit : 종료");
            } else if (command.equals("add")) {
                System.out.print("이름을 입력해주세요 : ");
                String names = sc.nextLine();
                System.out.println(names+"가 명부에 저장되었습니다.");
                System.out.print("나이를 입력해 주세요 : ");
                int ages = Integer.parseInt(sc.nextLine());
                System.out.println( ages +" 가 명부에 저장 되었습니다. ");
                Name p1 = new Name(); //여기다 저장해야함
                p1.ages = ages;
                p1.names = names;
                persons.add(p1);

            } else if (command.equals("list")) {
                for(int i = 0; i < persons.size(); i ++){
                    System.out.println(persons.get(i).names);
                    System.out.println(persons.get(i).ages);
                }

            } else if (command.equals("exit")) {
                System.out.println("exit");
                System.out.println("프로그램이 종료됩니다.");
                break;

            }
        }
    }
}
