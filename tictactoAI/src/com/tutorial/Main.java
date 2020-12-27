package com.tutorial;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
            System.out.print("Input your name here : ");
            String inputUser = scanner.nextLine();
            System.out.print("Input your symbol here : ");
            char symbolUser = scanner.next().toUpperCase().charAt(0);
            Board.howToPlay();
            scanner.next();
        do {
            int i =1;
            StringBuilder stringBuilder = new StringBuilder();
            Board board = new Board();
            AI ai = new AI();
            Player player = new Player(inputUser, symbolUser);
//            System.out.println("Get Tails or Head");
//        inputUser = scanner.next();
//        if (inputUser.equalsIgnoreCase(Board.talesOrHead())){
//            System.out.println(player.getName()+" move first");
            do {
                if (i==6&&board.getResult()){
                    System.out.println("DRAW");
                    break;
                }else {
                    int move = scanner.nextInt();
                    move = setIsItValid(move, stringBuilder);
                    player.setMoveBoard(board, move);
                    ai.botLogic(move, board);
                    i++;
                    System.out.println(i);
                }
            } while (board.getResult());
//            player.setMoveBoard(board,setIsItValid(move,stringBuilder));
//        }else {
//            System.out.println("Bot move first");
//        }
            System.out.println("play again?\nType (yes)");
        }while (scanner.next().equals("yes"));
    }

    public static int setIsItValid(int input,StringBuilder stringBuilder){
        while (stringBuilder.toString().contains(Integer.toString(input))) {
            System.out.print("this number already taken!\nPlease type new number : ");
            input = scanner.nextInt();
        }
        stringBuilder.append(input);
        return input;
    }
}
