package racingcar.service;

import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

public class RaceService {

    private List<Car> carList = new ArrayList<>();
    private int carNum;

    public List<Car> getCarList(String cars) {
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
        for (int i = 0; i < carList.size(); i++) {
            carList.get(i).carMove();
        }
    }
}
