package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[] [] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        this(null);
    }

    public String[] getRow(Integer value) {

        return this.board[value];
    }

    public String[] getColumn(Integer value) {
        String[] col = {board[0][value], board[1][value], board[2][value]};
        return col;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        return checkIfHomogenous(row);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] col = getColumn(columnIndex);
        return checkIfHomogenous(col);
    }

    public Boolean isDiagonalHomogeneous(Integer diagonalIndex) {
        String[] diagonal = getDiagonal(diagonalIndex);
        return checkIfHomogenous(diagonal);
    }

    private String[] getDiagonal(Integer diagonalIndex) {
        String[] diagonal;
        if(diagonalIndex == 0) {
            diagonal = new String[]{getColumn(0)[0],
                    getColumn(1)[1],
                    getColumn(2)[2]};
        }
        else{
            diagonal = new String[]{getColumn(2)[0],
                    getColumn(1)[1],
                    getColumn(0)[2]};
        }
        return diagonal;
    }

    private Boolean checkIfHomogenous(String[] array) {
        String value = array[0];
        for (int i = 1; i < array.length; i++) {
            if(!array[i].equals(value)){
                return false;
            }
        }
        return true;
    }

    public String getWinner() {
        for (int i = 0; i < 2; i++) {
            if(isRowHomogenous(i)){
                return getRow(i)[0];
            }else if(isColumnHomogeneous(i)){
                return getColumn(i)[0];
            } else if(isDiagonalHomogeneous(i)){
                return getDiagonal(i)[0];
            }
        }
        return null;
    }

    public String[][] getBoard() {
        return this.board;
    }
}
