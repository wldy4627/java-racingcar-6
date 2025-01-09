package racingcar.service;

import racingcar.model.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RaceService {

    public List<Car> setCarList(String carsName) {
        String[] carNameArray = carsName.split(",");
        List<Car> carList = new ArrayList<>();
        for (String carName : carNameArray) {
            if (carName.length() > 5) {
                throw new IllegalArgumentException("자동차의 이름은 5자 이하여야 합니다.");
            }
            carList.add(new Car(carName));
        }
        return carList;
    }

    public void race(List<Car> carList) {
        for (Car car : carList) {
            car.carMove();
        }
    }

    public List<String> findWinnerCar(List<Car> carList) {
        carList.sort(Comparator.comparingInt(Car::getPosition));

        int maxPosition = carList.get(carList.size() - 1).getPosition();

        List<String> winnerCarNameList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getPosition() == maxPosition) {
                winnerCarNameList.add(car.getName());
            }
        }
        return winnerCarNameList;
    }
}
