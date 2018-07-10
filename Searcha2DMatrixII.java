package leetcode;

public class Searcha2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length - 1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {
            int value = matrix[row][col];
            if (value == target) {
                return true;
            } else if (value > target) {
                row--;
            } else {
                col++;
            }
        }

        return false;
    }
}
