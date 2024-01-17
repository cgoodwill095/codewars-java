package main.java.com.codewars.sixth;

import java.util.ArrayList;
import java.util.List;

/**
 * @author goodw
 */
public class SillyAddition {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        SillyAddition sa = new SillyAddition();
    }

    public static int add(int num1, int num2) {
        SillyAddition sa = new SillyAddition();
        return (sa.addNum(num1, num2));
    }

    public int addNum(int num1, int num2) {
        if (num1 > 0 && num2 > 0) {
            List<Integer> num1Digits = digits(num1);
            List<Integer> num2Digits = digits(num2);

            List<Integer> sumNums = new ArrayList<>();

            if (num1Digits.size() < num2Digits.size()) {
                for (int i = 0; num1Digits.size() < num2Digits.size(); i++) {
                    num1Digits.add(0);
                }
            } else if (num2Digits.size() < num1Digits.size()) {
                for (int i = 0; num1Digits.size() > num2Digits.size(); i++) {
                    num2Digits.add(0);
                }
            }
            for (int x = 0; x < num1Digits.size(); x++) {
                sumNums.add(num1Digits.get(x) + num2Digits.get(x));
            }
            String sumString = "";
            for (int i = sumNums.size() - 1; i >= 0; i--) {
                sumString = sumString + sumNums.get(i).toString();

            }
            int sum = Integer.parseInt(sumString);

            return sum;
        } else {
            return num1 + num2;
        }

    }

    public List<Integer> digits(int i) {
        List<Integer> digits = new ArrayList<>();
        while (i > 0) {
            digits.add(i % 10);
            i /= 10;
        }
        return digits;
    }
}

