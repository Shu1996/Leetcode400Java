package leetcode;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int max = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    max = Math.max(max, dp[j] + 1);
                }
            }
            dp[i] = max;
        }

        int res = 0;
        for (int num : dp) {
            res = Math.max(res, num);
        }

        return res;
    }

    public static int lengthOfLIS2(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;                        // len is the index of next num in the final sequence
        for (int num : nums) {              // the num might not be in the right sequence of arrival, like [0 4 12 2]: [0 4 12] to [0 2 12], but you could ignore the 2nd subs's 12
            int index = 0;
            int end = len;
            while (index < end) {
                int mid = (end - index) / 2 + index;
                if (dp[mid] < num) {
                    index = mid + 1;
                } else {
                    end = mid;
                }
            }
            dp[index] = num;
            if (index == len) {
                len++;
            }
        }

        return len;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLIS2(new int[]{4,10,4,3,8,9}));
    }
}
