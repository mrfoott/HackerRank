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

public class MiniMaxSum_8 {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        long minVal = 0;
        long maxVal = 0;

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        for (int i = 0; i < arr.size(); i++) {
            list1.add(arr.get(i));
            list2.add(arr.get(i));
        }

        List<Long> minList = new ArrayList<>();
        List<Long> maxList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            maxList.add(Long.valueOf(Collections.max(list1)));
            list1.remove(Collections.max(list1));
        }

        for (int i = 0; i < 4; i++) {
            minList.add(Long.valueOf(Collections.min(list2)));
            list2.remove(Collections.min(list2));
        }

        for (int i = 0; i < maxList.size(); i++) {
            maxVal += maxList.get(i);
        }

        for (int i = 0; i < minList.size(); i++) {
            minVal += minList.get(i);
        }

        System.out.println(minVal + " " + maxVal);
    }
}
