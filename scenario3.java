package project;

class scenario3 extends scenarioManager {

    static boolean flag = false;

    @Override
    public String getDetail() {
        return scenarioManager.s3.detail;
    }

    @Override
    public String getAnswer(int i) {
        return scenarioManager.s3.aArray[i - 1];
    }

    public void scoreCalculator() {
        score += 100;
    }
}