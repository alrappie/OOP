package com.tutorial;

public class AI {
    private final String name;
    private final char symbol;
    private int numb;
//    private int temp1;
//    private int temp2;
    private final int[] array = {0,0,0,0,0};

    AI(){
        this.name = "botEZ";
        this.symbol = '✓';
        this.numb = 0;
    }

    public void botLogic(int move, Board board){
        array[numb]=move;
        if (array[0]==1){
            if (numb==0) {
                System.out.println("bot move to 5");
                board.setDisplayBoard(5, symbol);
            }
            if (array[1]==2){
                if (numb==1) {
                    System.out.println("bot move to 3");
                    board.setDisplayBoard(3, symbol);
                }
                if (array[2]==7){
                    if (numb==2) {
                        System.out.println("bot move to 4");
                        board.setDisplayBoard(4, symbol);
                    }
                    if (array[3]==6){
                        if (numb==3) {
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    }else {
                        if (numb==3) {
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }
                }else {
                    if (numb==2) {
                        System.out.println("bot move to 7");
                        board.setDisplayBoard(7, symbol);
                    }
                }
            }else if (array[1]==3){
                if (numb==1) {
                    System.out.println("bot move to 2");
                    board.setDisplayBoard(2, symbol);
                }
                if (array[2]==8){
                    if (numb==2){
                        System.out.println("bot move to 4");
                        board.setDisplayBoard(4, symbol);
                    }
                    if (array[3]==6){
                        if (numb==3){
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }
                }else {
                    if (numb==2){
                        System.out.println("bot move to 8");
                        board.setDisplayBoard(8, symbol);
                    }
                }
            }else if (array[1]==4){
                if (numb==1) {
                    System.out.println("bot move to 7");
                    board.setDisplayBoard(7, symbol);
                }
                if (array[2]==3){
                    if (numb==2) {
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2, symbol);
                    }
                    if (array[3]==8){
                        if (numb==3) {
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }else {
                        if (numb==3) {
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    }
                }else {
                    if (numb==2) {
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                }
            }else if (array[1]==6){
                if (numb==1) {
                    System.out.println("bot move to 8");
                    board.setDisplayBoard(8, symbol);
                }
                if (array[2]==2){
                    if (numb==2){
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                    if (array[3]==7){
                        if (numb==3){
                            System.out.println("bot move to 4");
                            board.setDisplayBoard(4, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    }
                }else {
                    if (numb==2){
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2, symbol);
                    }
                }
            }else if (array[1]==7){
                if (numb==1) {
                    System.out.println("bot move to 4");
                    board.setDisplayBoard(4, symbol);
                }
                if (array[2]==6){
                    if (numb==2){
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2, symbol);
                    }
                    if (array[3]==8){
                        if (numb==3){
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    }
                }else {
                    if (numb==2){
                        System.out.println("bot move to 6");
                        board.setDisplayBoard(6, symbol);
                    }
                }
            }else if (array[1]==8){
                if (numb==1) {
                    System.out.println("bot move to 6");
                    board.setDisplayBoard(6, symbol);
                }
                if (array[2]==4){
                    if (numb==2){
                        System.out.println("bot move to 7");
                        board.setDisplayBoard(7, symbol);
                    }
                    if (array[3]==3){
                        if (numb==3){
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 3");
                            board.setDisplayBoard(3, symbol);
                        }
                    }
                }else {
                    if (numb==2){
                        System.out.println("bot move to 4");
                        board.setDisplayBoard(4, symbol);
                    }
                }
            }else if (array[1]==9){
                if (numb==1) {
                    System.out.println("bot move to 4");
                    board.setDisplayBoard(4, symbol);
                }
                if (array[2]==6){
                    if (numb==2){
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                    if (array[3]==7){
                        if (numb==7){
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    }
                }else {
                    if (numb==2){
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                }
            }
        }else if (array[0]==2){
            if (numb==0) {
                System.out.println("bot move to 5");
                board.setDisplayBoard(5, symbol);
            }
            if (array[1]==1){
                if (numb==1) {
                    System.out.println("bot move to 3");
                    board.setDisplayBoard(3, symbol);
                }
                if (array[2]==7){
                    if (numb==2) {
                        System.out.println("bot move to 4");
                        board.setDisplayBoard(4, symbol);
                    }
                    if (array[3]==6){
                        if (numb==3) {
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    }else {
                        if (numb==3) {
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }
                }else {
                    if (numb==2) {
                        System.out.println("bot move to 7");
                        board.setDisplayBoard(7, symbol);
                    }
                }
            }else if (array[1]==3){
                if (numb==1) {
                    System.out.println("bot move to 2");
                    board.setDisplayBoard(2, symbol);
                }
                if (array[2]==8){
                    if (numb==2){
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                    if (array[3]==1){
                        if (numb==3){
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                    }
                }else {
                    if (numb==2){
                        System.out.println("bot move to 8");
                        board.setDisplayBoard(8, symbol);
                    }
                }
            }else if (array[1]==4){
                if (numb==1) {
                    System.out.println("bot move to 7");
                    board.setDisplayBoard(7, symbol);
                }
                if (array[2]==3){
                    if (numb==2) {
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                    if (array[3]==9){
                        if (numb==3) {
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }else {
                        if (numb==3) {
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    }
                }else {
                    if (numb==2) {
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                }
            }else if (array[1]==6){
                if (numb==1) {
                    System.out.println("bot move to 9");
                    board.setDisplayBoard(9, symbol);
                }
                if (array[2]==1){
                    if (numb==2){
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                    if (array[3]==7){
                        if (numb==3){
                            System.out.println("bot move to 4");
                            board.setDisplayBoard(4, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    }
                }else {
                    if (numb==2){
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                }
            }else if (array[1]==7){
                if (numb==1) {
                    System.out.println("bot move to 4");
                    board.setDisplayBoard(4, symbol);
                }
                if (array[2]==6){
                    if (numb==2){
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                    if (array[3]==1){
                        if (numb==3){
                            System.out.println("bot move to 3");
                            board.setDisplayBoard(3, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                    }
                }else {
                    if (numb==2){
                        System.out.println("bot move to 6");
                        board.setDisplayBoard(6, symbol);
                    }
                }
            }else if (array[1]==8){
                if (numb==1) {
                    System.out.println("bot move to 9");
                    board.setDisplayBoard(9, symbol);
                }
                if (array[2]==1){
                    if (numb==2){
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                    if (array[3]==7){
                        if (numb==3){
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    }
                }else {
                    if (numb==2){
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                }
            }else if (array[1]==9){
                if (numb==1) {
                    System.out.println("bot move to 4");
                    board.setDisplayBoard(4, symbol);
                }
                if (array[2]==6){
                    if (numb==2){
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                    if (array[3]==7){
                        if (numb==7){
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    }
                }else {
                    if (numb==2){
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                }
            }
        }else if (array[0]==3){
            if (numb==0) {
                System.out.println("bot move to 5");
                board.setDisplayBoard(5, symbol);
            }
            if (array[1]==2){
                if (numb==1) {
                    System.out.println("bot move to 1");
                    board.setDisplayBoard(1, symbol);
                }
                if (array[2]==9){
                    if (numb==2) {
                        System.out.println("bot move to 6");
                        board.setDisplayBoard(6, symbol);
                    }
                    if (array[3]==4){
                        if (numb==3) {
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    }else {
                        if (numb==3) {
                            System.out.println("bot move to 4");
                            board.setDisplayBoard(4, symbol);
                        }
                    }
                }else {
                    if (numb==2) {
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                }
            }else if (array[1]==1){
                if (numb==1) {
                    System.out.println("bot move to 2");
                    board.setDisplayBoard(2, symbol);
                }
                if (array[2]==8){
                    if (numb==2){
                        System.out.println("bot move to 4");
                        board.setDisplayBoard(4, symbol);
                    }
                    if (array[3]==6){
                        if (numb==3){
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }
                }else {
                    if (numb==2){
                        System.out.println("bot move to 8");
                        board.setDisplayBoard(8, symbol);
                    }
                }
            }else if (array[1]==4){
                if (numb==1) {
                    System.out.println("bot move to 2");
                    board.setDisplayBoard(2, symbol);
                }
                if (array[2]==8){
                    if (numb==2) {
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                    if (array[3]==9){
                        if (numb==3) {
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }else {
                        if (numb==3) {
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    }
                }else {
                    if (numb==2) {
                        System.out.println("bot move to 8");
                        board.setDisplayBoard(8, symbol);
                    }
                }
            }else if (array[1]==6){
                if (numb==1) {
                    System.out.println("bot move to 9");
                    board.setDisplayBoard(9, symbol);
                }
                if (array[2]==1){
                    if (numb==2){
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2, symbol);
                    }
                    if (array[3]==8){
                        if (numb==3){
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    }
                }else {
                    if (numb==2){
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                }
            }else if (array[1]==7){
                if (numb==1) {
                    System.out.println("bot move to 4");
                    board.setDisplayBoard(4, symbol);
                }
                if (array[2]==6){
                    if (numb==2){
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                    if (array[3]==1){
                        if (numb==3){
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                    }
                }else {
                    if (numb==2){
                        System.out.println("bot move to 6");
                        board.setDisplayBoard(6, symbol);
                    }
                }
            }else if (array[1]==8){
                if (numb==1) {
                    System.out.println("bot move to 6");
                    board.setDisplayBoard(6, symbol);
                }
                if (array[2]==4){
                    if (numb==2){
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                    if (array[3]==9){
                        if (numb==3){
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    }
                }else {
                    if (numb==2){
                        System.out.println("bot move to 4");
                        board.setDisplayBoard(4, symbol);
                    }
                }
            }else if (array[1]==9){
                if (numb==1) {
                    System.out.println("bot move to 6");
                    board.setDisplayBoard(6, symbol);
                }
                if (array[2]==4){
                    if (numb==2){
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2, symbol);
                    }
                    if (array[3]==8){
                        if (numb==7){
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    }
                }else {
                    if (numb==2){
                        System.out.println("bot move to 4");
                        board.setDisplayBoard(4, symbol);
                    }
                }
            }
        }else if (array[0]==4) {
            if (numb == 0) {
                System.out.println("bot move to 5");
                board.setDisplayBoard(5, symbol);
            }
            if (array[1] == 2) {
                if (numb == 1) {
                    System.out.println("bot move to 1");
                    board.setDisplayBoard(1, symbol);
                }
                if (array[2] == 9) {
                    if (numb == 2) {
                        System.out.println("bot move to 7");
                        board.setDisplayBoard(7, symbol);
                    }
                    if (array[3] == 3) {
                        if (numb == 3) {
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 3");
                            board.setDisplayBoard(3, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                }
            } else if (array[1] == 1) {
                if (numb == 1) {
                    System.out.println("bot move to 7");
                    board.setDisplayBoard(7, symbol);
                }
                if (array[2] == 3) {
                    if (numb == 2) {
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2 ,symbol);
                    }
                    if (array[3] == 8) {
                        if (numb == 3) {
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                }
            } else if (array[1] == 3){
                if (numb == 1) {
                    System.out.println("bot move to 1");
                    board.setDisplayBoard(1, symbol);
                }
                if (array[2] == 9) {
                    if (numb == 2) {
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2, symbol);
                    }
                    if (array[3] == 8) {
                        if (numb == 3) {
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                }
            } else if (array[1] == 6) {
                if (numb == 1) {
                    System.out.println("bot move to 2");
                    board.setDisplayBoard(2, symbol);
                }
                if (array[2] == 8) {
                    if (numb == 2) {
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                    if (array[3] == 9) {
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 8");
                        board.setDisplayBoard(8, symbol);
                    }
                }
            } else if (array[1] == 7) {
                if (numb == 1) {
                    System.out.println("bot move to 1");
                    board.setDisplayBoard(1, symbol);
                }
                if (array[2] == 9) {
                    if (numb == 2) {
                        System.out.println("bot move to 8");
                        board.setDisplayBoard(8, symbol);
                    }
                    if (array[3] == 2) {
                        if (numb == 3) {
                            System.out.println("bot move to 3");
                            board.setDisplayBoard(3, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                }
            } else if (array[1] == 8) {
                if (numb == 1) {
                    System.out.println("bot move to 7");
                    board.setDisplayBoard(7, symbol);
                }
                if (array[2] == 3) {
                    if (numb == 2) {
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                    if (array[3] == 9) {
                        if (numb == 3) {
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                }
            } else if (array[1] == 9) {
                if (numb == 1) {
                    System.out.println("bot move to 2");
                    board.setDisplayBoard(2, symbol);
                }
                if (array[2] == 8) {
                    if (numb == 2) {
                        System.out.println("bot move to 7");
                        board.setDisplayBoard(7, symbol);
                    }
                    if (array[3] == 3) {
                        if (numb == 7) {
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 3");
                            board.setDisplayBoard(3, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 8");
                        board.setDisplayBoard(8, symbol);
                    }
                }
            }
        }else if (array[0]==6){
            if (numb == 0) {
                System.out.println("bot move to 5");
                board.setDisplayBoard(5, symbol);
            }
            if (array[1] == 2) {
                if (numb == 1) {
                    System.out.println("bot move to 1");
                    board.setDisplayBoard(1, symbol);
                }
                if (array[2] == 9) {
                    if (numb == 2) {
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                    if (array[3] == 7) {
                        if (numb == 3) {
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                }
            } else if (array[1] == 1) {
                if (numb == 1) {
                    System.out.println("bot move to 8");
                    board.setDisplayBoard(8, symbol);
                }
                if (array[2] == 2) {
                    if (numb == 2) {
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3 ,symbol);
                    }
                    if (array[3] == 7) {
                        if (numb == 3) {
                            System.out.println("bot move to 4");
                            board.setDisplayBoard(4, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2, symbol);
                    }
                }
            } else if (array[1] == 3){
                if (numb == 1) {
                    System.out.println("bot move to 9");
                    board.setDisplayBoard(9, symbol);
                }
                if (array[2] == 1) {
                    if (numb == 2) {
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2, symbol);
                    }
                    if (array[3] == 8) {
                        if (numb == 3) {
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                }
            } else if (array[1] == 4) {
                if (numb == 1) {
                    System.out.println("bot move to 3");
                    board.setDisplayBoard(3, symbol);
                }
                if (array[2] == 7) {
                    if (numb == 2) {
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                    if (array[3] == 9) {
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 7");
                        board.setDisplayBoard(7, symbol);
                    }
                }
            } else if (array[1] == 7) {
                if (numb == 1) {
                    System.out.println("bot move to 1");
                    board.setDisplayBoard(1, symbol);
                }
                if (array[2] == 9) {
                    if (numb == 2) {
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                    if (array[3] == 2) {
                        if (numb == 3) {
                            System.out.println("bot move to 4");
                            board.setDisplayBoard(4, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                }
            } else if (array[1] == 8) {
                if (numb == 1) {
                    System.out.println("bot move to 7");
                    board.setDisplayBoard(7, symbol);
                }
                if (array[2] == 3) {
                    if (numb == 2) {
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                    if (array[3] == 1) {
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                }
            } else if (array[1] == 9) {
                if (numb == 1) {
                    System.out.println("bot move to 3");
                    board.setDisplayBoard(3, symbol);
                }
                if (array[2] == 7) {
                    if (numb == 2) {
                        System.out.println("bot move to 8");
                        board.setDisplayBoard(8, symbol);
                    }
                    if (array[3] == 2) {
                        if (numb == 7) {
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 7");
                        board.setDisplayBoard(7, symbol);
                    }
                }
            }
        }else if (array[0]==7){
            if (numb == 0) {
                System.out.println("bot move to 5");
                board.setDisplayBoard(5, symbol);
            }
            if (array[1] == 2) {
                if (numb == 1) {
                    System.out.println("bot move to 6");
                    board.setDisplayBoard(6, symbol);
                }
                if (array[2] == 4) {
                    if (numb == 2) {
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                    if (array[3] == 9) {
                        if (numb == 3) {
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    } else {
                        if (numb == 2) {
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 4");
                        board.setDisplayBoard(4, symbol);
                    }
                }
            } else if (array[1] == 1) {
                if (numb == 1) {
                    System.out.println("bot move to 4");
                    board.setDisplayBoard(4, symbol);
                }
                if (array[2] == 6) {
                    if (numb == 2) {
                        System.out.println("bot move to 8");
                        board.setDisplayBoard(8 ,symbol);
                    }
                    if (array[3] == 2) {
                        if (numb == 3) {
                            System.out.println("bot move to 3");
                            board.setDisplayBoard(3, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 6");
                        board.setDisplayBoard(6, symbol);
                    }
                }
            } else if (array[1] == 3){
                if (numb == 1) {
                    System.out.println("bot move to 2");
                    board.setDisplayBoard(2, symbol);
                }
                if (array[2] == 8) {
                    if (numb == 2) {
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                    if (array[3] == 1) {
                        if (numb == 3) {
                            System.out.println("bot move to 4");
                            board.setDisplayBoard(4, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 4");
                            board.setDisplayBoard(4, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                }
            } else if (array[1] == 4) {
                if (numb == 1) {
                    System.out.println("bot move to 1");
                    board.setDisplayBoard(1, symbol);
                }
                if (array[2] == 9) {
                    if (numb == 2) {
                        System.out.println("bot move to 8");
                        board.setDisplayBoard(8, symbol);
                    }
                    if (array[3] == 2) {
                        if (numb == 3) {
                            System.out.println("bot move to 3");
                            board.setDisplayBoard(3, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 3");
                            board.setDisplayBoard(3, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 8");
                        board.setDisplayBoard(8, symbol);
                    }
                }
            } else if (array[1] == 6) {
                if (numb == 1) {
                    System.out.println("bot move to 8");
                    board.setDisplayBoard(8, symbol);
                }
                if (array[2] == 2) {
                    if (numb == 2) {
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                    if (array[3] == 9) {
                        if (numb == 3) {
                            System.out.println("bot move to 3");
                            board.setDisplayBoard(3, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2, symbol);
                    }
                }
            } else if (array[1] == 8) {
                if (numb == 1) {
                    System.out.println("bot move to 9");
                    board.setDisplayBoard(9, symbol);
                }
                if (array[2] == 1) {
                    if (numb == 2) {
                        System.out.println("bot move to 4");
                        board.setDisplayBoard(4, symbol);
                    }
                    if (array[3] == 6) {
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                }
            } else if (array[1] == 9) {
                if (numb == 1) {
                    System.out.println("bot move to 8");
                    board.setDisplayBoard(8, symbol);
                }
                if (array[2] == 2) {
                    if (numb == 2) {
                        System.out.println("bot move to 4");
                        board.setDisplayBoard(4, symbol);
                    }
                    if (array[3] == 6) {
                        if (numb == 7) {
                            System.out.println("bot move to 3");
                            board.setDisplayBoard(3, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2, symbol);
                    }
                }
            }
        }else if (array[0]==8){
            if (numb == 0) {
                System.out.println("bot move to 5");
                board.setDisplayBoard(5, symbol);
            }
            if (array[1] == 2) {
                if (numb == 1) {
                    System.out.println("bot move to 1");
                    board.setDisplayBoard(1, symbol);
                }
                if (array[2] == 9) {
                    if (numb == 2) {
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                    if (array[3] == 7) {
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3,symbol);
                    }
                }
            } else if (array[1] == 1) {
                if (numb == 1) {
                    System.out.println("bot move to 4");
                    board.setDisplayBoard(4, symbol);
                }
                if (array[2] == 6) {
                    if (numb == 2) {
                        System.out.println("bot move to 7");
                        board.setDisplayBoard(7 ,symbol);
                    }
                    if (array[3] == 9) {
                        if (numb == 3) {
                            System.out.println("bot move to 3");
                            board.setDisplayBoard(3, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 3");
                            board.setDisplayBoard(3, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 7");
                        board.setDisplayBoard(7, symbol);
                    }
                }
            } else if (array[1] == 3){
                if (numb == 1) {
                    System.out.println("bot move to 4");
                    board.setDisplayBoard(4, symbol);
                }
                if (array[2] == 6) {
                    if (numb == 2) {
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                    if (array[3] == 1) {
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2, symbol);
                    }
                }
            } else if (array[1] == 4) {
                if (numb == 1) {
                    System.out.println("bot move to 7");
                    board.setDisplayBoard(7, symbol);
                }
                if (array[2] == 3) {
                    if (numb == 2) {
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                    if (array[3] == 1) {
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                }
            } else if (array[1] == 7) {
                if (numb == 1) {
                    System.out.println("bot move to 9");
                    board.setDisplayBoard(9, symbol);
                }
                if (array[2] == 1) {
                    if (numb == 2) {
                        System.out.println("bot move to 4");
                        board.setDisplayBoard(4, symbol);
                    }
                    if (array[3] == 6) {
                        if (numb == 3) {
                            System.out.println("bot move to 3");
                            board.setDisplayBoard(3, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                }
            } else if (array[1] == 9) {
                if (numb == 1) {
                    System.out.println("bot move to 7");
                    board.setDisplayBoard(7, symbol);
                }
                if (array[2] == 3) {
                    if (numb == 2) {
                        System.out.println("bot move to 6");
                        board.setDisplayBoard(6, symbol);
                    }
                    if (array[3] == 4) {
                        if (numb == 3) {
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                }
            } else if (array[1] == 6) {
                if (numb == 1) {
                    System.out.println("bot move to 9");
                    board.setDisplayBoard(9, symbol);
                }
                if (array[2] == 1) {
                    if (numb == 2) {
                        System.out.println("bot move to 7");
                        board.setDisplayBoard(7, symbol);
                    }
                    if (array[3] == 3) {
                        if (numb == 7) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 3");
                            board.setDisplayBoard(3, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                }
            }
        }else if (array[0]==9){
            if (numb == 0) {
                System.out.println("bot move to 5");
                board.setDisplayBoard(5, symbol);
            }
            if (array[1] == 2) {
                if (numb == 1) {
                    System.out.println("bot move to 3");
                    board.setDisplayBoard(3, symbol);
                }
                if (array[2] == 7) {
                    if (numb == 2) {
                        System.out.println("bot move to 6");
                        board.setDisplayBoard(6, symbol);
                    }
                    if (array[3] == 4) {
                        if (numb == 3) {
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 4");
                            board.setDisplayBoard(4, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 7");
                        board.setDisplayBoard(7, symbol);
                    }
                }
            } else if (array[1] == 1) {
                if (numb == 1) {
                    System.out.println("bot move to 4");
                    board.setDisplayBoard(4, symbol);
                }
                if (array[2] == 6) {
                    if (numb == 2) {
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3 ,symbol);
                    }
                    if (array[3] == 7) {
                        if (numb == 3) {
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                        if (array[4] == 9) {
                            //nihil
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                }
            } else if (array[1] == 3){
                if (numb == 1) {
                    System.out.println("bot move to 6");
                    board.setDisplayBoard(6, symbol);
                }
                if (array[2] == 4) {
                    if (numb == 2) {
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2, symbol);
                    }
                    if (array[3] == 8) {
                        if (numb == 3) {
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 4");
                        board.setDisplayBoard(4, symbol);
                    }
                }
            } else if (array[1] == 4) {
                if (numb == 1) {
                    System.out.println("bot move to 2");
                    board.setDisplayBoard(2, symbol);
                }
                if (array[2] == 8) {
                    if (numb == 2) {
                        System.out.println("bot move to 7");
                        board.setDisplayBoard(7, symbol);
                    }
                    if (array[3] == 3) {
                        if (numb == 3) {
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 3");
                            board.setDisplayBoard(3, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 8");
                        board.setDisplayBoard(8, symbol);
                    }
                }
            } else if (array[1] == 7) {
                if (numb == 1) {
                    System.out.println("bot move to 8");
                    board.setDisplayBoard(8, symbol);
                }
                if (array[2] == 2) {
                    if (numb == 2) {
                        System.out.println("bot move to 4");
                        board.setDisplayBoard(4, symbol);
                    }
                    if (array[3] == 6) {
                        if (numb == 3) {
                            System.out.println("bot move to 3");
                            board.setDisplayBoard(3, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2, symbol);
                    }
                }
            } else if (array[1] == 8) {
                if (numb == 1) {
                    System.out.println("bot move to 7");
                    board.setDisplayBoard(7, symbol);
                }
                if (array[2] == 3) {
                    if (numb == 2) {
                        System.out.println("bot move to 6");
                        board.setDisplayBoard(6, symbol);
                    }
                    if (array[3] == 4) {
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 4");
                            board.setDisplayBoard(4, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 3");
                        board.setDisplayBoard(3, symbol);
                    }
                }
            } else if (array[1] == 6) {
                if (numb == 1) {
                    System.out.println("bot move to 3");
                    board.setDisplayBoard(3, symbol);
                }
                if (array[2] == 7) {
                    if (numb == 2) {
                        System.out.println("bot move to 8");
                        board.setDisplayBoard(8, symbol);
                    }
                    if (array[3] == 2) {
                        if (numb == 7) {
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                    } else {
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    }
                } else {
                    if (numb == 2) {
                        System.out.println("bot move to 7");
                        board.setDisplayBoard(7, symbol);
                    }
                }
            }
        }else if (array[0]==5){
            if (numb==0){
                System.out.println();
                board.setDisplayBoard(3,symbol);
            }if (array[1]==1){
                if (numb==1){
                    System.out.println("bot move to 9");
                    board.setDisplayBoard(9, symbol);
                }
                if (array[2]==6) {
                    if (numb == 2) {
                        System.out.println("bot move to 4");
                        board.setDisplayBoard(4, symbol);
                    }
                    if (array[3] == 2) {
                        if (numb == 3) {
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    } else if (array[3] == 8) {
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    }
                }else {
                    if (numb==2){
                        System.out.println("bot move to 6");
                        board.setDisplayBoard(6, symbol);
                    }
                }
            }else if (array[1]==2){
                if (numb==1){
                    System.out.println("bot move to 8");
                    board.setDisplayBoard(8, symbol);
                }
                if (array[2]==1){
                    if (numb==2){
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                    if (array[3]==7){
                        if (numb==3){
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    }
                }else if (array[2]==4){
                    if (numb==2){
                        System.out.println("bot move to 6");
                        board.setDisplayBoard(6, symbol);
                    }
                    if (array[3]==9){
                        if (numb==3){
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    }
                }else if (array[2]==6){
                    if (numb==2){
                        System.out.println("bot move to 4");
                        board.setDisplayBoard(4, symbol);
                    }
                    if (array[3]==1){
                        if (numb==3){
                            System.out.println("bot move to 7");
                            board.setDisplayBoard(7, symbol);
                        }
                    }else if (array[3]==7){
                        if (numb==3){
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                    }
                }else if (array[2]==7){
                    if (numb==2){
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                    if (array[3]==6){
                        if (numb==2){
                            System.out.println("bot move to 4");
                            board.setDisplayBoard(4, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }
                }else if (array[2]==9){
                    if (numb==2){
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                    if (array[3]==4){
                        if (numb==3){
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }else if (array[3]==6) {
                        if (numb == 3) {
                            System.out.println("bot move to 4");
                            board.setDisplayBoard(4, symbol);
                        }
                    }
                }
            }else if (array[1]==4){
                    if (numb==1){
                        System.out.println("bot move to 6");
                        board.setDisplayBoard(6, symbol);
                    }
                    if (array[2]==9){
                        if (numb==2){
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                        if (array[3]==2){
                            if (numb==3){
                                System.out.println("bot move to 8");
                                board.setDisplayBoard(8, symbol);
                            }
                        }else {
                            if (numb==3){
                                System.out.println("bot move to 2");
                                board.setDisplayBoard(2, symbol);
                            }
                        }
                    }else {
                        if (numb==2){
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    }
            }else if (array[1]==6){
                if (numb==1){
                    System.out.println("bot move to 4");
                    board.setDisplayBoard(4, symbol);
                }
                if (array[2]==1){
                    if (numb==2){
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                    if (array[3]==2) {
                        if (numb == 3) {
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    }else if (array[3]==8){
                        if (numb==3){
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    }
                }else if (array[2]==2){
                    if (numb==2){
                        System.out.println("bot move to 8");
                        board.setDisplayBoard(8, symbol);
                    }
                    if (array[3]==9){
                        if (numb==3){
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                    }else if (array[3]==1){
                        if (numb==3){
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    }
                }else if (array[2]==7){
                    if (numb==2){
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2, symbol);
                    }
                    if (array[3]==1){
                        if (numb==3){
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                    }
                }else if (array[2]==8){
                    if (numb==2){
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2, symbol);
                    }
                    if (array[3]==1){
                        if (numb==3){
                            System.out.println("bot move to 9");
                            board.setDisplayBoard(9, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 1");
                            board.setDisplayBoard(1, symbol);
                        }
                    }
                }else if (array[2]==9){
                    if (numb==2){
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                    if (array[3]==2){
                        if (numb==3){
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    }else {
                        if (numb==3){
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    }
                }
            }else if (array[1]==7){
                if (numb==1){
                    System.out.println("bot move to 9");
                    board.setDisplayBoard(9, symbol);
                }
                if (array[2]==6){
                    if (numb==2) {
                        System.out.println("bot move to 4");
                        board.setDisplayBoard(4, symbol);
                    }
                    if (array[3]==8) {
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    }else if(array[3]==2){
                        if (numb == 3) {
                            System.out.println("bot move to 8");
                            board.setDisplayBoard(8, symbol);
                        }
                    }else if (array[3]==1){
                        if (numb == 3) {
                            System.out.println("bot move to 2");
                            board.setDisplayBoard(2, symbol);
                        }
                    }
                }else {
                    if (numb == 2) {
                        System.out.println("bot move to 6");
                        board.setDisplayBoard(6, symbol);
                    }
                }
            }else if (array[1]==8){
                if (numb == 1) {
                    System.out.println("bot move to 2");
                    board.setDisplayBoard(2, symbol);
                }
                if (array[2]==1){
                    if (numb == 2) {
                        System.out.println("bot move to 9");
                        board.setDisplayBoard(9, symbol);
                    }
                    if (array[3]==6){
                        if (numb == 3) {
                            System.out.println("bot move to 4");
                            board.setDisplayBoard(4, symbol);
                        }
                    }else {
                        if (numb == 3) {
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }
                }else {
                    if (numb == 2) {
                        System.out.println("bot move to 1");
                        board.setDisplayBoard(1, symbol);
                    }
                }
            }else if (array[1]==9){
                if (numb == 1) {
                    System.out.println("bot move to 1");
                    board.setDisplayBoard(1, symbol);
                }
                if (array[2]==2){
                    if (numb == 2) {
                        System.out.println("bot move to 8");
                        board.setDisplayBoard(8, symbol);
                    }
                    if (array[3]==4){
                        if (numb == 3) {
                            System.out.println("bot move to 6");
                            board.setDisplayBoard(6, symbol);
                        }
                    }else if (array[3]==6){
                        if (numb == 3) {
                            System.out.println("bot move to 4");
                            board.setDisplayBoard(4, symbol);
                        }
                    }else if (array[3]==9){
                        if (numb == 3) {
                            System.out.println("bot move to 4");
                            board.setDisplayBoard(4, symbol);
                        }
                    }
                }else {
                    if (numb == 2) {
                        System.out.println("bot move to 2");
                        board.setDisplayBoard(2, symbol);
                    }
                }
            }
        }
        numb++;
    }
}
