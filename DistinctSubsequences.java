package leetcode;

public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i < 1 + s.length(); i++) { // 注意考虑"" s t各加一行
            dp[i][0] = 1;
        }
        for (int i = 1; i < 1 + s.length(); i++) {
            for (int j = 1; j <= i && j <= t.length(); j++) { // j > i则s短于t 不能形成subsequence
                if (s.charAt(i - 1) != t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j];
                }
                if (s.charAt(i - 1) == t.charAt(j - 1)) { // 等于i. 使用了最新的字母: s t都不用最新的字母 ii. 没使用最新的字母: s不用最新字母
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }
        return dp[s.length()][t.length()];
    }
}
