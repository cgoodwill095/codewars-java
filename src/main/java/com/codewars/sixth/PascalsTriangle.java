package main.java.com.codewars.sixth;

public class PascalsTriangle {
    public static long[] generate(int level) {

        int  columnPointer=0, rowPointer = 1, arraySize = ((level*(level+1))/2);
        long[] pascalsTriangle = new long[arraySize];

        for(int i = 0; i<arraySize; i++){
            if(columnPointer == 0 || columnPointer == rowPointer-1){
                pascalsTriangle[i] = 1;
            }
            else{
                pascalsTriangle[i] = pascalsTriangle[i-rowPointer+1]+pascalsTriangle[i-rowPointer];
            }
            columnPointer++;
            if(columnPointer>=rowPointer){
                rowPointer++;
                columnPointer=0;
            }
        }



        return pascalsTriangle;
    }
}