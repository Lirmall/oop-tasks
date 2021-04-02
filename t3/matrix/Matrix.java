package oop.tasks.t3.matrix;

class Matrix {
    final int HEIGHT = 2;
    private int[][] matrix = new int[HEIGHT][HEIGHT];

    public Matrix() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                this.matrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(int a11, int a12, int a21, int a22) {
        matrix[0][0] = a11;
        matrix[0][1] = a12;
        matrix[1][0] = a21;
        matrix[1][1] = a22;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public String toString() {
        return "Matrix " + "\n" +
                "(" + this.matrix[0][0] + "\t" + this.matrix[0][1] + ")" + "\n" +
                "(" + this.matrix[1][0] + "\t" + this.matrix[1][1] + ")" + "\n";
    }

    public int[][] matrixSummary(int[][] matrix1) {
        int [][] matrix2 = new int[HEIGHT][HEIGHT];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                matrix2[i][j] = this.matrix[i][j] + matrix1[i][j];
            }
        }
        return matrix2;
    }

    public int[][] matrixMultiplicationByNumber(int number) {
        int [][] matrix2 = new int[HEIGHT][HEIGHT];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                matrix2[i][j] = this.matrix[i][j] * number;
            }
        }
        return matrix2;
    }

    public int[][] matricesMultiplication (int[][] matrix1) {
        int [][] matrix2 = new int[HEIGHT][HEIGHT];
        matrix2[0][0] = (this.matrix[0][0] * matrix1[0][0]) + (this.matrix[0][1] * matrix1[1][0]);
        matrix2[0][1] = (this.matrix[0][0] * matrix1[0][1]) + (this.matrix[0][1] * matrix1[1][1]);
        matrix2[1][0] = (this.matrix[1][0] * matrix1[0][0]) + (this.matrix[1][1] * matrix1[1][0]);
        matrix2[1][1] = (this.matrix[1][0] * matrix1[0][1]) + (this.matrix[1][1] * matrix1[1][1]);
        return matrix2;
    }
}
