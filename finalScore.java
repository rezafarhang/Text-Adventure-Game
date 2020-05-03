package project;

class finalScore {

    int lastScore;

    public void finalScores() {
        lastScore = gameHandeling.score + scenarioManager.s1.score + scenarioManager.s2.score + scenarioManager.s3.score + scenarioManager.s4.score + scenarioManager.s5.score;
        scoreBoard scBoard = new scoreBoard();
        scBoard.addScore(lastScore);
        scBoard.fillScoreInFile(lastScore);
    }
}