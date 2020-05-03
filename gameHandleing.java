package project;

import java.util.Scanner;

class gameHandeling {

    static int score = 0;
    public static boolean end = false;
    public static int j = 1;
    public static boolean flagres = false;

    public static boolean endGame() {
        boolean flagEnd = false;
        if (scenario1.flag == true & scenario2.flag == true & scenario3.flag == true & scenario4.flag == true & scenario5.flag == true & scenario6.flag == true) {
            result.finalresult();
            flagEnd = true;
            return flagEnd;
        }
        return flagEnd;
    }

    public static void startGame() {
        scenario6 s6obj = new scenario6();
        fillData.fillQuestion();

        if (gameHandeling.endGame() == true) {
            gameHandeling.endGame();
        }
        while (gameHandeling.endGame() == false) {
            for (int i = j; i < 7; i++) {
                int chNumber = i;
                if (flagres == true) {
                    break;
                } else if (chNumber == 1 & scenario1.flag == false) {
                    scenario1.flag = true;
                    for (int index = 0; index < 7; index++) {
                        System.out.println(scenarioManager.s1.qArray[index]);
                    }
                    gameHandeling.game(chNumber);
                } else if (chNumber == 2 & scenario2.flag == false) {
                    scenario2.flag = true;
                    for (int index = 0; index < 7; index++) {
                        System.out.println(scenarioManager.s2.qArray[index]);
                    }
                    gameHandeling.game(chNumber);
                } else if (chNumber == 3 & scenario3.flag == false) {
                    scenario3.flag = true;
                    for (int index = 0; index < 7; index++) {
                        System.out.println(scenarioManager.s3.qArray[index]);
                    }
                    gameHandeling.game(chNumber);
                } else if (chNumber == 4 & scenario4.flag == false) {
                    scenario4.flag = true;
                    for (int index = 0; index < 7; index++) {
                        System.out.println(scenarioManager.s4.qArray[index]);
                    }
                    gameHandeling.game(chNumber);
                } else if (chNumber == 5 & scenario5.flag == false) {
                    scenario5.flag = true;
                    for (int index = 0; index < 7; index++) {
                        System.out.println(scenarioManager.s5.qArray[index]);
                    }
                    gameHandeling.game(chNumber);
                } else if (chNumber == 6 & scenario6.flag == false) {
                    scenario5.flag = true;
                    for (int index = 0; index < 7; index++) {
                        System.out.println(fillData.s6.qArray[index]);
                    }
                    Thread th = new Thread(s6obj);
                    th.start();
                    gameHandeling.game(chNumber);
                } else if (chNumber > 6) {
                    System.err.println("Wrong input!");
                    startGame();
                } else {
                    System.err.println("Sorry! You See This Charachter's Questions! \n please Try Another One.");
                    startGame();
                }
            }
            if (flagres == true) {
                flagres = false;
                startGame();
            }
        }
    }

    public void scoreCalculater() {
        score += 100;
    }

    public static void guessChecker(int input, int ScenarioNumber) {
        Scanner Sc = new Scanner(System.in);
        int choice = Sc.nextInt();
        switch (ScenarioNumber) {

            case 1:
                System.out.println("What's Your Guess?");
                System.out.println("1:" + scenarioManager.s1.gArray[input - 1]);
                System.out.println("2:" + scenarioManager.s1.gArray[input]);
                choice = Sc.nextInt();
                if (choice == 1) {
                    System.out.println("That's Right");
                    scenarioManager.s1.scoreCalculator();
                } else {
                    System.out.println("That's Wrong");
                }
                break;
            case 2:
                System.out.println("What's Your Guess?");
                System.out.println("1:" + scenarioManager.s2.gArray[input - 1]);
                System.out.println("2:" + scenarioManager.s2.gArray[input]);
                choice = Sc.nextInt();
                if (choice == 1) {
                    System.out.println("That's Right");
                    scenarioManager.s2.scoreCalculator();
                } else {
                    System.out.println("That's Wrong");
                }
                break;
            case 3:
                System.out.println("What's Your Guess?");
                System.out.println("1:" + scenarioManager.s3.gArray[input - 1]);
                System.out.println("2:" + scenarioManager.s3.gArray[input]);
                choice = Sc.nextInt();
                if (choice == 1) {
                    System.out.println("That's Right");
                    scenarioManager.s3.scoreCalculator();
                } else {
                    System.out.println("That's Wrong");
                }
                break;
            case 4:
                System.out.println("What's Your Guess?");
                System.out.println("1:" + scenarioManager.s4.gArray[input - 1]);
                System.out.println("2:" + scenarioManager.s4.gArray[input]);
                choice = Sc.nextInt();
                if (choice == 1) {
                    System.out.println("That's Right");
                    scenarioManager.s4.scoreCalculator();
                } else {
                    System.out.println("That's Wrong");
                }
                break;
            case 5:
                System.out.println("What's Your Guess?");
                System.out.println("1:" + scenarioManager.s5.gArray[input - 1]);
                System.out.println("2:" + scenarioManager.s5.gArray[input]);
                choice = Sc.nextInt();
                if (choice == 1) {
                    System.out.println("That's Right");
                    scenarioManager.s5.scoreCalculator();
                } else {
                    System.out.println("That's Wrong");
                }
                break;
        }
    }

