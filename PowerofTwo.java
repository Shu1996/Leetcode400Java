package leetcode;

public class PowerofTwo {
    /**
     *
     * 231. Power of Two
     * Given an integer, write a function to determine if it is a power of two.
     *
     * Example 1:
     *
     * Input: 1
     * Output: true
     * Explanation: 2^0 = 1
     *
     * time: O(1)
     * space: O(1)
     *
     */

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n&(n-1)) == 0;
    }

    public static void main(String[] args){
        System.out.println(isPowerOfTwo(1));
    }
}
