package com.tutorial;

public class Board {
    private final char[][] gameBoard = new char[3][3];

    private int x;
    private int y;

    Board(){
        int alp = 49;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|");
                System.out.print(gameBoard[i][j] = (char) alp);
                alp++;
            }
            System.out.println("|");
        }
    }

    public void setDisplayBoard(int input, char symbol){
        setChangeInput(input);
        gameBoard[getX()][getY()]=symbol;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|");
                System.out.print(gameBoard[i][j]);
            }
            System.out.println("|");
        }
//        getResult();
    }
    public void setChangeInput(int input){
        switch (input){
            case 1: x = 0; y =0;break;
            case 2: x = 0; y = 1;break;
            case 3: x = 0; y = 2;break;
            case 4: x = 1; y = 0;break;
            case 5: x = 1; y = 1;break;
            case 6: x = 1; y = 2;break;
            case 7: x = 2; y = 0;break;
            case 8: x = 2; y = 1;break;
            case 9: x = 2; y = 2;break;
        }
    }

    private int getX() {
        return x;
    }
    private int getY() {
        return y;
    }

    static public void howToPlay(){
        System.out.println("-----\nNotes\n-----");
        System.out.println("In this game you just need to type the number as your placement");
        System.out.println("Input anything to continue..");
    }
//    static public String talesOrHead(){
//        int b = (int)(Math.random()*2);
//        if (b==0){
//            System.out.println("result = tails");
//            return "tails";
//        }else
//            System.out.println("result = head");
//            return "head";
//    }

    public boolean getResult(){
        if (gameBoard[0][0]==gameBoard[0][1]&&gameBoard[0][1]==gameBoard[0][2]){
            System.out.println("Game is Over!");
            return false;
        }else if (gameBoard[1][0]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[1][2]){
            System.out.println("Game is Over!");
            return false;
        }else if (gameBoard[2][0]==gameBoard[2][1]&&gameBoard[2][1]==gameBoard[2][2]){
            System.out.println("Game is Over!");
            return false;
        }else if (gameBoard[0][0]==gameBoard[1][0]&&gameBoard[1][0]==gameBoard[2][0]){
            System.out.println("Game is Over!");
            return false;
        }else if (gameBoard[0][1]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[2][1]){
            System.out.println("Game is Over!");
            return false;
        }else if (gameBoard[0][2]==gameBoard[1][2]&&gameBoard[1][2]==gameBoard[2][2]){
            System.out.println("Game is Over!");
            return false;
        }else if (gameBoard[0][0]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[2][2]){
            System.out.println("Game is Over!");
            return false;
        }else if (gameBoard[0][2]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[2][0]){
            System.out.println("Game is Over!");
            return false;
        }
        else return true;
    }
}
