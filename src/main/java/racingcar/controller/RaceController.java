package racingcar.controller;

import racingcar.model.Car;
import racingcar.service.RaceService;
import racingcar.view.*;

import java.util.List;

public class RaceController {

    private final Output output;
    private final Input input;
    private final RaceService raceService;

    public RaceController(Output output, Input input, RaceService raceService) {
        this.output = output;
        this.input = input;
        this.raceService = raceService;
    }

    private List<Car> initializeCars() {
        output.printInputCarName();
        return raceService.setCarList(input.scanCarName());
    }

    private int setTryNum() {
        output.printInputTryNum();
        return input.scanTryNum();
    }

    public void startRace() {
        List<Car> carList = initializeCars();
        int tryNum = setTryNum();

        output.printStartRace();
        while (tryNum > 0) {
            raceService.race(carList);
            output.printCarPosition(carList);

            System.out.println("\n");
            tryNum--;
        }

        output.printRaceWinnerCar(raceService.findWinnerCar(carList));
    }
}
