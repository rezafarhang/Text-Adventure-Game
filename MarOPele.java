package project;

import java.util.Random;
import java.util.Scanner;

class home {

    boolean has_bomb = false;
    boolean userLocation = false;
    boolean has_ladder = false;
}


class MarOPele {

    int userRow = 0;
    int userCol = 0;
    Scanner input = new Scanner(System.in);
    int bombNums = 5;
    int ladder = 5;
    int matrixLength = 7;
    home arr[][] = new home[matrixLength][matrixLength];

    MarOPele() {
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixLength; j++) {
                arr[i][j] = new home();
            }
        }
    }

    public int randPr(int num) {
        Random rand = new Random();
        return (rand.nextInt(num));
    }

    public int randPr(int num1, int num2) {
        Random rand = new Random();
        return (rand.nextInt((num2 - num1) + 1) + num1);
    }

    public int tas() {
        return randPr(1, 6);
    }

    public void bombRandSet() {
        int rowNum;
        int colNum;
        for (int i = 0; i < bombNums; i++) {
            rowNum = randPr(matrixLength);
            colNum = randPr(matrixLength);
            if (rowNum != matrixLength && colNum != matrixLength && rowNum != 0 && colNum != 0) {
                arr[rowNum][colNum].has_bomb = true;
            }
        }
        for (int i = 0; i < ladder; i++) {
            rowNum = randPr(matrixLength);
            colNum = randPr(matrixLength);
            if (rowNum != matrixLength && colNum != matrixLength && rowNum != 0 && colNum != 0) {
                arr[rowNum][colNum].has_ladder = true;
            }
        }
    }

    public void drawBoard() {
        for (int x = 0; x < matrixLength; x++) {
            System.out.print("|");
            for (int y = 0; y < matrixLength; y++) {
                if (arr[x][y].userLocation == true) {
                    System.out.print("*|");
                } else {
                    if (arr[x][y].has_bomb == false) {
                        if (arr[x][y].has_ladder == true) {
                            System.out.print((char) 27 + "[34m$" + (char) 27 + "[37m|");
                        } else {
                            System.out.print("_|");
                        }
                    } else {
                        System.out.print((char) 27 + "[31m^" + (char) 27 + "[37m|");
                    }
                }
            }
            System.out.println();
        }
    }

    public void transferBombUser(int row, int col) {
        if (row == 0) {
            userRow = 0;
        } else {
            userRow = row - 1;
        }
        if (col == 0) {
            userCol = randPr(0, matrixLength - 1);
        } else {
            userCol = randPr(0, col);
        }
    }

    public void transferLaddUser(int row, int col) {
        if (row == matrixLength - 1) {
            userRow = matrixLength - 1;
        } else {
            userRow = row + 1;
        }
        if (col == matrixLength - 1) {
            userCol = randPr(0, matrixLength);
        } else {
            userCol = randPr(col, matrixLength - 1);
        }
        if (arr[userRow][userRow].has_bomb) {
            transferBombUser(userRow, userCol);
        }
    }

    public boolean play() {
        bombRandSet();
        arr[userRow][userCol].userLocation = true;
        drawBoard();
        int numTas;
        System.out.println("Hello!Welcome to marOpele game:)\n Choose:\n 1- Start\n 2- Exit");
        if (input.nextInt() == 2) {
            System.out.println("Game Over!");
            return false;
        } else {
            boolean winFlag = true;
            while (winFlag) {
                while (true) {
                    System.out.println("Throw the dice!Type: 1");
                    if (input.nextInt() == 1) {
                        numTas = tas();
                        System.out.println("Dice number: " + numTas);
                        arr[userRow][userCol].userLocation = false;
                        break;
                    } else {
                        System.out.println("Please enter a valid number.");
                    }
                }
                userCol += numTas;
                if (userRow == matrixLength - 1 && userCol >= matrixLength - 1) {
                    System.out.println("YOU WON!!!!");
                    winFlag = false;
                } else {
                    if (userCol > matrixLength || userCol == matrixLength) {
                        userCol = userCol - matrixLength;
                        if (userCol >= matrixLength) {
                            userCol -= 1;
                        }
                    } else {
                        userRow++;
                    }
                    while (arr[userRow][userCol].has_bomb || arr[userRow][userCol].has_ladder) {
                        while (arr[userRow][userCol].has_bomb) {
                            transferBombUser(userRow, userCol);
                        }
                        while (arr[userRow][userCol].has_ladder) {
                            transferLaddUser(userRow, userCol);
                        }
                    }
                    arr[userRow][userCol].userLocation = true;
                    drawBoard();
                }
            }
            return true;
        }
    }
}
