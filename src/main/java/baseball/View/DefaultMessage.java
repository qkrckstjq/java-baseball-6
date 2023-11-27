package baseball.View;

public enum DefaultMessage {
    START_MESSAGE("숫자 야구 게임을 시작합니다."),
    INPUT_NUMBER_MESSAGE("숫자를 입력해주세요 : "),
    STRIKE_MESSAGE("스트라이크"),
    BALL_MESSAGE("볼"),
    NOTHING_MESSAGE("낫싱");
    private String message;

    DefaultMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

}
