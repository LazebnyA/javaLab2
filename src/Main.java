public class Main {
    public static void main(String[] args) {
        //Matrix matrix2 = new Matrix(4, 1, new int[]{1, 2, 3, 4});
        //matrix2.toPrint();

        Matrix matrix1 = new Matrix(2, 3);
        ImmutableMatrix matrix2 = new ImmutableMatrix(matrix1);

        matrix1.toPrint();
        System.out.println();
        matrix2.toPrint();
        System.out.println();
        System.out.println(matrix1.equals(matrix2));
    }
}
