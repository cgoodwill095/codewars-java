package test.java.com.codewars;

import main.java.com.codewars.fourth.RangeExtraction;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class RangeExtractionTests {

    RangeExtraction rangeExtraction = new RangeExtraction();
    @Test
    public void test_BasicTests() {
        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", rangeExtraction.rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));

        assertEquals("-3--1,2,10,15,16,18-20", rangeExtraction.rangeExtraction(new int[] {-3,-2,-1,2,10,15,16,18,19,20}));

        assertEquals("-17,-15,-14,-12,-10,-7,-5", rangeExtraction.rangeExtraction(new int[]{-17,-15,-14,-12,-10,-7,-5}));

    }

    @Test
    public void extendedTests(){
        assertEquals("-17,-15,-14,-12,-10,-7,-5", rangeExtraction.rangeExtraction(new int[]{-17,-15,-14,-12,-10,-7,-5}));
        assertEquals("-17,-15,-14,-12,-10,-7--5,-3", rangeExtraction.rangeExtraction(new int[]{-17,-15,-14,-12,-10,-7,-6,-5, -3}));

    }
}
