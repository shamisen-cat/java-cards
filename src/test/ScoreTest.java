package test;

import score.GameResult;
import score.Score;

public class ScoreTest {
    public static void main(String[] args) {
        System.out.println("Checking the enum settings.");
        System.out.println("WIN: " + GameResult.WIN.getMessage());
        System.out.println("LOSE: " + GameResult.LOSE.getMessage());
        System.out.println("DRAW: " + GameResult.DRAW.getMessage());
        
        System.out.println("Generating a new score.");
        Score score = new Score();
        System.out.println("WIN: " + score.getWinCount() + " LOSE: " + score.getLoseCount() + " DRAW: " + score.getDrawCount());
        
        System.out.println("If the game result is a win.");
        score.setGameResult(GameResult.WIN);
        System.out.println("WIN: " + score.getWinCount() + " LOSE: " + score.getLoseCount() + " DRAW: " + score.getDrawCount());
        
        System.out.println("If the game result is a lose.");
        score.setGameResult(GameResult.LOSE);
        System.out.println("WIN: " + score.getWinCount() + " LOSE: " + score.getLoseCount() + " DRAW: " + score.getDrawCount());
        
        System.out.println("If the game result is a draw.");
        score.setGameResult(GameResult.DRAW);
        System.out.println("WIN: " + score.getWinCount() + " LOSE: " + score.getLoseCount() + " DRAW: " + score.getDrawCount());
    }
}
