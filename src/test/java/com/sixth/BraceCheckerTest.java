package test.java.com.sixth;

import main.java.com.sixth.BraceChecker;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BraceCheckerTest {

    private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("()"));
    }

    @Test
    public void testValid2() {
        assertEquals(true, checker.isValid("()[]{}"));
    }


    @Test
    public void testValid3() {
        assertEquals(true, checker.isValid("([]{}())"));
    }

    @Test
    public void testValid4() {
        assertEquals(true, checker.isValid("(){}[({})]"));
    }


    @Test
    public void testInvalid() {
        assertEquals(false, checker.isValid("[(])"));
    }
    @Test
    public void testInvalid2() {
        assertEquals(false, checker.isValid("("));
    }
    @Test
    public void testInvalid3() {
        assertEquals(false, checker.isValid("[]{}({)}"));
    }
    @Test
    public void testInvalid4() {
        assertEquals(false, checker.isValid("[](])"));
    }

}
