public interface MatrixInterface {
    void toPrint();

    int getRows();

    int getColumns();
    int toFindEl(int rowIndex, int colIndex);

    int[] toFindRow(int rowIndex);

    int[] toFindColumn(int columnIndex);

    MatrixInterface transpose();

}
