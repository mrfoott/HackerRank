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

public class PlusMinus_6 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int totalPossitiveValue = 0;
        int totalNegativeValue = 0;
        int totalZeroValue = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                totalPossitiveValue += 1;
            } else if (arr.get(i) < 0) {
                totalNegativeValue += 1;
            } else {
                totalZeroValue += 1;
            }
        }

        double possitive = (double) totalPossitiveValue / arr.size();
        double negative = (double) totalNegativeValue / arr.size();
        double zero = (double) totalZeroValue / arr.size();

        System.out.println(String.format("%.6f", possitive));
        System.out.println(String.format("%.6f", negative));
        System.out.println(String.format("%.6f", zero));
    }

}
