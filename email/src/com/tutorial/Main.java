package com.tutorial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        String[] scannerInput = new String[6];
        int userInput;
//        Email email2 = new Email("asdsdas","ddddd","ffff");
        System.out.print("Input your first name : ");
        scannerInput[0] = scanner.next();
        System.out.print("Input your last name : ");
        scannerInput[1] = scanner.next();
        System.out.print("Input your User name : ");
        scannerInput[2] = scanner.next();
        Email email = new Email(scannerInput[0], scannerInput[1], scannerInput[2]);
        do {
            System.out.println("Welcome to Email");
            System.out.println("Toolbar");
            System.out.println("1.\tShow Profile\n2.\tInbox\n3.\tChange Password\n4.\tLogout");

            while (true) {
                try {
                    userInput = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("Number allowed!");
                    scanner.next();
                }
            }

            switch (userInput){
                case 1:
                    email.displayProfile();
                    System.out.println("Edit profile ?(yes)");
                    if (scanner.next().equalsIgnoreCase("yes")){
                        int temp;
                        do {
                            System.out.println("1.\tChange username\n2.\tChange firstname\n3.\tChange lastname\n4.\tGender\n5.\tPhone number\n6.\tLocation\n0.\tback!");
                            while (true) {
                                try {
                                    temp = scanner.nextInt();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.err.println("Number allowed!");
                                    scanner.next();
                                }
                            }
                            switch (temp){
                                case 1:
                                    System.out.println("set your new username");
                                    email.setUserName(scanner.next());
                                    break;
                                case 2:
                                    System.out.println("set your new firstname");
                                    email.setFirstName(scanner.next());
                                    break;
                                case 3:
                                    System.out.println("set your new lastname");
                                    email.setLastName(scanner.next());
                                    break;
                                case 4:
                                    System.out.println("Choose your gender\n1.\tFemale\n2.\tMale");
                                    int tempp = scanner.nextInt();
                                    while (tempp!=1 &&tempp!=2){
                                        System.out.println("Choose 1/2 only!");
                                        tempp = scanner.nextInt();
                                    }
                                    if (tempp==1){
                                        email.setGender("Female");
                                    }else email.setGender("Male");
                                    break;
                                case 5:
                                    System.out.println("type your phone number");
                                    String c=scanner.next().toLowerCase();
                                    while (c.length()!=12){
                                        System.out.println("Your phone number must be 12 digit");
                                        System.out.println("(Number Only!)");
                                        c= scanner.next();
                                    }
                                    email.setPhoneNumber(c);
                                    break;
                                case 6:
                                    System.out.print("Set your Location");
                                    email.setLocation(scanner.next());
                                    break;
                                default:
                                    temp=0;
                            }
                        }while (temp!=0);
                    }
                    break;
                case 2:
                    email.setInbox();
                    if (scanner.next().equalsIgnoreCase("compose")){
                        System.out.println("New Message");
                        System.out.print("to ");
                        scanner.nextLine();
                        scannerInput[3]=scanner.nextLine();
                        System.out.print("subject ");
                        scannerInput[4]=scanner.nextLine();
                        System.out.print("main text ");
                        scannerInput[5]=scanner.nextLine();
                        email.composeEmail();
                    }
                    break;

                case 3:
                    System.out.println("Type your new password here : ");
                    String tempNewPass = scanner.next();
                    if (tempNewPass.length() < 10) {
                        while (tempNewPass.length() < 10) {
                            System.out.println("Minimum character for password is 10\nplease type again!");
                            tempNewPass = scanner.next();
                        }
                    }
                    System.out.println("Make it sure \n(confirm the password)");
                    String tempNewPass2 = scanner.next();
                    if (!tempNewPass.equals(tempNewPass2)) {
                        while (!tempNewPass.equals(tempNewPass2)){
                            System.out.println("your password not same\n(try again)");
                            tempNewPass2 = scanner.next();
                        }
                    }
                    email.changePassword(tempNewPass);
                    System.out.println("Success to change password");
                    break;
            }
        } while (userInput != 4);
        System.out.println("Have a goodtime");
    }
//    public static int tryCatch(){
//        int temp;
//        while (true) {
//            try {
//                temp=scanner.nextInt();
//                break;
//            } catch (InputMismatchException e) {
//                System.err.println("Number allowed!");
//                scanner.next();
//            }
//        }
//        return temp;
//    }
}
