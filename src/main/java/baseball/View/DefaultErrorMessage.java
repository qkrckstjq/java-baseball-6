package baseball.View;

public enum DefaultErrorMessage {
    VALITDATE_NUMBER("숫자만 입력가능합니다."),
    VALIDATE_INPUT_NUMBER("3자리만 입력가능합니다."),
    VALIDATE_DUPLICATE("중복된 숫자는 입력할 수 없습니다."),
    VALIDATE_INPUT_RESTART("1또는 2를 입력가능합니다.");

    private String message;

    DefaultErrorMessage (String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
