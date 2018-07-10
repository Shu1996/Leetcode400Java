package leetcode;

public class ReverseInteger {
    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        reverse(-32);
    }
}
