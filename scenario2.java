package project;

class scenario2 extends scenarioManager {

    static boolean flag = false;

    @Override
    public String getDetail() {
        return scenarioManager.s2.detail;
    }

    @Override
    public String getAnswer(int i) {
        return scenarioManager.s2.aArray[i - 1];
    }

    public void scoreCalculator() {
        score += 100;
    }
}