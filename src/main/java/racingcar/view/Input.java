package racingcar.view;

import java.util.Scanner;

public class Input {

    Scanner sc = new Scanner(System.in);

    public String scanCarName() {
        String carName = sc.nextLine();
        if (carName.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름을 입력해주세요.");
        }
        return carName;
    }

    public String scanTryNum() {
        String tryNum = sc.nextLine();
        return tryNum;
    }

}
