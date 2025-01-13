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

        String tryNum = input.scanTryNum();

        if (isNumeric(tryNum)) {
            return Integer.parseInt(tryNum);
        } else {
            throw new IllegalArgumentException("유효하지 않은 입력입니다.");
        }
    }

    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void startRace() {
        List<Car> carList = initializeCars();
        int tryNum = setTryNum();
        raceService.validateTryNum(tryNum);

        output.printStartRace();
        for (int i = 0; i < tryNum; i++) {
            raceService.race(carList);
            output.printCarPosition(carList);
            System.out.println("");
        }

        output.printRaceWinnerCar(raceService.findWinnerCar(carList));
    }
}
