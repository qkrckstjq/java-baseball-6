package baseball.Model;

import baseball.View.DefaultErrorMessage;

import java.util.Arrays;

public class Validation {
    public static int isInteger(String number) throws IllegalArgumentException {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(DefaultErrorMessage.VALITDATE_NUMBER.getMessage());
        }
    }

    public static String[] isValidateLength (String numbers) throws IllegalArgumentException {
        if(numbers.length() != 3) {
            throw new IllegalArgumentException(DefaultErrorMessage.VALIDATE_INPUT_NUMBER.getMessage());
        } else {
            return numbers.split("");
        }
    }

    public static void isValidateRestartNumber (String number) throws IllegalArgumentException {
        if(number.length() != 1) {

        }
    }

}
