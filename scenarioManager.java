package project;
abstract class scenarioManager {

    String[] aArray = new String[7];
    String[] qArray = new String[7];
    String[] gArray = new String[14];
    String detail;
    int score = 0;

    abstract public String getAnswer(int i);

    abstract public String getDetail();

    abstract public void scoreCalculator();
    static scenario1 s1 = new scenario1();
    static scenario2 s2 = new scenario2();
    static scenario3 s3 = new scenario3();
    static scenario4 s4 = new scenario4();
    static scenario5 s5 = new scenario5();
}