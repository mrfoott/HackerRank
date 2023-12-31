package Algorithms.WarmUp;

import java.util.*;

import static java.util.stream.Collectors.joining;

public class CompareTheTriplets_3 {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                alice += 1;
            } else if (a.get(i) < b.get(i)) {
                bob += 1;
            } else {
                continue;
            }
        }

        result.add(alice);
        result.add(bob);

        return result;
    }
}


