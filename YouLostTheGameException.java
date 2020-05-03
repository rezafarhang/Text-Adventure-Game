package project;

class YouLostTheGameException extends Exception {

    private final String error;

    public YouLostTheGameException(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "You Lost The Game! : " + error;
    }
}