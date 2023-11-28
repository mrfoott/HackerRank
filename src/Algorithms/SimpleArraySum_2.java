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
    public static void simpleArraySum(int n, int[] ar) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += ar[i];
        }

        System.out.println(sum);
    }
}

//class Solution {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] ar = new int[n];
//        for (int i = 0; i < n; i++) {
//            ar[i] = sc.nextInt();
//        }
//        // Write your code here
//        SimpleArraySum_2.simpleArraySum(n, ar);
//    }
//}
