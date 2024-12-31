package test.java.com.codewars.sixth;

import main.java.com.codewars.sixth.ExpandedFormNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ExpandedFormNumbersTest {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", ExpandedFormNumbers.expandedForm(12));
        assertEquals("40 + 2", ExpandedFormNumbers.expandedForm(42));
        assertEquals("70000 + 300 + 4", ExpandedFormNumbers.expandedForm(70304));
    }
}
