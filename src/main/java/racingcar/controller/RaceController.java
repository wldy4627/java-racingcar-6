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

    private List<Car> setCars() {
        output.printInputCarName();
        List<Car> carList = raceService.setCarList(input.scanCarName());

        return carList;
    }

    private int setTryNum() {
        output.printInputTryNum();
        return input.scanTryNum();
    }

    public void startRace() {
        List<Car> carList = setCars();
        int tryNum = setTryNum();

        output.printStartRace();
        while (tryNum > 0) {
            raceService.race();
            output.printCarPosition(carList);

            System.out.println("\n");
            tryNum--;
        }

        output.printRaceWinnerCar(raceService.findWinnerCar());
    }
}
