package racingcar.model;

import java.util.Random;

public class Car {
    private final int MAX_MOVE_COUNT = 9;
    private final int MIN_MOVE_COUNT = 0;
    private final int MOVE_CRITERIA = 4;
    private final String name;
    private int position;

    Random random = new Random();

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }
    public int getPosition() {
        return position;
    }

    public String positionDashes() {
        return "-".repeat(position);
    }

    public void carMove() {
        int moveCount = random.nextInt(MAX_MOVE_COUNT) + MIN_MOVE_COUNT;

        if (moveCount >= MOVE_CRITERIA) {
            position++;
        }
    }

}