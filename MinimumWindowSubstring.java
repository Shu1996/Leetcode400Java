package leetcode;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int[] count = new int[256];
        for (char c : t.toCharArray()) {
            count[c]++;
        }
        int left = 0;
        int right = 0;
        int countToMatch = t.length();
        int head = 0;
        int minLen = Integer.MAX_VALUE;

        while (right < s.length()) {
            if (count[s.charAt(right++)]-- > 0) {
                countToMatch--;
            }
            while (countToMatch == 0) {
                if (right - left < minLen) { // update and record new minLen
                    head = left;
                    minLen = right - left;
                }
                if (count[s.charAt(left++)]++ == 0) { // only the chars in t will have such situation
                    countToMatch++;
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(head, head + minLen);
    }
}
