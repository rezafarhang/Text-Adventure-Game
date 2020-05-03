package project;

import java.util.Scanner;

class multiplyerGame {

    static boolean win;

    public static void game() {
        answer as = new answer();
        do {
            int d;
            if (answer.count >= 3) {
                d = as.anotherRand();
            } else {
                d = as.Rand();
            }
            Scanner input = new Scanner(System.in);
            TimedInput t = new TimedInput(input, 4);
            String line = t.readLine();
            if (line.equals("")) {
                System.out.println("Timeout!" + " Youre score : " + as.score);
                if (as.score >= 1000) {
                    win = true;
                } else {
                    System.out.println("You Lose! \n Wanna Try Again?(yes/no)");
                    Scanner sc = new Scanner(System.in);
                    if (sc.next() == "yes") {
                        multiplyerGame.game();
                    } else {
                        win = false;
                    }
                }
                break;

            } else {
                as.c(line, d + "");
            }
        } while (as.ad == true);
    }
}