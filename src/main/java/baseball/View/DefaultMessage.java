package baseball.View;

import java.text.Format;
import java.util.Objects;

public enum DefaultMessage {
    START_MESSAGE("숫자 야구 게임을 시작합니다."),
    INPUT_NUMBER_MESSAGE("숫자를 입력해주세요 : "),
    GAME_END_MESSAGE("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    GAME_RESTART_MESSAGE("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    STRIKE_MESSAGE("%d스트라이크"),
    BALL_MESSAGE("%d볼"),
    NOTHING_MESSAGE("낫싱");
    private String message;

    DefaultMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
    public String getMessage(Object... args) {
        return String.format(message, args);
    }
}
