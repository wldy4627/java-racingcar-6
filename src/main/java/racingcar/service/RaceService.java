package racingcar.service;

import racingcar.model.Car;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class RaceService {

    public List<Car> setCarList(String carsName) {
        String[] carNameArray = carsName.split(",");
        List<Car> carList = new ArrayList<>();

        for (String carName : carNameArray) {
            validateCarName(carName);
            carList.add(new Car(carName));
        }
        return carList;
    }

    private void validateCarName(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        } else if (carName.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름이 덜 입력되었습니다.");
        }
    }

    public void validateTryNum(int tryNum) {
        if (tryNum < 1) {
            throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
        }
    }

    public void race(List<Car> carList) {
        for (Car car : carList) {
            car.carMove();
        }
    }

    public List<String> findWinnerCar(List<Car> carList) {
        int maxPosition = carList.stream()
                                .mapToInt(Car::getPosition)
                                .max()
                                .orElse(0);

        return carList.stream()
                    .filter(car -> car.getPosition() == maxPosition)
                    .map(Car::getName)
                    .collect(Collectors.toList());
    }

}
