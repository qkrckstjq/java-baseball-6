package baseball.View;

public class OutputView {
    public static void printStart() {
        System.out.println(DefaultMessage.START_MESSAGE.getMessage());
    }

    public static void printGameEnd() {
        System.out.println(DefaultMessage.GAME_END_MESSAGE.getMessage());
    }

    public static void printInputResult(String result) {
        System.out.println(result);
    }
}
