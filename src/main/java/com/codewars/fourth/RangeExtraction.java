package main.java.com.codewars.fourth;

public class RangeExtraction {

    /*
        A format for expressing an ordered list of integers is to use a comma separated
        list of either

        - individual integers
        - or a range of integers denoted by the starting integer separated
          from the end integer in the range by a dash, '-'.
          The range includes all integers in the interval including both
          endpoints. It is not considered a range unless it spans at least 3 numbers.
          For example "12,13,15-17"

        Complete the solution so that it takes a list of integers in increasing order
        and returns a correctly formatted string in the range format.






     */

    public String rangeExtraction(int[] range){
        if(range.length==0){
            return "";
        }
        else if(range.length==1){
            return String.valueOf(range[0]);
        }


        String rangeString = "";
        Boolean inRange = false;
        for(int i = 0; i<range.length; i++){
            if(!inRange){
                if(range.length-1>=i+2){
                    if (range[i + 1] == range[i] + 1 && range[i + 2] == range[i] + 2) {
                        rangeString = rangeString.concat(range[i]+"-");
                        inRange=true;
                    }
                    else{
                        rangeString = rangeString.concat(range[i]+",");
                    }
                }
                else{
                    if(i == range.length-1){
                        rangeString = rangeString.concat(String.valueOf(range[i]));
                    } else{
                        rangeString = rangeString.concat(range[i]+",");
                    }
                }
            }
            else{
                if(range.length-1>=i+1) {
                    if (range[i + 1] != range[i] + 1) {
                        rangeString = rangeString.concat(String.valueOf(range[i]) + ",");
                        inRange=false;
                    }
                }
                else{
                    rangeString = rangeString.concat(String.valueOf(range[i]) );
                }
            }
        }
        return rangeString;
    }
}
