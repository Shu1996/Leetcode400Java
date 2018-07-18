package leetcode;

public class LongestSubstringwithAtMostKDistinctCharacters {
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int res = 0;
        int left = 0;
        int right = 0;
        int num = 0;
        while (right < s.length()) {
            if (count[s.charAt(right++)]++ == 0) {
                num++;
            }
            if (num > k) {
                while (--count[s.charAt(left++)] > 0);
                num--;
            }
            res = Math.max(res, right - left);
            // res不加1因为这个时候right是左边元素的下一个值
            // 或者在最开始不进行right++，最后再写right++
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "eceab";
        int k = 2;
        lengthOfLongestSubstringKDistinct(s, 2);
    }
}
