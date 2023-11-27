package baseball.Model;

import java.util.HashSet;
import java.util.Set;
import camp.nextstep.edu.missionutils.Randoms;

public class Numbers {
    public static int[] randoms = new int[3];
    public static void makeRandoms () {
        Set<Integer> temp = new HashSet<>();
        for(int i = 0; i < 3; i++) {
            randoms[i] = possibleNumber(temp);
        }
    }
    private static int possibleNumber (Set<Integer> temp) {
        int number;
        while(true) {
            number = Randoms.pickNumberInRange(1,9);
            if(temp.add(number)) {break;}
        }
        return number;
    }



}
