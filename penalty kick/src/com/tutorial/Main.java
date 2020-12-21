package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner GG = new Scanner(System.in);
        String inputUser;
        Settings.tutorial();
        inputUser = GG.next();
        Settings.message("Name ur goalkeeper : ");
        Player goalKeeper = new Player(GG.next());
        Player Kicker = new Player();
        do {
            for (int i = 0; i < 5; i++) {
                Player.getScoreBoard();
                inputUser = GG.next();
                Player.setIndex(i);
                Settings.setInputUser(inputUser, goalKeeper);
            }
            Player.getScoreBoard();
            Settings.message("Thanks for Playing\n Do you want to play Again? (ya)");
        }while (playingAgain(GG.next()));
    }
    private static boolean playingAgain(String inputUser){
        Player.setScoreBoard(new String[5]);
        Player.setD(0);
        return inputUser.equalsIgnoreCase("ya");
    }
}
