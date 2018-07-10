package leetcode;

public class Sqrt {
    public static int mySqrt(int x) {
        if (x == 0)
            return 0;

        int low = 1;
        int high = x;
        while (low <= high) {
            long mid = (high - low) / 2 + low;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }

        if (high * high < x) {
            return high;
        } else {
            return low;
        }
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }
}
