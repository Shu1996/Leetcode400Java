package leetcode;

public class ShortestPalindrome {
    public String shortestPalindrome(String s) {
        // 找到从头开始的最长子回文 反转其后半部分加到s之前
        if (s == null || s.length() < 2) {
            return s;
        }
        int i = 0; // i and j checks the whole substr's palindrome property
        int j = s.length() - 1;
        int end = s.length() - 1; // end records the longest palin from start
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                i = 0;
                end--;
                j = end;
            }
        }
        return new StringBuilder(s.substring(end + 1)).reverse().toString() + s;
    }
}
