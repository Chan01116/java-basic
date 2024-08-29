package day5.arrayListExam;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {

//
//
//        // 생성
//
//
//        // 배열
//        int[] arr = new int[5]; // 길이 5인 숫자 배열 생성
//
//
//        // ArrayList
//        ArrayList<Integer> list = new ArrayList<>(); // 비어있는 배역
//
//        //================
//
//        // 추가
//        // 배열 -> 추가 X
//        // ArrayList -> 추가
//        // 가장 앞에서부터 추가됨.
//        list.add(1); // 0번 방에 추가
//
//        list.add(2); // 1번 방에 추가
//
//        // ============================
//        // 조회(출력)
//        // 배열
//        System.out.println(arr[0]); // arr 배열의 0번방조회
//        System.out.println(arr[1]); // arr 배열의 1번방조회
//        System.out.println(arr[2]); // arr 배열의 2번방조회
//
//
//        // ArrayList
//        System.out.println(list.get(0)); // list 배열의 0번방 조회
//        System.out.println(list.get(1)); // list 배열의 1번방 조회
////        System.out.println(list.get(2)); // list 배열의 2번방 조회 -> 2번방이 존재하지 않기 때문에 에러
//
//        //=======================================
//
//        //수정
//        //배열
//        arr[0] = 10; // arr 배열의 0번 방의 값을 10으로 수정.
//        System.out.println(arr[0]);
//
//
//        // ArrayList
//
//        list.set(0, 10); // list 배열의 0번 방의 값을 10으로 수정.
//        System.out.println(list.get(0));
//
//        //=====================
//
//        //삭제
//        //배열 -> 삭제 X
//        //ArrayList
//
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//
//        list.remove(0); //0번방의 값을 삭제.  삭제하면 뒤에 있는 요소들이 앞으로 땡겨짐
//
//        System.out.println(list.get(0));
////        System.out.println(list.get(1)); // 삭제로 인해 1번방이 존재하지 않기 때문에 에러가 남
//
//        //======================
//        // 데이터의 개수확인
//        // 배열 => length 를 제공하지만 데이터의 개수랑 무관. 따로 내가 변수에 직접 보관해야 함.
//
//
//        // ArrayList
//        System.out.println(list.size()); // 1
//        list.add(2);
//        list.add(3);
//        System.out.println(list.size());// 3

        // 배열보다 ArrayList가 사용성이 훨씬 편하므로 ArrayList를 주로 사용하고
        // 성능이 중요한 부분에서는 배열을 사용한다.

        //===============================================================

        // {5,4,3,2,1,0}을 ArrayList에 추가 해주세요.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        // ArrayList의 사이즈를 출력해주세요.
        System.out.println(list.size());
        // ArrayList의 3,4번째 값을 읽어서 출력해주세요. (인덱스 X, 1부터 )
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        // 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주세요
        list.remove(0);
        list.remove(0);
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        // List의 모든 값을 출력해주세요.
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 정수를 저장할 수 있는 ArrayList를 선언하고 만들어주세요.

        // 리스트에 값을 추가해주세요.


        // size()
        // 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
        // 출력결과 : 6


        // get()
        // 리스트의 3,4번째 값을 출력해주세요.
        // 출력결과 : 3, 2


        // remove()
        // 리스트의 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
        // 출력 결과 : 1, 0


        // 반복문으로 출력.
        //
        // 리스트의 모든 값을 출력해주세요.
        // 출력 결과 : 3, 2, 1, 0

        //========================================================


        // 선언
        // 이름을 저장할 수 있는 ArrayList를 선언하고 만들어주세요.

        ArrayList<String> name = new ArrayList<>();


        // add()
        // 리스트에 값을 추가해주세요.
        // "홍길동", "이순신", "황진이", "임꺽정", "강감찬", "을지문덕" 을 ArrayList에 추가 해주세요.
        name.add("홍길동");
        name.add("이순신");
        name.add("황진이");
        name.add("임꺽정");
        name.add("강감찬");
        name.add("을지문덕");


        // size()
        // 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
        System.out.println(name.size());
        // 출력결과 : 6


        // get()
        // 리스트의 2,3 인덱스의 값을 출력해주세요.
        // 출력결과 : 황진이, 임꺽정
        System.out.println(name.get(2));
        System.out.println(name.get(3));


        // 리스트의 모든 값을 출력해주세요.
        // 출력 결과 : 홍길동 이순신 황진이 임꺽정 강감찬 을지문덕
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }


        // remove()
        // 리스트에서 홍길동, 이순신을 지운 뒤, 다시 2,3 인덱스의 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
        // 출력 결과 : 강감찬, 을지문덕
        name.remove(0);
        name.remove(0);
        System.out.println(name.get(2));
        System.out.println(name.get(3));


        // 리스트의 모든 값을 출력해주세요.
        // 출력 결과 : 황진이 임꺽정 강감찬 을지문덕
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }


        // add()
        // 리스트에 정약용을 추가시켜주세요.
        name.add("정약용");


        // 리스트의 모든 값을 출력해주세요.
        // 출력 결과 : 황진이 임꺽정 강감찬 을지문덕 정약용
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }


        // set()
        // 임꺽정과 을지문덕을 신사임당과 유관순으로 바꿔주세요.
        name.set(1, "신사임당");
        name.set(3, "유관순");
//        for(int i = 0; i < names.size(); i++){
//            if(names.get(i).equals("임꺽정")){
//                names.set(i, "신사임당");
//            }
//        }
//        for(int i = 0; i < names.size(); i++){
//            if(names.get(i).equals("을지문덕")){
//                names.set(i, "유관순");
//            }
//        }



        // 리스트의 모든 값을 출력해주세요.
        // 출력 결과 : 황진이 신사임당 강감찬 유관순 정약용
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }


        // 리스트에서 황진이 신사임당 유관순만 출력해주세요.
        // 출력 결과 : 황진이 신사임당 유관순
        name.remove(2);
        name.remove(3);
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }


        // int - Integer **
        // ArrayList는 타입(자료형)을 객체만 다룬다.
        // 객체형 자료형(리모콘), 원시형 자료형(in, boolean, double) 두가지로 구분.

        //원시형의 객체형 자료형을 제공
        // char -> Character **
        // double -> Double
        // byte -> Byte
        // boolean -> Boolean
        // 원시형 타입명에서 앞글자만 대문자로 바꾸면 객체형

        //=============================================

        // 1. 네 사람을 ArrayList에 저장
        // 2. 네 사람에게 자기소개 시키기 (자기소개 문구 : 안녕하세요 ~~살 ~~~입니다.)
        // 3. 30대인 사람에게만 자기소개 시키기
        ArrayList<Person> p = new ArrayList<>();


        Person p1 = new Person();
        p1.age = 24;
        p1.name = "홍길동";
        p.add(p1);

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";
        p.add(p2);

        Person p3 = new Person();
        p3.age = 41;
        p3.name = "을지문덕";
        p.add(p3);

        Person p4 = new Person();
        p4.age = 32;
        p4.name = "황진이";
        p.add(p4);

        for (int i = 0; i < p.size(); i++) {

        }
    }
}
