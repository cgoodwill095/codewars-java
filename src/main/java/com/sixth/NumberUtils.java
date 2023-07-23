package main.java.com.sixth;


public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        String numberString = String.valueOf(number);
        if(numberString.isEmpty()){
            return false;
        }
        char[] digitChars = numberString.toCharArray();
        int sum = 0;
        for(char digit : digitChars){
            int x = Integer.parseInt(String.valueOf(digit));
            Double pow = Math.pow(x, numberString.length());
            x = pow.intValue();
            sum += x;
        }
        if(sum == number){
            return true;
        }
        return false;
    }

}
