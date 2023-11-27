package baseball.View;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String printInputNumber() {
        System.out.print(DefaultMessage.INPUT_NUMBER_MESSAGE.getMessage());
        return Console.readLine();
    }

    public static String printInputRestart() {
        System.out.println(DefaultMessage.GAME_RESTART_MESSAGE.getMessage());
        return Console.readLine();
    }
}
