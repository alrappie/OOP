package com.tutorial;

public class Settings {
    private static String inputUser;

    static void message(String message){
        System.out.print(message);
    }

    public static String getInputUser() {
         int goal=(int)(Math.random()*3);
         if (goal==0){
//             System.out.println("center");
             return inputUser="center";
         }else if (goal==1){
//             System.out.println("left");
             return inputUser="left";
         }else {
//             System.out.println("right");
             return inputUser="right";
         }
    }

    public static void setInputUser(String inputUser, Player player) {
        if (inputUser.equalsIgnoreCase(Settings.getInputUser())){
            int a = (int)(Math.random()*3);
                switch (a){
                    case 0:
                        System.out.println("..\n.\nWhat a Save from " + player.getName());break;
                    case 1:
                        System.out.println("..\n.\nWhat a Stunning Move from " + player.getName());break;
                    case 2:
                        System.out.println("..\n.\nNoone Ever Done that (claps..)\nNice Move form " + player.getName());break;
                }
            System.out.println("(Your prediction is correct!)");
            player.setGoalSymbol("✓");
        }else {
            int a = (int)(Math.random()*3);
            switch (a){
                case 0:
                    System.out.println("..\n.\nGoal goal goal goal....");break;
                case 1:
                    System.out.println("..\n.\nToo bad! the ball has turn in wrong direction ");break;
                case 2:
                    System.out.println("..\n.\nWhat a brilliant goal..");break;
            }
            System.out.println("the ball has turn to the "+Settings.inputUser);
            System.out.println("(Your prediction is incorrect!)");
            player.setGoalSymbol("X");
        }
    }
    public static void tutorial(){
        Settings.message("=================\n\tWelcome to \nPenalty Kick Game\n=================\n");
        System.out.println("[READ FIRST]");
        System.out.println("In this game you just need to\nguess the direction from the ball");
        System.out.println("You can type 'left','right',and 'center'\nas an Answer!");
        Settings.message("\nPress any key to continue..\n");
    }
    public static void commentator(){
        System.out.println("The whistle has been blown\nand here come the ball\n(guess the ball direction)");
    }
}
