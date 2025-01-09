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

    public void startRace() {
        setCars();
    }
}
