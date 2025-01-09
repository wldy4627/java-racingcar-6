package racingcar.view;

import java.util.Scanner;

public class Input {

    Scanner sc = new Scanner(System.in);

    public String scanCarName() {
        String carName = sc.nextLine();
        return carName;
    }

    public int scanTryNum() {
        int tryNum = sc.nextInt();
        return tryNum;
    }
}
