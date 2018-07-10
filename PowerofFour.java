package leetcode;

public class PowerofFour {
    public static boolean isPowerofFour(int num) {
        return (Math.log10(num) / Math.log10(4)) % 1 == 0;
    }
}
