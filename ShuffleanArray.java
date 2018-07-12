package leetcode;

import java.util.Random;

public class ShuffleanArray {

    private int[] nums;
    private Random random;

    public ShuffleanArray(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int[] clone = nums.clone();
        for (int i = 1; i < clone.length; i++) {
            int rmd = random.nextInt(i + 1);
            swap(clone, i, rmd);
        }
        return clone;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
//    public static void main(String[] args) {
//        int[] nums = new int[]{
//                1, 2, 3
//        };
//        int[] clone = nums.clone();
//        for (int num : clone) {
//            System.out.println(num);
//        }
//    }
}
