package com.tutorial;

public class Player {
    private final String name;
    private final char symbol;
    Player(String name,char symbol){
        this.name = name;
        this.symbol= symbol;
        System.out.println("your name is "+getName());
        System.out.println("and your symbol is "+getSymbol());
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setMoveBoard(Board board,int input){
        board.setDisplayBoard(input,getSymbol());
    }
}
