package leetcode;

public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = row * col;

        while (start < end) {
            int mid = (end - start) / 2 + start;
            int value = matrix[mid / col][mid % col];
            if (value == target) {
                return true;
            } else if (value > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
