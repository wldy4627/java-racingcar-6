package racingcar.controller;

import racingcar.model.Car;
import racingcar.service.RaceService;
import racingcar.view.*;

import java.util.List;

public class RaceController {

    Output output = new Output();
    Input input = new Input();
    RaceService service = new RaceService();

    private void setCars() {
        output.printInputCarName();
        List<Car> carList = service.getCarList(input.scanCarName());
    }

    private int setTryNum() {
        output.printInputTryNum();
        return input.scanTryNum();
    }

    public void startRace() {
        setCars();
        int tryNum = setTryNum();

        while (tryNum > 0) {

        }
    }
}
