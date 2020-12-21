package com.tutorial;

import java.util.Scanner;

public class gg {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String string = scanner.next();
        switch (Integer.parseInt(method(string))){
            case 1:
                System.out.println("adad");
                break;
            case 2:
                System.out.println("dffffff");
                break;
        }
    }
    static String method(String string){
        while (true) {
            try {
                Integer.parseInt(string);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Number allowed!");
                string=scanner.next();
            }
        }
        return string;
    }
}
