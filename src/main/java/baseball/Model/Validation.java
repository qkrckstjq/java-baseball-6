package baseball.Model;

import baseball.View.DefaultErrorMessage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Validation {
    public static int isInteger(String number) throws IllegalArgumentException {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(DefaultErrorMessage.VALITDATE_NUMBER.getMessage());
        }
    }

    public static String[] isValidateLength (String numbers) throws IllegalArgumentException {
        if(numbers.length() != ConditionValues.GAME_CONDITION_LENGTH.getNumber()) {
            throw new IllegalArgumentException(DefaultErrorMessage.VALIDATE_INPUT_NUMBER.getMessage());
        } else {
            return numbers.split("");
        }
    }

    public static void isValidateRestartNumber (String number) throws IllegalArgumentException {
        if(number.length() != ConditionValues.GAME_RESTART_LENGTH.getNumber()) {
            throw new IllegalArgumentException(DefaultErrorMessage.VALIDATE_INPUT_RESTART.getMessage());
        }
    }

    public static void isDuplicate (String[] numbers) throws IllegalArgumentException {
        Set<String> temp = new HashSet<>();
        for(int i = 0; i < numbers.length; i++) {
            if(!temp.add(numbers[i])) {
                throw new IllegalArgumentException(DefaultErrorMessage.VALIDATE_DUPLICATE.getMessage());
            }
        }
    }

}
