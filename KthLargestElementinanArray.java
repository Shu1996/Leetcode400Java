package leetcode;

import java.util.Random;

public class KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return findKth(nums, 0, nums.length - 1, nums.length - k);
    }

    private int findKth(int[] nums, int start, int end, int k) {
        int index = partition(nums, start, end);
        while (index != k) {
            if (index < k) {
                start = index + 1;
                index = partition(nums, start, end);
            } else {
                end = index - 1;
                index = partition(nums, start, end);
            }
        }

        return nums[index];
    }

    private int partition(int[] nums, int start, int end) {
        int index = randomInRange(start, end);
        swap(nums, index, end);

        int small = start - 1; // small is P1
        for (index = start; index < end; index++) { // index is P2
            if (nums[index] < nums[end]) {
                swap(nums, ++small, index);
            }
        }

        swap(nums, ++small, end);
        return small;
    }

    private int randomInRange(int start, int end) {
        Random random = new Random();
        return random.nextInt(end - start + 1) + start;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
