package leetcode;

public class SparseMatrixMultiplication {
    public int[][] multiply(int[][] A, int[][] B) {
        int rowA = A.length;
        int colA = A[0].length;
        int colB = B[0].length;
        int[][] res = new int[rowA][colB];

        // C[i][j] is A[i][] * B[][j]
        for (int i = 0; i < rowA; i++) {                        // A's row
            for (int k = 0; k < colA; k++) {                    // A's ith row's every element
                if (A[i][k] != 0) {
                    for (int j = 0; j < colB; j++) {            // B's kth col's every element
                        if (B[k][j] != 0) {
                            res[i][j] += A[i][k] * B[k][j];
                        }
                    }
                }
            }
        }

        return res;
    }
}
