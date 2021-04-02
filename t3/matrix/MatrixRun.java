package oop.tasks.t3.matrix;

public class MatrixRun {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        Matrix matrix3 = new Matrix(matrix1.getMatrix());

        Matrix matrixT1 = new Matrix(1, 2, 3, 4);
        Matrix matrixT2 = new Matrix(9, 8, 7, 6);

        System.out.println("matrixT1");
        System.out.println(matrixT1);
        System.out.println("matrixT2");
        System.out.println(matrixT2);
        System.out.println();

        System.out.println("matrix1");
        System.out.println(matrix1.toString());
        System.out.println("matrix2");
        System.out.println(matrix2.toString());
        System.out.println("matrix3 - clone matrix1");
        System.out.println(matrix3.toString());

        Matrix resultSummary = new Matrix(matrix1.matrixSummary(matrix2.getMatrix()));
        System.out.println("matrix1 + matrix2");
        System.out.println(resultSummary.toString());
        System.out.println();

        Matrix resultSummary2 = new Matrix(matrixT1.matrixSummary(matrixT2.getMatrix()));
        System.out.println("matrixT1 + matrixT2");
        System.out.println(resultSummary2.toString());
        System.out.println();

        Matrix resultMatrixMultiplicationByNumber = new Matrix(matrix1.matrixMultiplicationByNumber(2));
        System.out.println("matrix1 * number");
        System.out.println(resultMatrixMultiplicationByNumber.toString());
        System.out.println();

        Matrix resultMatrixMultiplicationByNumber2 = new Matrix(matrixT1.matrixMultiplicationByNumber(2));
        System.out.println("matrixT1 * number");
        System.out.println(resultMatrixMultiplicationByNumber2.toString());
        System.out.println();

        Matrix resultMatricesMultiplication = new Matrix(matrix1.matricesMultiplication(matrix2.getMatrix()));
        System.out.println("matrix1 * matrix2");
        System.out.println(resultMatricesMultiplication.toString());
        System.out.println();

        Matrix resultMatricesMultiplication2 = new Matrix(matrixT1.matricesMultiplication(matrixT2.getMatrix()));
        System.out.println("matrixT1 * matrixT2");
        System.out.println(resultMatricesMultiplication2.toString());
        System.out.println();
    }
}
