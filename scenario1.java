package project;

import static project.scenarioManager.s1;

class scenario1 extends scenarioManager {

    static boolean flag = false;

    public String getDetail() {
        return scenarioManager.s1.detail;
    }

    @Override
    public String getAnswer(int i) {
        return scenarioManager.s1.aArray[i - 1];
    }

    @Override
    public void scoreCalculator() {
        score += 100;
    }
}