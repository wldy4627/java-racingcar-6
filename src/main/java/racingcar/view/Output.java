package racingcar.view;

import racingcar.model.Car;

import java.util.List;

public class Output {

    public void printInputCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
    }

    public void printInputTryNum() {
        System.out.println("시도할 횟수는 몇회인가요?");
    }

    public void printStartRace() {
        System.out.println("\n실행 결과");
    }

    public void printCarPosition(List<Car> carList) {
        for (Car car : carList) {
            System.out.println(car.getName() + ": " + car.getPosition());
        }
    }
}
