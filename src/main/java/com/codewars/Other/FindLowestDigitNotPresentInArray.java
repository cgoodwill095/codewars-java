package main.java.com.codewars.Other;

import java.util.Arrays;

public class FindLowestDigitNotPresentInArray {
    public int solution(int[] A) {
        boolean isPresent = true;
        Arrays.parallelSort(A);
        int i = 1;
        int x = 0;
        while (isPresent && x<A.length) {
            if (A[x] < i) {
                x++;
            } else if (A[x] == i) {
                i++;
                x++;
            } else if (i < A[x]) {
                isPresent = false;
            }
        }
        return i;
    }
    }

