package project;

import java.io.IOException;
import java.util.Scanner;

class TimedInput extends Thread {
    //    int count = 0;

    private Scanner input;
    private int seconds;
    private String line = "";

    public TimedInput(Scanner input, int seconds) {
        this.input = input;
        this.seconds = seconds;
    }

    private boolean hasNextLine() {
        try {
            while (System.in.available() == 0) {
                if (this.isInterrupted()) {
                    return false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input.hasNextLine();
    }

    public void run() {
        line = "";
        if (hasNextLine()) {
            line = input.nextLine();
        }
    }

    public String readLine() {
        start();
        long t0 = System.currentTimeMillis();
        while (line.equals("") && System.currentTimeMillis() - t0 < seconds * 1000) ;
        interrupt();
        return line;
    }
}