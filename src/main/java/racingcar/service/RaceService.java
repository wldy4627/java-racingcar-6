package racingcar.service;

import racingcar.model.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RaceService {

    private List<Car> carList = new ArrayList<>();
    private int carNum;

    public List<Car> setCarList(String cars) {
        String[] carNameArray = cars.split(",");
        for (String carName : carNameArray) {
            if (carName.length() > 5) {
                throw new IllegalArgumentException("자동차의 이름은 5자 이하여야 합니다.");
            }
            carList.add(new Car(carName));
        }
        carNum = carNameArray.length;
        return carList;
    }

    public void race() {
        for (int i = 0; i < carNum; i++) {
            carList.get(i).carMove();
        }
    }

    public List<String> findWinnerCar() {
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
