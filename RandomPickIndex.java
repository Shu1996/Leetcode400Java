package leetcode;

import java.util.Random;

public class RandomPickIndex {

    private int[] nums;
    private Random random;

    public RandomPickIndex(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    public int pick(int target) {
        int count = 0;
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                continue;
            }
            count++;
            int rmd = random.nextInt(count);
            if (rmd == 0) {
                res = i;
            }
        }

        return res;
    }
}
