package leetcode;

public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;

        while (low <= high) {
            long mid = (high - low) / 2 + low;
            if (mid*mid == num)
                return true;
            if (mid*mid < num) {
                low = (int)mid + 1;
            } else {
                high = (int)mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(100));
    }
}
