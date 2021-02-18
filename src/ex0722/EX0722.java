package ex0722;

/**
 * (Game: Eight Queens)
 * The classic Eight Queens puzzle is to place eight queens on a chessboard 
 * such that no two queens can attack each other (i.e., no two queens are on the same row
 * same column, or same diagonal). There are many possible solutions. 
 * Write  a  program  that  displays  one  such  solution. 
 * A  sample  output  is  shown below
 * 
 * |Q| | | | | | | |
 * | | | | |Q| | | |
 * | | | | | | | |Q|
 * | | | | | |Q| | |
 * | | |Q| | | | | |
 * | | | | | | |Q| |
 * | |Q| | | | | | |
 * | | | |Q| | | | |
 */

/**
 *
 * @author kristiyan
 */
public class EX0722 {    
    /** Main method. */
    public static void main(String[] args) {
        char[] board = printBoard();
        getBoard(board);
    }
    
    public static int placeQueen() {
        return (int)(Math.random() * 64);
    }
    
    public static char[] printBoard() {
        char[] board = new char[64];
        for (int i = 0; i < board.length; i++) {
            board[i] = ' ';  
        }
        return board;
    }
    
    public static void getBoard(char[] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print(
                    "|" + ((getRow(i + 1) == 0) ? board[i] + "|\n" : board[i]));
        }
    }
    
    public static int getRow(int row) {
        return row % 8;
    }
    
    public static int getColumn(int column) {
        return column / 8;
    }
}