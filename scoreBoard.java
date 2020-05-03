package project;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;

class scoreBoard {

    static int counter = 0;
    ArrayList<String> gamerName = new ArrayList<>();
    ArrayList<Integer> gamerScore = new ArrayList<>();
    public FileWriter fw;
    public Formatter fr1;
    public FileWriter fw2;
    public Formatter fr2;

    public scoreBoard() {
        try {
            fw = new FileWriter("names.txt",true);
            fr1 = new Formatter(fw);
            fw2 = new FileWriter("scores.txt",true);
            fr2 = new Formatter(fw2);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void addName(String name) {
        gamerName.add(name);
    }

    public void addScore(Integer score) {
        gamerScore.add(score);
        counter++;
    }

    public void fillNameInFile(String name) {
        System.out.println(name + ":|");
        fr1.format("%s%n", name);
        fr1.close();
    }

    public void fillScoreInFile(Integer Score) {
        System.out.println(Score + "AHAHA");
        fr2.format("%d%n", Score);
        fr2.close();
    }

    public void printScoreBoard() {
        try {
            FileReader fr = new FileReader("names.txt");
            FileReader fr2 = new FileReader("scores.txt");
            for (int i = 0; i < scoreBoard.counter; i++) {
                System.out.println(Files.readAllLines(Paths.get("names.txt")).get(i) + " : " + Files.readAllLines(Paths.get("scores.txt")).get(i));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}