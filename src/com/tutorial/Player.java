package com.tutorial;

public class Player {
    private String name;
    private static String[] scoreBoard = new String[5];
    private static String goalSymbol;
    private static int index;
    private static int d;

    Player(String name){
        this.name = name;
    }
    Player(){
        this.name = "Kicker";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        Player.index = index;
    }

    public static void setScoreBoard(String[] scoreBoard) {
        Player.scoreBoard = scoreBoard;
    }

    public static void setD(int d) {
        Player.d = d;
    }

    public static void getScoreBoard(){
        Settings.message("-----------\nScore Board\n");
        for (int i =0;i< scoreBoard.length;i++){
            System.out.print("[");
            if (d==(0)){
                scoreBoard[i] = " ";
            }else {
                scoreBoard[Player.getIndex()]=Player.getGoalSymbol();
            }
            System.out.print(scoreBoard[i]);
            System.out.print("]");
        }
        Settings.message("\n-----------\n");
        d++;
        Settings.commentator();
    }

    public void setGoalSymbol(String goalSymbol) {
        Player.goalSymbol = goalSymbol;
    }
    public static String getGoalSymbol() {
        return goalSymbol;
    }
}
