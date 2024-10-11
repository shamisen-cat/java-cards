package score;

public class Score {
    private GameResultEnum gameResult = null;
    
    private int winCount = 0;
    private int loseCount = 0;
    private int drawCount = 0;
    
    public GameResultEnum getGameResult() {
        return this.gameResult;
    }
    
    public void setGameResult(GameResultEnum gameResult) {
        this.gameResult = gameResult;
        
        if (gameResult == GameResultEnum.WIN) {
            this.winCount++;
        } else if (gameResult == GameResultEnum.LOSE) {
            this.loseCount++;
        } else if (gameResult == GameResultEnum.DRAW) {
            this.drawCount++;
        }
    }
    
    public int getWinCount() {
        return this.winCount;
    }
    
    public int getLoseCount() {
        return this.loseCount;
    }
    
    public int getDrawCount() {
        return this.drawCount;
    }
}
