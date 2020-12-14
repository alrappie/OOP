package com.tutorial;

import java.util.Scanner;


class Player {
    String name;
    int turnPlayer;
    private int firstDisplay = 0 ;

    Player(String name,int turnPlayer) {
        this.name = name;
        this.turnPlayer=turnPlayer;
    }
    int getTurnPlayer(){
        return this.turnPlayer;
    }
    int getFirstDisplay(){
        return this.firstDisplay;
    }
    void notFirstDIsplay(){
         firstDisplay++;
    }
    void claimingVictory(){
        System.out.println("=================\n"+this.name+" Has win the war!"+"\n=================");
    }
}

class Result {

    static boolean isItOver(String[][]asd,Player player){
        int poin=0;
        for (int i =0;i<asd.length;i++){
            if (asd[i][0].equals("X")){
                poin++;
                if (poin==3) {
                    player.claimingVictory();
                    return false;
                }
            }
        }
        poin=0;
        for (int i =0;i<asd.length;i++){
            if (asd[i][1].equals("X")){
                poin++;
                if (poin==3) {
                    player.claimingVictory();
                    return false;
                }
            }
        }
        poin=0;
        for (int i =0;i<asd.length;i++){
            if (asd[i][2].equals("X")){
                poin++;
                if (poin==3) {
                    player.claimingVictory();
                    return false;
                }
            }
        }
        poin=0;
        for (int i =0;i<asd.length;i++){
            if (asd[0][i].equals("X")){
                poin++;
                if (poin==3) {
                    player.claimingVictory();
                    return false;
                }
            }
        }
        poin=0;
        for (int i =0;i<asd.length;i++){
            if (asd[1][i].equals("X")){
                poin++;
                if (poin==3) {
                    player.claimingVictory();
                    return false;
                }
            }
        }
        poin=0;
        for (int i =0;i<asd.length;i++){
            if (asd[2][i].equals("X")){
                poin++;
                if (poin==3) {
                    player.claimingVictory();
                    return false;
                }
            }
        }
        poin=0;
        for (int i =0;i<asd.length;i++){
            if (asd[i][0].equals("O")){
                poin++;
                if (poin==3) {
                    player.claimingVictory();
                    return false;
                }
            }
        }
        poin=0;
        for (int i =0;i<asd.length;i++){
            if (asd[i][1].equals("O")){
                poin++;
                if (poin==3) {
                    player.claimingVictory();
                    return false;
                }
            }
        }
        poin=0;
        for (int i =0;i<asd.length;i++){
            if (asd[i][2].equals("O")){
                poin++;
                if (poin==3) {
                    player.claimingVictory();
                    return false;
                }
            }
        }
        poin=0;
        for (int i =0;i<asd.length;i++){
            if (asd[0][i].equals("O")){
                poin++;
                if (poin==3) {
                    player.claimingVictory();
                    return false;
                }
            }
        }
        poin=0;
        for (int i =0;i<asd.length;i++){
            if (asd[1][i].equals("O")){
                poin++;
                if (poin==3) {
                    player.claimingVictory();
                    return false;
                }
            }
        }
        poin=0;
        for (int i =0;i<asd.length;i++){
            if (asd[2][i].equals("O")){
                poin++;
                if (poin==3) {
                    player.claimingVictory();
                    return false;
                }
            }
        }
        if (asd[0][0].equals("X")&&asd[1][1].equals("X")&&asd[2][2].equals("X")){
            player.claimingVictory();
            return false;
        }else if (asd[0][0].equals("O")&&asd[1][1].equals("O")&&asd[2][2].equals("O")){
            player.claimingVictory();
            return false;
        }else if (asd[0][2].equals("X")&&asd[1][1].equals("X")&&asd[2][0].equals("X")){
            player.claimingVictory();
            return false;
        }else if (asd[0][2].equals("O")&&asd[1][1].equals("O")&&asd[2][0].equals("O")){
            player.claimingVictory();
            return false;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        do {
            clearScreen();
            Scanner GG = new Scanner(System.in);
            String[][]hasil = new String[3][3];
            System.out.println("=============\n TIC TAC TOE\n\tGAME\n=============");
            String inputUser;
            System.out.print("Player 1 Name : ");
            inputUser = GG.nextLine();
            Player player1 = new Player(inputUser,1);
            System.out.print("Player 2 Name : ");
            inputUser = GG.nextLine();
            Player player2 = new Player(inputUser,2);
            System.out.println();
            System.out.println("GAME BOARD");
            displayPapan(null, player1, hasil);
            player1.notFirstDIsplay();
            player2.notFirstDIsplay();
            int index = 1;
            while (Result.isItOver(hasil,player1)&&Result.isItOver(hasil,player2)){
                if (index % 2 != 0){
                    System.out.print(player1.name + "'s turn : ");
                    inputUser = GG.next();
                    System.out.println();
                    index++;
                    displayPapan(checkInputPapan(checkInput(inputUser),hasil), player1, hasil);
                }else{
                    System.out.print(player2.name + "'s turn : ");
                    inputUser = GG.next();
                    System.out.println();
                    index++;
                   displayPapan(checkInputPapan(checkInput(inputUser),hasil), player2, hasil);
                }
                if (index == 10) {
                    System.out.println("======\nDRAW GAME\n======");
                    break;
                }
            }
            System.out.print("Do you want to get your revenge?\nType here(yes/no)");
        }while(isContinue());
    }
    static void displayPapan(String data, Player player, String[][]hasil){
        int alph = 65;
        if (player.getFirstDisplay()==0) {
            System.out.println("  1 2 3");
            for (int i = 0; i < 3; i++) {
                System.out.print((char) alph);
                for (int j = 0; j < 3; j++) {
                    System.out.print("|");
                    System.out.print(hasil[i][j]=" ");
                }
                System.out.println("|");
                alph++;
            }
        }else {
                int huruf = data.charAt(0) - 'A';
                int angka = data.charAt(1) - '1';
                if (player.getTurnPlayer()==1) {
                    hasil[huruf][angka] = "X";
                }else {
                    hasil[huruf][angka] = "O";
                }
                System.out.println("  1 2 3");
                for (int i = 0; i < 3; i++) {
                    System.out.print((char) alph);
                    for (int j = 0; j < 3; j++) {
                        System.out.print("|");
                        System.out.print(hasil[i][j]);
                    }
                    System.out.println("|");
                    alph++;
                }
        }
    }
    static boolean isContinue(){
        Scanner GG = new Scanner(System.in);
        String input = GG.next();
        while (!input.equalsIgnoreCase("yes")&&!input.equalsIgnoreCase("no")){
            System.err.println("Your Type is unvalid\nget(yes/no)");
            input = GG.next();
        }
        return input.equalsIgnoreCase("yes");
    }
    static String checkInput(String input){
        Scanner GG = new Scanner(System.in);
        while ((input.charAt(0)!='A'&&input.charAt(0)!='B'&&input.charAt(0)!='C')||(input.charAt(1)!='1'&&input.charAt(1)!='2'&&input.charAt(1)!='3')){
            System.err.println("Your Type Unvalid!\nEx: C1,A1,B1");
            input = GG.next();
        }
        return input;
    }
    static String checkInputPapan(String input,String[][] data){
        Scanner GG = new Scanner(System.in);
        int huruf = input.charAt(0) - 'A';
        int angka = input.charAt(1) - '1';

        while(data[huruf][angka].equals("O") || data[huruf][angka].equals("X")){
            System.err.println("Not Allowed!");
            input = GG.next();
            huruf=input.charAt(0)-'A';
            angka=input.charAt(1)-'1';
        }
        return input;
    }
    private static void clearScreen(){
        try{
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else {
                System.out.print("\033\143");
            }
        }catch (Exception ex){
            System.err.println("tidak bisa clearScreen");
        }
    }
}
