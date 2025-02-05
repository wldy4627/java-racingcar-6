package racingcar.view;

public enum Message {
    INPUT_CAR_NAME("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)"),
    INPUT_TRY_NUM("시도할 횟수는 몇회인가요?"),
    START_RACE("\n실행 결과"),
    WINNER_MESSAGE("최종 우승자 : ");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
