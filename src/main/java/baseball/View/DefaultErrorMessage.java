package baseball.View;

public enum DefaultErrorMessage {
    VALITDATE_NUMBER("숫자만 입력해주세요."),
    VALIDATE_INPUT_NUMBER("3자리만 입력해주세요."),
    VALIDATE_INPUT_RESTART("1또는 2를 입력해주세요.");

    private String message;

    DefaultErrorMessage (String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
