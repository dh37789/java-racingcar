package racingcar;

import racingcar.controller.RacingGameController;

public class Application {
    public static void main(String[] args) {
        RacingGameController racingGameController = RacingGameController.init();
        racingGameController.play();
    }
}
