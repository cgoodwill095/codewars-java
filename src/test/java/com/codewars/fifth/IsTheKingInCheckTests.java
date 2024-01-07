package test.java.com.codewars.fifth;

import main.java.com.codewars.fifth.IsTheKingInCheck;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsTheKingInCheckTests {
    @Test
        void checkByPawn() {
            final char[][] test1 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', 'P', ' ', ' ', ' ', ' '},
                    {' ', ' ', 'K', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

            assertEquals(true, IsTheKingInCheck.isTheKinginCheck(test1));
        }

        @Test
        void checkByBishop() {
            final char[][] test2 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', 'B'},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {'K', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

            assertEquals(true, IsTheKingInCheck.isTheKinginCheck(test2));
        }

        @Test
        void checkByRook() {
            final char[][] test3 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', 'K', ' ', ' ', 'R', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

            assertEquals(true, IsTheKingInCheck.isTheKinginCheck(test3));
        }

        @Test
        void checkByKnight() {
            final char[][] test4 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', 'K', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {'N', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

            assertEquals(true, IsTheKingInCheck.isTheKinginCheck(test4));
        }

        @Test
        void checkByQueen() {
            final char[][] test5 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', 'K', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', 'Q', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

            assertEquals(true, IsTheKingInCheck.isTheKinginCheck(test5));
        }

        @Test
        void kingAlone() {
            final char[][] test6 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', 'K', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

            assertEquals(false, IsTheKingInCheck.isTheKinginCheck(test6));
        }

        @Test
        void kingWithPiecesNoCheck() {
            final char[][] test7 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {'Q', ' ', ' ', 'N', ' ', ' ', ' ', 'Q'},
                    {' ', ' ', ' ', 'K', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

            assertEquals(false, IsTheKingInCheck.isTheKinginCheck(test7));
        }

        @Test
        void noCheckBecauseBlockingPiece() {
            final char[][] test8 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {'R', ' ', 'B', 'K', ' ', ' ', ' ', ' '},
                    {' ', ' ', 'P', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

            assertEquals(false, IsTheKingInCheck.isTheKinginCheck(test8));
        }

        @Test
        void noCheckBecauseTwoBlockingPieces() {
            final char[][] test9 = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', 'B', ' ', ' '},
                    {' ', ' ', ' ', ' ', 'R', ' ', ' ', ' '},
                    {'R', ' ', 'P', 'K', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

            assertEquals(false, IsTheKingInCheck.isTheKinginCheck(test9));
        }

}
