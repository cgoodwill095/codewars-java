package main.java.com.codewars.sixth;

public class BitCounting {

    public static int countBits(int n){
        String toBinary = Integer.toBinaryString(n);
        int oneCount = 0;
        if(n>0){
            for(int i = 0; i<toBinary.length();i++){
                if(toBinary.charAt(i) == '1'){
                    oneCount++;
                }
            }
        }
        return oneCount;
    }

}
