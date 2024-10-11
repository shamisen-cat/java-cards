package score;

public enum GameResult {
    WIN("WIN!!"),
    LOSE("LOSE..."),
    DRAW("DRAW!");
    
    private final String MESSAGE;
    
    private GameResult(String msg) {
        this.MESSAGE = msg;
    }
    
    public String getMessage() {
        return this.MESSAGE;
    }
}
