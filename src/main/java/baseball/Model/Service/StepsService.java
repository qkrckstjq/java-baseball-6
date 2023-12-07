package baseball.Model.Service;

import baseball.View.DefaultMessage;
import baseball.Model.Domain.StepsResult;

public class StepsService {
    public void updateResult (StepsResult result, int[] arr1, int[] arr2) {
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                compareValue(result, i,arr1[i], j, arr2[j]);
            }
        }
    }
    private void compareValue (StepsResult result, int i1, int value1, int i2, int value2) {
        if(value1 == value2 && i1 == i2) {
            result.setStrike(result.getStrike()+1);
        } else if (value1 == value2 && i1 != i2) {
            result.setBall(result.getBall()+1);
        }
    }
    public String getResult(StepsResult result) {
        int strike = result.getStrike();
        int ball = result.getBall();
        String strikeMessage = DefaultMessage.STRIKE_MESSAGE.getMessage(strike);
        String ballMessage = DefaultMessage.BALL_MESSAGE.getMessage(ball);
        if(strike == 0 && ball == 0) {
            return DefaultMessage.NOTHING_MESSAGE.getMessage();
        } else if (strike != 0 && ball == 0) {
            return strikeMessage;
        } else if (strike == 0) {
            return ballMessage;
        } else {
            return ballMessage+" "+strikeMessage;
        }
    }
}
