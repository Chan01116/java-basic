package queast2;

import queast2.test.BoardApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {


    public static void main(String[] args) {
        // main 메서드는 프로그램의 스위치 역할만 하면 된다.
        // static 때문에
        BoardApp boardApp = new BoardApp();
        boardApp.run();


    }
}