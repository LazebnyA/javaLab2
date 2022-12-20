import java.util.Arrays;
import java.util.Random;

public class Matrix implements MatrixInterface{
    private int rows, columns; // n - number of rows, m - number of columns
    private int[][] matrixI; // instance field of matrix itself

    public Matrix(){
        matrixI = new int[][]{};
    }

    public Matrix(int n ,int m){
        rows = n;
        columns = m;
        matrixI = new int[n][m];
        toFill();
    }

    public Matrix(MatrixInterface matrix) {
        rows = matrix.getRows();
        columns = matrix.getColumns();

        matrixI = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixI[i][j] = matrix.toFindEl(i, j);
            }
        }
    }

    public Matrix(int n, int m, int[] matrixArray) {
        rows = n;
        columns = m;

        matrixI = new int[n][m];

        int counter = 0;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrixI[i][j] = matrixArray[counter];
                counter += 1;
            }
        }
    }

    public void toFill() {
        Random random = new Random();

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrixI[i][j] = random.nextInt(10);
            }
        }

    }

    public void toPrint() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrixI[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int toFindEl(int rowIndex, int colIndex) {
        return matrixI[rowIndex][colIndex];
    }

    public int[] toFindRow(int rowIndex) {
        int[] row = new int[rows];

        int rowElsCounter = 0;
        for (int i = 0; i < columns; i++) {
            row[rowElsCounter] = matrixI[rowIndex][i];
            rowElsCounter += 1;
            if (rowElsCounter == rows) {
                break;
            }
        }

        return row;

    }

    public int[] toFindColumn(int columnIndex) {
        int[] column = new int[columns];

        int colElsCounter = 0;
        for (int i = 0; i < rows; i++) {
            column[colElsCounter] = matrixI[i][columnIndex];
            colElsCounter += 1;
            if(colElsCounter == columns) {
                break;
            }
        }

        return column;
    }

    public int getRows() { return rows; }
    public int getColumns() { return columns; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix matrix = (Matrix) o;

        if (matrix.getRows() != rows || matrix.getColumns() != columns) { return false; }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix.toFindEl(i, j) != matrixI[i][j]) return false;
            }
        }

        return true;

    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(matrixI);
    }

    public static Matrix randomColumnMatrix(int n) {
        Matrix matrix = new Matrix(n, 1);

        matrix.toFill();

        return matrix;
    }


    public Matrix transpose() {
        Matrix matrix = new Matrix(columns, rows);

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix.matrixI[j][i] = matrixI[i][j];
            }
        }

        return matrix;
    }


}
