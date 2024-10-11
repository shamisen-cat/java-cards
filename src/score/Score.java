package score;

public class Score {
    private int win = 0;
    private int lose = 0;
    private int draw = 0;
    
    public int getWin() {
        return this.win;
    }
    
    public int getLose() {
        return this.lose;
    }
    
    public int getDraw() {
        return this.draw;
    }
    
    public void incrementScore(GameResultEnum gameResult) {
        switch (gameResult) {
            case WIN:
                this.win++;
                break;
            case LOSE:
                this.lose++;
                break;
            case DRAW:
                this.draw++;
                break;
        }
    }
}
