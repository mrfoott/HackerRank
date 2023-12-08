package Algorithms.WarmUp;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DiagonalDifference_5 {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftSum = 0;
        int rightSum = 0;
        int result;

        for (int i = 0; i < arr.size(); i++) {
            leftSum += arr.get(i).get(i);
            rightSum += arr.get(i).get(arr.size() - 1 - i);
        }

        result = Math.abs(leftSum - rightSum);
        return result;
    }

}
