package racingcar;

import racingcar.controller.RaceController;
import racingcar.service.RaceService;
import racingcar.view.Input;
import racingcar.view.Output;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Output output = new Output();
        Input input = new Input();
        RaceService raceService = new RaceService();

        RaceController raceController = new RaceController(output, input, raceService);
        raceController.startRace();
    }
}
