package test.java.com.codewars.sixth;

import static junit.framework.TestCase.assertEquals;

import main.java.com.codewars.sixth.SillyAddition;
import org.junit.Test;

public class SillyAdditionTest {

    @Test
    public void TestAddition() {
        SillyAddition sa = new SillyAddition();
        assertEquals(3013, sa.addNum(105, 208));
        assertEquals(210, sa.addNum(15, 15));
        assertEquals(212, sa.addNum(16, 16));
    }

    @Test
    public void TestDifferentAmountOfDigitsLeft() {
        SillyAddition sa = new SillyAddition();
        assertEquals(13, sa.addNum(2, 11));

    }

    @Test
    public void TestDifferentAmountOfDigitsRight() {
        SillyAddition sa = new SillyAddition();
        assertEquals(13, sa.addNum(11, 2));

    }

    @Test
    public void TestAddZeroes() {
        SillyAddition sa = new SillyAddition();
        assertEquals(0, sa.addNum(0, 0));

    }

    @Test
    public void TestAddZero() {
        SillyAddition sa = new SillyAddition();
        assertEquals(1, sa.addNum(1, 0));

    }

    @Test
    public void SillyAdditon() {
        System.out.println("****** Silly addition******");
        assertEquals(214, SillyAddition.add(16, 18));
    }

    @Test
    public void SillyAdditon2() {
        System.out.println("****** Silly addition******");
        assertEquals(515, SillyAddition.add(26, 39));
    }

    @Test
    public void SillyAdditon3() {
        System.out.println("****** Silly addition******");
        assertEquals(1103, SillyAddition.add(122, 81));

    }
    @Test
    public void SillyAdditon4() {
        System.out.println("****** Silly addition******");
        assertEquals(663103, SillyAddition.add(15122, 51281));

    }

    @Test
    public void SillyAddition5(){
        System.out.println("****** Silly addition******");
        assertEquals(10101010, SillyAddition.add(10999, 111));

    }
}