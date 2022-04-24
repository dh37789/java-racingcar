package racingcar.domain.racinggame;

public class RacingGame {
    private static RacingGame racingGame = new RacingGame();

    public static RacingGame getInstance() {return racingGame; }

    public static void init() {
    }
}
