package test.java.com.codewars.sixth;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import main.java.com.codewars.sixth.NumberUtils;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

    @Test
    void exampleTests() {

        assertTrue(NumberUtils.isNarcissistic(0), "0 is narcissistic");
        assertTrue(NumberUtils.isNarcissistic(1), "1 is  narcissistic");
        assertTrue(NumberUtils.isNarcissistic(2), "2 is  narcissistic");
        assertTrue(NumberUtils.isNarcissistic(153), "153 is narcissistic");
        assertTrue(NumberUtils.isNarcissistic(407), "407 is narcissistic");
        assertTrue(NumberUtils.isNarcissistic(1634), "1634 is narcissistic");
        assertFalse(NumberUtils.isNarcissistic(112), "112 is not narcissistic");
        assertFalse(NumberUtils.isNarcissistic(12), "12 is not narcissistic");
    }

}