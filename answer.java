package project;

import java.util.Random;
import java.util.Scanner;

class answer {

    boolean win;
    static int count = 0;
    Scanner s = new Scanner(System.in);
    boolean ad = true;
    int score = 0;

    public void c(String a, String b) {
        if (a.equals(b)) {
            ad = true;
            count++;
            score = score + 100;
        } else {
            ad = false;
            System.out.println("Game over! score: " + score);
        }
        if (score > 1000) {
            win = true;
        } else {
            win = false;
        }
    }

    public int anotherRand() {
        Random r = new Random();
        int x = r.nextInt(20 - 10) + 10;
        int y = r.nextInt(20 - 10) + 10;
        System.out.println(x + " + " + y);
        int sum = x + y;
        return sum;
    }

    public int Rand() {
        Random r = new Random();
        int m = r.nextInt(8) + 1;
        int n = r.nextInt(8) + 1;
        System.out.println(m + " + " + n);
        int sum = m + n;
        return sum;
    }
}
