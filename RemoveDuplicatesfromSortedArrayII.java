package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        int res = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[res - 2]) {
                nums[res] = nums[i];
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
}
