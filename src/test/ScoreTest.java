package test;

import score.GameResultEnum;
import score.Score;

public class ScoreTest {
    public static void main(String[] args) {
        GameResultEnum WIN = GameResultEnum.WIN;
        GameResultEnum LOSE = GameResultEnum.LOSE;
        GameResultEnum DRAW = GameResultEnum.DRAW;
        
        System.out.println("Checking the enum settings.");
        System.out.println(WIN + ": " + WIN.getMessage());
        System.out.println(LOSE + ": " + LOSE.getMessage());
        System.out.println(DRAW + ": " + DRAW.getMessage());
        
        System.out.println("Generating a new score.");
        Score score = new Score();
        System.out.println(
                     WIN + ": " + score.getWin()
            + " " + LOSE + ": " + score.getLose()
            + " " + DRAW + ": " + score.getDraw()
        );
        
        System.out.println("If the game result is a win.");
        score.incrementScore(WIN);
        System.out.println(
                     WIN + ": " + score.getWin()
            + " " + LOSE + ": " + score.getLose()
            + " " + DRAW + ": " + score.getDraw()
        );
        
        System.out.println("If the game result is a lose.");
        score.incrementScore(LOSE);
        System.out.println(
                     WIN + ": " + score.getWin()
            + " " + LOSE + ": " + score.getLose()
            + " " + DRAW + ": " + score.getDraw()
        );
        
        System.out.println("If the game result is a draw.");
        score.incrementScore(DRAW);
        System.out.println(
                     WIN + ": " + score.getWin()
            + " " + LOSE + ": " + score.getLose()
            + " " + DRAW + ": " + score.getDraw()
        );
    }
}
