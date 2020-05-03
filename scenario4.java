package project;

class scenario4 extends scenarioManager {

    static boolean flag = false;

    @Override
    public String getDetail() {
        return scenarioManager.s4.detail;
    }

    @Override
    public String getAnswer(int i) {
        return scenarioManager.s4.aArray[i - 1];
    }

    public void scoreCalculator() {
        score += 100;
    }
}