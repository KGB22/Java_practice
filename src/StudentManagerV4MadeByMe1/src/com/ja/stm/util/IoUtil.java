package com.ja.stm.util;

import java.util.Scanner;

public class IoUtil {
    private static final Scanner scn = new Scanner(System.in);

    public static void print(String text){
        System.out.println(text);
    }
    public static String input(String text){
        System.out.print(text + " > ");
        return scn.nextLine();
    }
    public static void pause(){
        System.out.println("계속하려면 enter를 눌러주세요.");
        scn.nextLine();
    }

}
