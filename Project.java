package project;

import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Project {

    public static void main(String[] args) {
        //fill data from file
        try {
            fileData.fillDataInFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //get user name
        getUserName user = new getUserName();
        user.getUser();
        fillData.fillDescription(); //game description
        fillData.filldetail();//fill charachter's details
        gameHandeling.startGame();//handle game
        finalScore submitScore = new finalScore();
        submitScore.finalScores();//submit score
        //win state show
        finalresult fb = new finalresult();
        fb.theLastResult();
        //print scores
        scoreBoard sb = new scoreBoard();
        sb.printScoreBoard();
    }
}