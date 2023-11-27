package baseball.Model;

public enum ConditionValues {
    GAME_CONDITION_LENGTH(3),
    GAME_RESTART_LENGTH(1);

    private int number;

    ConditionValues (int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