    public static void game(int chNum) {
        fillData.fillAnswer();
        fillData.fillGuess();
        scenario6 s6o = new scenario6();
        int counter = 0;
        Scanner gameSc = new Scanner(System.in);

        while (true) {
            String input = gameSc.next();
            if (input.equals("next")) {
                break;
            } else if (input.equals("undo")) {
                ScenarioHistory<scenarioManager> undoObj = new ScenarioHistory<>();
                undoObj.undo();
                break;
            } else if (input.equals("scenario1")) {
                ScenarioHistory<scenarioManager> s1startObj = new ScenarioHistory<>();
                s1startObj.add(new scenario1());
                gameHandeling.flagres = true;
                gameHandeling.j = 1;
                break;
            } else if (input.equals("scenario2")) {
                ScenarioHistory<scenarioManager> s2startObj = new ScenarioHistory<>();
                s2startObj.add(new scenario2());
                gameHandeling.flagres = true;
                gameHandeling.j = 2;
                break;
            } else if (input.equals("scenario3")) {
                ScenarioHistory<scenarioManager> s3startObj = new ScenarioHistory<>();
                s3startObj.add(new scenario3());
                gameHandeling.flagres = true;
                gameHandeling.j = 3;
                break;
            } else if (input.equals("scenario4")) {
                ScenarioHistory<scenarioManager> s4startObj = new ScenarioHistory<>();
                s4startObj.add(new scenario4());
                gameHandeling.flagres = true;
                gameHandeling.j = 4;
                break;
            } else if (input.equals("scenario5")) {
                ScenarioHistory<scenarioManager> s5startObj = new ScenarioHistory<>();
                s5startObj.add(new scenario5());
                gameHandeling.flagres = true;
                gameHandeling.j = 5;
                break;
            } else {
                if (Integer.parseInt(input) > 7) {
                    System.out.println("Wrong Input!");
                } else {
                    if (chNum == 1) {
                        if ((Integer.parseInt(input) - 1) == 2) {
                            System.out.println("this is rock paper scissors game which '0' resembles scissors, '1' resembles rock and '2' resembles paper so play the game and enjoy!");//rps gsme description
                            rpsGame.game();
                            if (rpsGame.Win == true) {
                                guessChecker(Integer.parseInt(input), 1);
                                System.out.println(scenarioManager.s1.aArray[Integer.parseInt(input) - 1]);
                            } else {
                                System.out.println("You Lose The Game So You Can't See The Answer.Sorry!");
                            }
                        } else {
                            guessChecker(Integer.parseInt(input), 1);
                            System.out.println(scenarioManager.s1.aArray[Integer.parseInt(input) - 1]);
                        }
                    }
                    if (chNum == 2) {
                        guessChecker(Integer.parseInt(input), 2);
                        System.out.println(scenarioManager.s2.aArray[Integer.parseInt(input) - 1]);
                    }
                    if (chNum == 3) {
                        if ((Integer.parseInt(input) - 1) == 2) {
                            System.out.println("This is 1+2=3 game,your task is to calculate the total.");//mul game description
                            multiplyerGame.game();
                            if (multiplyerGame.win == true) {
                                guessChecker(Integer.parseInt(input), 3);
                                System.out.println(scenarioManager.s3.aArray[Integer.parseInt(input) - 1]);
                            } else {
                                System.out.println("You Lose The Game So You Can't See The Answer.Sorry!");
                            }
                        } else {
                            guessChecker(Integer.parseInt(input), 3);
                            System.out.println(scenarioManager.s3.aArray[Integer.parseInt(input) - 1]);
                        }
                    }
                    if (chNum == 4) {
                        if ((Integer.parseInt(input) - 1) == 2) {
                            System.out.println("This is marOpele game,the only thing you have to do is to enter 1:|");//mul gsme description
                            MarOPele ply = new MarOPele();
                            ply.play();
                            if (ply.play() == true) {
                                guessChecker(Integer.parseInt(input), 4);
                                System.out.println(scenarioManager.s3.aArray[Integer.parseInt(input) - 1]);
                            } else {
                                System.out.println("You Lose The Game So You Can't See The Answer.Sorry!");
                            }
                        } else {
                            guessChecker(Integer.parseInt(input), 4);
                            System.out.println(scenarioManager.s3.aArray[Integer.parseInt(input) - 1]);
                        }
                    }
                    if (chNum == 5) {
                        guessChecker(Integer.parseInt(input), 5);
                        System.out.println(scenarioManager.s5.aArray[Integer.parseInt(input) - 1]);
                    }
                    if (chNum == 6) {
                        System.out.println(fillData.s6.aArray[Integer.parseInt(input) - 1]);
                        counter++;
                        if (counter == 7) {
                            scenario6.flag = true;
                            gameHandeling.end = true;
                            break;
                        }

                    }
                }
            }
        }
    }
}