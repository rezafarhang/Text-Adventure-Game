package project;

class finalresult {

    public void theLastResult() {
        finalScore obj = new finalScore();
      //  obj.finalScores();
        if (obj.lastScore == 10000) {
            System.out.println("You Win!");
        } else {
            try {
                throw new YouLostTheGameException("You Lost!");
            } catch (YouLostTheGameException e) {
                System.out.println(e.toString());
            }
        }
    }
}