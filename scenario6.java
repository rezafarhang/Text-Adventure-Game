package project;

import java.util.Scanner;

class scenario6 extends Thread {

    static boolean flag = false;
    String[] qArray = new String[7];
    String[] aArray = new String[7];

    public void run() {
        Scanner input = new Scanner(System.in);
        TimedInput t = new TimedInput(input, 30);
        String line = t.readLine();
        if (line.equals("")) {

            scenario6.flag = true;
            if (gameHandeling.end == false) {
                System.out.println("Timeout!");
                gameHandeling.endGame();
            }
        } else {
            System.out.println("Entered: " + line);
        }

    }
}