package racingcar.view;

import racingcar.model.Car;

import java.util.List;

public class Output {

    public void printInputCarName() {
        System.out.println(Message.INPUT_CAR_NAME.getMessage());
    }

    public void printInputTryNum() {
        System.out.println(Message.INPUT_TRY_NUM.getMessage());
    }

    public void printStartRace() {
        System.out.println(Message.START_RACE.getMessage());
    }

    public void printCarPosition(List<Car> carList) {
        for (Car car : carList) {
            System.out.println(car.getName() + " : " + car.positionDashes());
        }
    }

    public void printRaceWinnerCar(List<String> winnerCarNameList) {
        String winnerCarNames = String.join(", ", winnerCarNameList);
        System.out.println(Message.WINNER_MESSAGE.getMessage() + winnerCarNames);
    }
}
