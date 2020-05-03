package project;

import java.util.ArrayList;

class ScenarioHistory<T extends scenarioManager> {

    private ArrayList<T> history;

    public void add(T s) {
        if (s instanceof scenario1) {
            scenario1.flag = false;
            scenario2.flag = false;
            scenario3.flag = false;
            scenario4.flag = false;
            scenario5.flag = false;
            scenarioManager.s1.score = 0;
            scenarioManager.s2.score = 0;
            scenarioManager.s3.score = 0;
            scenarioManager.s4.score = 0;
            scenarioManager.s5.score = 0;
        } else if (s instanceof scenario2) {
            scenario1.flag = true;
            scenario2.flag = false;
            scenario3.flag = false;
            scenario4.flag = false;
            scenario5.flag = false;
            scenarioManager.s2.score = 0;
            scenarioManager.s3.score = 0;
            scenarioManager.s4.score = 0;
            scenarioManager.s5.score = 0;
        } else if (s instanceof scenario3) {
            scenario1.flag = true;
            scenario2.flag = true;
            scenario3.flag = false;
            scenario4.flag = false;
            scenario5.flag = false;
            scenarioManager.s3.score = 0;
            scenarioManager.s4.score = 0;
            scenarioManager.s5.score = 0;
        } else if (s instanceof scenario4) {
            scenario1.flag = true;
            scenario2.flag = true;
            scenario3.flag = true;
            scenario4.flag = false;
            scenario5.flag = false;
            scenarioManager.s4.score = 0;
            scenarioManager.s5.score = 0;
        } else if (s instanceof scenario5) {
            scenario1.flag = true;
            scenario2.flag = true;
            scenario3.flag = true;
            scenario4.flag = true;
            scenario5.flag = false;
            scenarioManager.s5.score = 0;
        }
    }

    public void undo() {
        if (scenario5.flag == true) {
            scenario4.flag = true;
            scenario5.flag = false;
            scenarioManager.s5.score = 0;
        } else if (scenario4.flag == true) {
            scenario3.flag = true;
            scenario4.flag = false;
            scenarioManager.s4.score = 0;
        } else if (scenario3.flag == true) {
            scenario2.flag = true;
            scenario3.flag = false;
            scenarioManager.s3.score = 0;
        } else if (scenario2.flag == true) {
            scenario1.flag = true;
            scenario2.flag = false;
            scenarioManager.s2.score = 0;
        } else if (scenario1.flag == true) {
            scenario1.flag = false;
            scenarioManager.s1.score = 0;
        }
    }
}