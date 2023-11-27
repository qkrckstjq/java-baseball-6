package baseball.Model;

import baseball.View.DefaultMessage;

public class StepResult {

    private int strike = 0;
    private int ball = 0;

    public void updateResult (int[] arr1, int[] arr2) {
        strike = 0;
        ball = 0;
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                compareValue(i,arr1[i], j, arr2[j]);
            }
        }
    }

    private void compareValue (int i1, int value1, int i2, int value2) {
        if(value1 == value2 && i1 == i2) {
            this.strike++;
        } else if (value1 == value2 && i1 != i2) {
            this.ball++;
        }
    }

    public String getResult() {
        String strikeMessage = Integer.toString(strike)+DefaultMessage.STRIKE_MESSAGE.getMessage();
        String ballMessage = Integer.toString(ball)+DefaultMessage.BALL_MESSAGE.getMessage();
        if(strike == 0 && ball == 0) {
            return DefaultMessage.NOTHING_MESSAGE.getMessage();
        } else if (strike != 0 && ball == 0) {
            return strikeMessage;
        } else if (strike == 0 && ball != 0) {
            return ballMessage;
        } else {
            return ballMessage+" "+strikeMessage;
        }
    }

    public int getStrike () {
        return strike;
    }

}
