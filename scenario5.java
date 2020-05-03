package project;

class scenario5 extends scenarioManager {

    static boolean flag = false;

    @Override
    public String getDetail() {
        return scenarioManager.s5.detail;
    }

    @Override
    public String getAnswer(int i) {
        return scenarioManager.s5.aArray[i - 1];
    }

    public void scoreCalculator() {
        score += 100;
    }
}