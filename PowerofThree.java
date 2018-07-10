package leetcode;

public class PowerofThree {
    public static boolean isPowerofThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }

    public static boolean isPowerofThree2(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
