package racingcar.controller;

import racingcar.domain.racinggame.RacingGame;
import racingcar.domain.racinggame.service.RacingGameService;
import racingcar.view.RacingGameView;

public class RacingGameController {
    private static RacingGame racingGame;
    private static RacingGameService racingGameService;
    private static RacingGameView racingGameView;

    public static RacingGameController init() {
        racingGame = RacingGame.getInstance();
        racingGameService = new RacingGameService();
        racingGameView = new RacingGameView();
        RacingGame.init();
        return new RacingGameController();
    }

    public void play() {
        racingGameView.gameStart();
    }

    public void createCar() {
        try {
            racingGameService.createCar();
        } catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
            racingGameView.gameStart();
            return;
        }
        racingGameView.inputPlayCount();
    }

    public void inputLap() {
        try {
            racingGameService.inputLap();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            racingGameView.inputPlayCount();
        }
        racingGameView.racingStart();
    }

    public void racingStart() {
        racingGameService.racingStart();
        racingResult();
    }

    private void racingResult() {
        racingGameService.racingResult();
    }
}
