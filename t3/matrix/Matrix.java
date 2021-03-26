package oop.tasks.t3.matrix;

class Matrix {
    private int[][] matrix = new int[2][2];

    public Matrix() {
        for (int i = 0; i < 2; i++) {
            for (int m = 0; m < 2; m++) {
                this.matrix[i][m] = (int) (Math.random() * 10);
            }
        }
    }

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(int a, int b, int c, int d) {
        matrix[0][0] = a;
        matrix[0][1] = b;
        matrix[1][0] = c;
        matrix[1][1] = d;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public String toString() {
        return "Matrix " + "\n" +
                "{" + this.matrix[0][0] + "\t" + this.matrix[0][1] + "}" + "\n" +
                "{" + this.matrix[1][0] + "\t" + this.matrix[1][1] + "}" + "\n";
    }

    public int[][] matrixSummary(int[][] matrix1) {
        int [][] matrix2 = new int[2][2];
        matrix2[0][0] = this.matrix[0][0] + matrix1[0][0];
        matrix2[0][1] = this.matrix[0][1] + matrix1[0][1];
        matrix2[1][0] = this.matrix[1][0] + matrix1[1][0];
        matrix2[1][1] = this.matrix[1][1] + matrix1[1][1];
        return matrix2;
    }

    public int[][] matrixMultiplicationByNumber (int number) {
        int [][] matrix2 = new int[2][2];
        matrix2[0][0] = this.matrix[0][0] * number;
        matrix2[0][1] = this.matrix[0][1] * number;
        matrix2[1][0] = this.matrix[1][0] * number;
        matrix2[1][1] = this.matrix[1][1] * number;
        return matrix2;
    }

    public int[][] matricesMultiplication (int[][] matrix1) {
        int [][] matrix2 = new int[2][2];
        matrix2[0][0] = (this.matrix[0][0] * matrix1[0][0]) + (this.matrix[0][1] * matrix1[1][0]);
        matrix2[0][1] = (this.matrix[0][0] * matrix1[0][1]) + (this.matrix[0][1] * matrix1[1][1]);
        matrix2[1][0] = (this.matrix[1][0] * matrix1[0][0]) + (this.matrix[1][1] * matrix1[1][0]);
        matrix2[1][1] = (this.matrix[1][0] * matrix1[0][1]) + (this.matrix[1][1] * matrix1[1][1]);
        return matrix2;
    }
}
