package prog;

public class ChessBoard {

    public static void main(String[] args) {
        int size = 8;
        chessTable(size);
        System.out.println("---------------");
        char[][] chessBoard = createChessBoard(size);
        displayChessBoard(chessBoard);
    }

    private static void chessTable(int size) {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if ((row + column) % 2 == 0) {
                    System.out.print("W ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
    }

    private static char[][] createChessBoard(int size) {
        char[][] board = new char[size][size];
        for (int rowIndex = 0; rowIndex < size; rowIndex++) {
            for (int columnIndex = 0; columnIndex < size; columnIndex++) {
                board[rowIndex][columnIndex] = (rowIndex + columnIndex) % 2 == 0 ? 'W' : 'B';
            }
        }
        return board;
    }

    private static void displayChessBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
