package racingcar.controller;

import racingcar.model.Car;
import racingcar.service.RaceService;
import racingcar.view.*;

import java.util.List;

public class RaceController {

    Output output = new Output();
    Input input = new Input();
    RaceService service = new RaceService();

    private List<Car> setCars() {
        output.printInputCarName();
        List<Car> carList = service.getCarList(input.scanCarName());

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
            service.race();
            output.printCarPosition(carList);

            System.out.println("\n");
            tryNum--;
        }
    }
}
