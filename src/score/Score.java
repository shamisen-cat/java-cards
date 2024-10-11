package score;

public class Score {
    private GameResult gameResult = null;
    
    private int winCount = 0;
    private int loseCount = 0;
    private int drawCount = 0;
    
    public GameResult getGameResult() {
        return this.gameResult;
    }
    
    public void setGameResult(GameResult gameResult) {
        this.gameResult = gameResult;
        
        if (gameResult == GameResult.WIN) {
            this.winCount++;
        } else if (gameResult == GameResult.LOSE) {
            this.loseCount++;
        } else if (gameResult == GameResult.DRAW) {
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
