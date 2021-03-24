package oop.tasks.t3.matrix;

class Matrix {
    int[][] matrix = new int[2][2];

        protected Matrix() {
        for (int i = 0; i < 2; i++) {
            for (int m = 0; m < 2; m++) {
                this.matrix[i][m] = (int) (Math.random() * 10);
            }
        }
    }

    /*
    protected Matrix() {
        for (int i = 0; i < 2; i++) {
            for (int m = 0; m < 2; m++) {
                int k = (int) (Math.random() * 10);
                if (k == 0) {
                    k = (int) ((Math.random() * 10) + 1);
                }
                this.matrix[i][m] = k ;
            }
        }
     */

    public String toString() {
        return "Matrix " + "\n" +
                "{" + this.matrix[0][0] + "\t" + this.matrix[0][1] + "}" + "\n" +
                "{" + this.matrix[1][0] + "\t" + this.matrix[1][1] + "}" + "\n";
    }
/*
    Matrix matrixSummary(Matrix matrix1) {
        return new Matrix(
                this.matrix[0][0] + matrix1[0][0], this.matrix[0][1] + matrix1[0][1],
                this.matrix[1][0] + matrix1[1][0], this.matrix[1][1] + matrix1[1][1]);
    }

    Matrix(Matrix matrix) {
        for (int i = 0; i < 2; i++) {
            for (int m = 0; m < 2; m++) {
                this.matrix[i][m] = matrix[i][m];
            }
        }
    }
    */

}
