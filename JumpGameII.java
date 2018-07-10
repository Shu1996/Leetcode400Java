package leetcode;

public class JumpGameII {
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = 0;
        int curMax = 0;
        int realMax = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            realMax = Math.max(realMax, i + nums[i]);
            if (i == curMax) {
                res++;
                curMax = realMax;
            }
        }

        return res;
    }
}
