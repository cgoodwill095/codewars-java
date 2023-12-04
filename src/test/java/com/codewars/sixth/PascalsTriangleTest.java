package test.java.com.codewars.sixth;

import main.java.com.codewars.sixth.PascalsTriangle;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

    public class PascalsTriangleTest {
        @Test
        public void testOneLevelTriangle() {
            final long[] terms = { 1L };
            assertThat(PascalsTriangle.generate(1), is(terms));
        }

        @Test
        public void testTwoLevelsTriangle() {
            final long[] terms = { 1L, 1L, 1L };
            assertThat(PascalsTriangle.generate(2), is(terms));
        }

        @Test
        public void testThreeLevelsTriangle() {
            final long[] terms = { 1L, 1L, 1L, 1L, 2L, 1L};
            assertThat(PascalsTriangle.generate(3), is(terms));
        }

        @Test
        public void testFourLevelsTriangle() {
            final long[] terms = { 1L, 1L, 1L, 1L, 2L, 1L, 1L, 3L, 3L, 1L };
            assertThat(PascalsTriangle.generate(4), is(terms));
        }
    }