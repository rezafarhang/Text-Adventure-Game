package project;

import java.util.Scanner;

class result {

    public static void finalresult() {
        Scanner resultClassSc = new Scanner(System.in);
        fillData.fillLastQuestion();//show last question
        String userAnswer = resultClassSc.next();
        if (userAnswer.equals("Mason") || userAnswer.equals("mason")) {
            System.out.println("You're Right! congratulations!");
            gameHandeling.score += 500;
        } else if (userAnswer.equals("jack") || userAnswer.equals("Jack") || userAnswer.equals("david") || userAnswer.equals("David") || userAnswer.equals("bill") || userAnswer.equals("Bill") || userAnswer.equals("mark") || userAnswer.equals("Mark")) {
            System.out.println("You're Wrong!");
        } else {
            System.out.println("Wrong Input Try again!");
            finalresult();
        }
    }
}