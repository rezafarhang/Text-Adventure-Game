package project;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

 class fileData {
     static void fillDataInFile() throws IOException {
//..........................Question1.................````.......
        FileWriter fw1 = new FileWriter("Question1.txt");
        Formatter fr1 = new Formatter(fw1);
        fr1.format("%s%n", "1.What was the purpose of your robbery?");
        fr1.format("%s%n", "2.How did you meet each other?");
        fr1.format("%s%n", "3.Who killed the dealer?");
        fr1.format("%s%n", "4.Who destroyed the security system?");
        fr1.format("%s%n", "5.How did you trust these people?");
        fr1.format("%s%n", "6.Why did you get trapped?");
        fr1.format("%s%n", "7.Who planned this whole robbery?");
        fw1.close();
//..........................Question2.......................
        FileWriter fw2 = new FileWriter("Question2.txt");
        Formatter fr2 = new Formatter(fw2);
        fr2.format("%s%n", "1.What was the purpose of your robbery?");
        fr2.format("%s%n", "2.How did you meet each other?");
        fr2.format("%s%n", "3.Who killed the dealer?");
        fr2.format("%s%n", "4.Who destroyed the security system?");
        fr2.format("%s%n", "5.From when do you have the plan of robbing in mind?");
        fr2.format("%s%n", "6.Why did you choose this store to steal from?");
        fr2.format("%s%n", "7.Why did you get trapped?");
        fw2.close();
//..........................Question3.........................
        FileWriter fw3 = new FileWriter("Question3.txt");
        Formatter fr3 = new Formatter(fw3);
        fr3.format("%s%n", "1.What was the purpose of your robbery?");
        fr3.format("%s%n", "2.How did you meet each other?");
        fr3.format("%s%n", "3.Who killed the dealer?");
        fr3.format("%s%n", "4.Who destroyed the security system?");
        fr3.format("%s%n", "5.Why was the gun near to you?");
        fr3.format("%s%n", "6.Why did you get trapped again?");
        fr3.format("%s%n", "7.How did you want to share the money?");
        fw3.close();
//...........................Quetion4...........................
        FileWriter fw4 = new FileWriter("Question4.txt");
        Formatter fr4 = new Formatter(fw4);
        fr4.format("%s%n", "1.What was the purpose of your robbery?");
        fr4.format("%s%n", "2.How did you meet each other?");
        fr4.format("%s%n", "3.Who killed the dealer?");
        fr4.format("%s%n", "4.From when do you have the plan of robbing in mind?");
        fr4.format("%s%n", "5.Why did you get trapped?");
        fr4.format("%s%n", "6.Why did your hat fell?");
        fr4.format("%s%n", "7.Why didn’t you use your strength to escape?");
        fw4.close();
//..........................Question5............................
        FileWriter fw5 = new FileWriter("Question5.txt");
        Formatter fr5 = new Formatter(fw5);
        fr5.format("%s%n", "1.What was the purpose of your robbery?");
        fr5.format("%s%n", "2.How did you meet each other?");
        fr5.format("%s%n", "3.Who killed the dealer?");
        fr5.format("%s%n", "4.Who destroyed the security system?");
        fr5.format("%s%n", "5.They wanted you because of your talent?");
        fr5.format("%s%n", "6.Why did you get trapped?");
        fr5.format("%s%n", "7.Who planned this whole robbery?");
        fw5.close();
//.........................Detail................................
        FileWriter fwd = new FileWriter("Detail.txt");
        Formatter frd = new Formatter(fwd);
        frd.format("%s%n%s%n%s%n%s%n%s%n", "1-Bill:", "Taxi Driver",
                "ExRacing Driver",
                "Without Criminal History",
                "Married");
        frd.format("%s%n%s%n%s%n%s%n%s%n%s%n", "2-Mark:", "IT Developer", "Hacker",
                "Very Smart", "Arrested For Fake Sale Pages", "Single");
        frd.format("%s%n%s%n%s%n%s%n", "3-Jack:", "Pro Theif", "With Lot Of Criminal History", "Divorced");
        frd.format("%s%n%s%n%s%n%s%n%s%n", "4-Mason:", "Body Bulider", "Boxer", "With Street Fight Crimes", "Married");
        frd.format("%s%n%s%n%s%n%s%n", "5-David:", "Key Maker", "So Agile", "Married");
        fwd.close();
//..........................Answer1................................
        FileWriter fa1 = new FileWriter("Answer1.txt");
        Formatter fra1 = new Formatter(fa1);
        fra1.format("%s%n", "actually it was a long time since me and my fiancé wanted to get married but we couldn’t afford the money, so this was a really good chance.");
        fra1.format("%s%n", "Jack and David were talking about their plan while they were in my cab and I heard about it and threatened them to join them.");
        fra1.format("%s%n", "I heard a shoot sound while i was in my car and i have no idea who killed the dealer!");
        fra1.format("%s%n", "Mark, obviously.");
        fra1.format("%s%n", "I trusted my guts!");
        fra1.format("%s%n", "after the shoot sound, we all lost track of our plan and during that moment the cops suddenly arrived.They are really fast.");
        fra1.format("%s%n", "Jack, I guess.");
        fa1.close();
        fra1.close();
//..........................Answer2...............................
        FileWriter fa2 = new FileWriter("Answer2.txt");
        Formatter fra2 = new Formatter(fa2);
        fra2.format("%s%n", "I am a hacker and obviously I wanted to earn some money.");
        fra2.format("%s%n", "First Jack sent me a message and we met each other and talked and …");
        fra2.format("%s%n", "Mason, he is totally out of mind!");
        fra2.format("%s%n", "Me, obviously!");
        fra2.format("%s%n", "it’s been a while.");
        fra2.format("%s%n", "because it was located in a not crowded alley.");
        fra2.format("%s%n", "Mason shot that guy and he didn’t let us to escape.It was the worst situation.");
        fa2.close();
//...........................Answer3...............................
        FileWriter fa3 = new FileWriter("Answer3.txt");
        Formatter fra3 = new Formatter(fa3);
        fra3.format("%s%n", "actually I wanted to rob without being trapped and I suddenly found this cool people and I said why not? And I could also get my sons patronage!");
        fra3.format("%s%n", "I met David in prison, after  I got free one day I saw him out of the blue and we got into talking and we decided to do this and we found Mark on social media and the other were the friends of those two.");
        fra3.format("%s%n", "Dumb Mason!");
        fra3.format("%s%n", "Mark, obviously");
        fra3.format("%s%n", "I didn’t want to let Mason kill him, so I tried to stop him that the gun fell near me.");
        fra3.format("%s%n", "because of Mason’s hat that fell and he was afraid that the dealer might recognize him, so he shot him and because of the shooting sound people called you.");
        fra3.format("%s%n", "At first me and David wanted to take it all, after that I decided to take it all and kill David!");
        fa3.close();
//..........................Answer4................................
        FileWriter fa4 = new FileWriter("Answer4.txt");
        Formatter fra4 = new Formatter(fa4);
        fra4.format("%s%n", "I had no other purpose except money to make my abs bigger.");
        fra4.format("%s%n", "I knew Mark from the bar.");
        fra4.format("%s%n", "Jack killed him. He didn’t want us to get trapped.");
        fra4.format("%s%n", "it’s been a while");
        fra4.format("%s%n", "after Jack killed that guy Mark got shocked and didn’t let anyone escape and while that the cops arrived.");
        fra4.format("%s%n", "Mark’s hand touched my head and that’s why.");
        fra4.format("%s%n", "oh I didn’t notice that.Damn it!");
        fa4.close();
//.........................Answer5..................................
        FileWriter fa5 = new FileWriter("Answer5.txt");
        Formatter fra5 = new Formatter(fa5);
        fra5.format("%s%n", "actually I really didn’t want to rob again but Jack egged me on and besides that it was a great deal of money.");
        fra5.format("%s%n", "I knew Jack from the prison.");
        fra5.format("%s%n", "Mason, that nasty troublemaker.");
        fra5.format("%s%n", "Mark, obviously.");
        fra5.format("%s%n", "I think so, but this was a bad idea because I’m so slow and stupid!");
        fra5.format("%s%n", "After people heard the shooting sound they quickly called the cops and Mark didn’t let us to escape and we got totally busted.");
        fra5.format("%s%n", "Jack and me. What a Bigs mistake.");
        fa5.close();
    }
//.............readDetail......

    static void readDetail() {
        try {
            FileReader fr23 = new FileReader("Detail.txt");
            for (int i = 0; i < 24; i++) {
                System.out.println(Files.readAllLines(Paths.get("Detail.txt")).get(i));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//..............readAnswer1................

    static void readAnswer1() throws IOException {
        FileReader fr = new FileReader("Answer1.txt");
        Scanner sc = new Scanner(fr);
        for (int i = 0; i < 7; i++) {
            scenarioManager.s1.aArray[i] = sc.nextLine();
        }
    }
//..............readAnswer2.................

    static void readAnswer2() throws IOException {
        FileReader fr = new FileReader("Answer2.txt");
        Scanner sc = new Scanner(fr);
        for (int i = 0; i < 7; i++) {
            scenarioManager.s2.aArray[i] = sc.nextLine();
        }
    }
//..............readAnswer3.................

    static void readAnswer3() throws IOException {
        FileReader fr = new FileReader("Answer3.txt");
        Scanner sc = new Scanner(fr);
        for (int i = 0; i < 5; i++) {
            scenarioManager.s3.aArray[i] = sc.nextLine();
        }
    }
//..............readAnswer4.................

    static void readAnswer4() throws IOException {
        FileReader fr = new FileReader("Answer4.txt");
        Scanner sc = new Scanner(fr);
        for (int i = 0; i < 7; i++) {
            scenarioManager.s4.aArray[i] = sc.nextLine();
        }
    }
//..............readAnswer5................

    static void readAnswer5() throws IOException {
        FileReader fr = new FileReader("Answer5.txt");
        Scanner sc = new Scanner(fr);
        for (int i = 0; i < 7; i++) {
            scenarioManager.s5.aArray[i] = sc.nextLine();
        }
    }
//.....................readQuestion1........

    public static void readQuestion1() throws IOException {
        FileReader fr = new FileReader("Question1.txt");
        Scanner sc = new Scanner(fr);
        for (int j = 0; j < 7; j++) {
            scenarioManager.s1.qArray[j] = sc.nextLine();
        }
    }
//....................readQuestion2.........

    public static void readQuestion2() throws IOException {
        FileReader fr = new FileReader("Question2.txt");
        Scanner sc = new Scanner(fr);
        for (int j = 0; j < 7; j++) {
            scenarioManager.s2.qArray[j] = sc.nextLine();
        }
    }
//....................readQuestion3.........

    public static void readQuestion3() throws IOException {
        FileReader fr = new FileReader("Question3.txt");
        Scanner sc = new Scanner(fr);
        for (int j = 0; j < 7; j++) {
            scenarioManager.s3.qArray[j] = sc.nextLine();
        }
    }
//.....................readQuetion4..........

    public static void readQuestion4() throws IOException {
        FileReader fr = new FileReader("Question4.txt");
        Scanner sc = new Scanner(fr);
        for (int j = 0; j < 7; j++) {
            scenarioManager.s4.qArray[j] = sc.nextLine();
        }
    }
//.....................readQuestion5..........

    public static void readQuestion5() throws IOException {
        FileReader fr = new FileReader("Question5.txt");
        Scanner sc = new Scanner(fr);
        for (int j = 0; j < 7; j++) {
            scenarioManager.s5.qArray[j] = sc.nextLine();
        }
    }
    
}
