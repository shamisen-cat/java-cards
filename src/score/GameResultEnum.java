package score;

public enum GameResultEnum {
    WIN("WIN!!"),
    LOSE("LOSE..."),
    DRAW("DRAW!");
    
    private final String MESSAGE;
    
    private GameResultEnum(String msg) {
        this.MESSAGE = msg;
    }
    
    public String getMessage() {
        return this.MESSAGE;
    }
}
