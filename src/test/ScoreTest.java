package test;

import score.GameResultEnum;
import score.Score;

public class ScoreTest {
    public static void main(String[] args) {
        System.out.println("Checking the enum settings.");
        System.out.println("WIN: " + GameResultEnum.WIN.getMessage());
        System.out.println("LOSE: " + GameResultEnum.LOSE.getMessage());
        System.out.println("DRAW: " + GameResultEnum.DRAW.getMessage());
        
        System.out.println("Generating a new score.");
        Score score = new Score();
        System.out.println("WIN: " + score.getWinCount() + " LOSE: " + score.getLoseCount() + " DRAW: " + score.getDrawCount());
        
        System.out.println("If the game result is a win.");
        score.setGameResult(GameResultEnum.WIN);
        System.out.println("WIN: " + score.getWinCount() + " LOSE: " + score.getLoseCount() + " DRAW: " + score.getDrawCount());
        
        System.out.println("If the game result is a lose.");
        score.setGameResult(GameResultEnum.LOSE);
        System.out.println("WIN: " + score.getWinCount() + " LOSE: " + score.getLoseCount() + " DRAW: " + score.getDrawCount());
        
        System.out.println("If the game result is a draw.");
        score.setGameResult(GameResultEnum.DRAW);
        System.out.println("WIN: " + score.getWinCount() + " LOSE: " + score.getLoseCount() + " DRAW: " + score.getDrawCount());
    }
}
