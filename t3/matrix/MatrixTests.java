package oop.tasks.t3.matrix;

public class MatrixTests {
    public static void main(String[] args) {
        testMatrixSummary();
        testMatrixMultiplicationByNumber();
        testMatricesMultiplication();
    }
    public static void testMatrixSummary() {
        Matrix matrixT1 = new Matrix(1, 2, 3, 4);
        Matrix matrixT2 = new Matrix(9, 8, 7, 6);

        int[][] resultSummary2 = matrixT1.matrixSummary(matrixT2.getMatrix());
        assert resultSummary2[0][0] == 10;
        assert resultSummary2[0][1] == 10;
        assert resultSummary2[1][0] == 10;
        assert resultSummary2[1][1] == 10;
    }

    public static void testMatrixMultiplicationByNumber() {
        Matrix matrixT1 = new Matrix(1, 2, 3, 4);

        int[][] resultSummary2 = matrixT1.matrixMultiplicationByNumber(2);
        assert resultSummary2[0][0] == 2;
        assert resultSummary2[0][1] == 4;
        assert resultSummary2[1][0] == 6;
        assert resultSummary2[1][1] == 8;
    }

    public static void testMatricesMultiplication() {
        Matrix matrixT1 = new Matrix(1, 2, 3, 4);
        Matrix matrixT2 = new Matrix(9, 8, 7, 6);

        int[][] resultSummary2 = matrixT1.matricesMultiplication(matrixT2.getMatrix());
        assert resultSummary2[0][0] == 23;
        assert resultSummary2[0][1] == 20;
        assert resultSummary2[1][0] == 55;
        assert resultSummary2[1][1] == 48;
    }
}
