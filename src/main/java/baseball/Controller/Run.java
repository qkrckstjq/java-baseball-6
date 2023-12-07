package baseball.Controller;

import baseball.Model.Service.Numbers;
import baseball.Model.Domain.StepsResult;
import baseball.Model.Validation;
import baseball.View.InputView;
import baseball.View.OutputView;

public class Run {
    private static StepsResult result = new StepsResult();
    public static void start () {
        OutputView.printStart();
        do {
            result = new StepsResult();
            Numbers.makeRandoms();
            gameProgress();
        } while (restart());
    }
    private static void gameProgress () {
        while(result.getStrike() != 3) {
            int[] numbers = translateInputNumbers(InputView.printInputNumber());
            result.updateResult(Numbers.randoms, numbers);
            OutputView.printInputResult(result.getResult());
        }
        OutputView.printGameEnd();
    }
    private static boolean restart () {
        int inputNumber = translateInputRestart(InputView.printInputRestart());
        return inputNumber == 1;
    }
    private static int[] translateInputNumbers (String numbers) {
        String[] temp = Validation.isValidateLength(numbers);
        Validation.isDuplicate(temp);
        int[] result = new int[temp.length];
        for(int i = 0; i < temp.length; i++) {
            result[i] = Validation.isInteger(temp[i]);
        }
        return result;
    }
    private static int translateInputRestart (String number) {
        Validation.isValidateRestartNumber(number);
        return Validation.isInteger(number);
    }

}
