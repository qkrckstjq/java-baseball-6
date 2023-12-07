package baseball.Controller;

import baseball.Model.Service.Numbers;
import baseball.Model.Domain.StepsResult;
import baseball.Model.Service.StepsService;
import baseball.Model.Validation;
import baseball.View.InputView;
import baseball.View.OutputView;

public class GameController {
    public static void start () {
        OutputView.printStart();
        do {
            StepsResult result = new StepsResult();
            Numbers.makeRandoms();
            gameProgress(result);
        } while (restart());
    }
    private static void gameProgress (StepsResult result) {
        while(result.getStrike() != 3) {
            result = new StepsResult();
            int[] inputNumbers = translateInputNumbers(InputView.printInputNumber());
            StepsService.updateResult(result, Numbers.randoms, inputNumbers);
            OutputView.printInputResult(StepsService.getResult(result));
        }
        OutputView.printGameEnd();
    }
    private static boolean restart () {
        return translateInputRestart(InputView.printInputRestart()) == 1;
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
