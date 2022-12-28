import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Matrix matrix2 = new Matrix(4, 1, new int[]{1, 2, 3, 4});
        //matrix2.toPrint();

        MatrixInterface matrixInterface = new Matrix(2, 3);
        MatrixInterface matrixInterface1 = new ImmutableMatrix(matrixInterface);

        matrixInterface.toPrint();
        System.out.println();
        matrixInterface1.toPrint();

        System.out.println();
        System.out.println(matrixInterface.equals(matrixInterface1));
        System.out.println();

        System.out.println();
        System.out.println(matrixInterface.toFindEl(0, 1));
        System.out.println();

        System.out.println();
        System.out.println((Arrays.toString(matrixInterface.toFindColumn(0))));
        System.out.println();

        System.out.println();
        System.out.println(Arrays.toString(matrixInterface.toFindRow(1)));
        System.out.println();

        System.out.println();
        MatrixInterface matrixInterface2 = matrixInterface1.transpose();
        matrixInterface2.toPrint();
        System.out.println();

        System.out.println();
        Matrix columnMatrix = Matrix.randomColumnMatrix(3);
        columnMatrix.toPrint();
        System.out.println();

        Matrix matrix1 = new Matrix(2, 3);
        ImmutableMatrix matrix2 = new ImmutableMatrix(matrix1);

        matrix1.toPrint();
        System.out.println();
        matrix2.toPrint();
        System.out.println();
        System.out.println(matrix1.equals(matrix2));
    }
}
