package project;

import java.util.Random;
import java.util.Scanner;

enum Gesture {
    rock(1), paper(2), scissors(3);
    private int type;

    Gesture(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}

class rpsGame {

    static boolean Win;

    public static void game() {
        int t = 0;
        int w = 0;
        int l = 0;
        final Random random = new Random();
        while (t < 3) {
            Scanner s = new Scanner(System.in);
            String choice = s.next();
            Gesture gesture = null;
            if (choice.equals("0")) {
                gesture = Gesture.scissors;
            } else if (choice.equals("1")) {
                gesture = Gesture.rock;
            } else if (choice.equals("2")) {
                gesture = Gesture.paper;
            }
            final int computerDraw = random.nextInt(3);
            System.out.println(computerDraw);
            if (computerDraw - gesture.getType() == 2) {
                System.out.println("lose");
                l++;
                t++;
            } else if (computerDraw - gesture.getType() == -2) {
                System.out.println("win");
                w++;
                t++;
            } else if (computerDraw - gesture.getType() == 1) {
                System.out.println("lose");
                l++;
                t++;
            } else if (computerDraw - gesture.getType() == -1) {
                System.out.println("win");
                w++;
                t++;
            } else {
                System.out.println("it's a tie");
            }
        }
        if (w == 2 || w == 3) {
            System.out.println("You Win!");
            Win = true;
        } else {
            System.out.println("You Lose! \n Wanna Try Again?(yes/no)");
            Scanner sc = new Scanner(System.in);
            if (sc.next() == "yes") {
                rpsGame.game();
            } else {
                Win = false;
            }
        }
    }
}