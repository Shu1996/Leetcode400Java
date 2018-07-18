package leetcode;

public class LongestSubstringwithAtMostTwoDistinctCharacters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int[] count = new int[256];
        int res = 0;
        int left = 0;
        int right = 0;
        int num = 0;
        while (right < s.length()) {
            if (count[s.charAt(right)]++ == 0) {
                num++;
            }
            if (num > 2) {
                while (--count[s.charAt(left++)] > 0);
                num--;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }

        return res;
    }
}
