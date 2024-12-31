package test.java.com.codewars.fifth;

import main.java.com.codewars.fifth.TicTacToeChecker;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeCheckerTests {

    @Test
    void notFinished() {
        assertEquals(-1, TicTacToeChecker.isSolved(new int[][] {
                {0, 0, 1},
                {0, 1, 2},
                {2, 1, 0}
        }));
    }
    @Test
    void winnerX() {
        assertEquals(1, TicTacToeChecker.isSolved(new int[][] {
                {1, 1, 1},
                {0, 2, 2},
                {0, 0, 0}
        }));
    }
    @Test
    void winnerO() {
        assertEquals(2, TicTacToeChecker.isSolved(new int[][] {
                {1, 1, 2},
                {0, 2, 0},
                {2, 1, 1}
        }));
    }
    @Test
    void draw() {
        assertEquals(0, TicTacToeChecker.isSolved(new int[][] {
                {1, 2, 1},
                {1, 1, 2},
                {2, 1, 2}
        }));
    }

}
