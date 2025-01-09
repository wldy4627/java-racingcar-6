package racingcar.view;

import java.util.Scanner;

public class Input {

    Scanner sc = new Scanner(System.in);

    public String scanCarName() {
        String carName = sc.nextLine();
        return carName;
    }

    public int scanTryNum() {
        String input = sc.nextLine();

        if (isNumeric(input)) {
            return Integer.parseInt(input);
        } else {
            throw new IllegalArgumentException("유효하지 않은 입력입니다.");
        }
    }

    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
