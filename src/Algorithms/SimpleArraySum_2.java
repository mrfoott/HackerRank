package Algorithms;

import java.util.*;

import static Algorithms.SimpleArraySum_2.simpleArraySum;
import static java.util.stream.Collectors.joining;

public class SimpleArraySum_2 {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;

        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }

        return sum;
    }
}
