package main.java.com.codewars.fifth;

public class TicTacToeChecker {
    public static int isSolved(int[][] board) {
        return getResult(board);
    }

    public static int getResult(int[][] board){
        int horizResult = checkHorizontal(board);
        if(horizResult > 0){
            return horizResult;
        }
        int vertResult = checkVertical(board);
        if(vertResult>0){
            return vertResult;
        }
        int diagResult = checkDiagonal(board);
        if(diagResult>0){
            return diagResult;
        }
        if(horizResult+vertResult==-2){
            return -1;
        }
        return 0;
    }
    public static int checkHorizontal(int[][] board){

        int x = 0, y=0, digit;
        boolean unfinished=false;
        while(x<=2){
            if(board[x][y]==0||board[x][y+1]==0 || board[x][y+2]==0){
                unfinished=true;
            }
            else if(board[x][y] == 1 || board[x][y]==2){
                digit = board[x][y];
                if(board[x][y+1]==digit && board[x][y+2]==digit){
                    return digit;
                }
            }
            x++;
        }
        if(unfinished){
            return -1;
        }
        return 0;
    }

    public static int checkVertical(int[][] board){
                    int x = 0, y=0, digit;
                    boolean unfinished=false;
    while(y<=2){
        if(board[x][y]==0||board[x+1][y]==0 || board[x+2][y]==0){
            unfinished=true;
        }
        else if(board[x][y] == 1 || board[x][y]==2){
            digit = board[x][y];
            if(board[x+1][y]==digit && board[x+2][y]==digit){
                return digit;
            }
        }
        y++;
    }
    if(unfinished){
        return -1;
    }
    return 0;
    }

    public static int checkDiagonal(int[][]board){
        int x=0, y=0, digit=0;
        if(board[1][1] == 1 || board[1][1] == 2){
            digit = board[1][1];
            if(board[0][0]==digit && board[2][2] == digit){
                return digit;
            }
            if(board[0][2] == digit && board[2][0] == digit){
                return digit;
            }
        }
        return 0;
    }

}
