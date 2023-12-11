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


public class StairCase_7 {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here

        for (int i = 0; i < n; i++) {
            System.out.println(" ".repeat(n - i - 1) + "#".repeat(i + 1));
        }

    }

    public static void main(String[] args) {
        staircase(7);
    }
}
