package leetcode;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        boolean row = false;
        boolean col = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                    if (i == 0) {           // reserve the status of the first row till finished
                        row = true;
                    }
                    if (j == 0) {           // reserve the status of the first col till finished
                        col = true;
                    }
                }
            }
        }

        for (int i = 1; i < m; i++) {       // don't change the status of the first col
            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (row == true) {                  // do changes to the first row
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (col == true) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
