package main.java.com.codewars.sixth;

public class ExpandedFormNumbers {

    public static String expandedForm(int num)
    {
        //get num length, get digit != 0, add 0s onto it based on length remaining.
        //for example "500505"
        // length == 6
        // work forwards
        // String 50000
        //+ --500
        //+ --5
        //your code here
        String sum = String.valueOf(num);
        String sumString = "";
        String zeroes = "";
        for (int i = sum.length()-1; i >=0 ; i--)
        {
            if(i==0){
                sumString = sumString.concat( zeroes + sum.charAt(i));

            }
            else if(sum.charAt(i)!='0'){
               sumString = sumString.concat( zeroes + sum.charAt(i) + " + ");
            }
            zeroes = zeroes.concat("0");
        }
        return new StringBuilder(sumString).reverse().toString();
    }


}
