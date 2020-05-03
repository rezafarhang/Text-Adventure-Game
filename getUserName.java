package project;
import java.util.Scanner;

class getUserName {

    Scanner user = new Scanner(System.in);

    public void getUser() {
        System.out.println("Please Enter Your Name!");
        scoreBoard scBoard = new scoreBoard();
        String Username = user.next();
        scBoard.addName(Username);
        scBoard.fillNameInFile(Username);
    }
}