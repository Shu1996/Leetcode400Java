package leetcode;

public class SortColors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int left = 0; // 'left' marks the first '1' from the start of the array right now
        int right = nums.length - 1; // 'right' marks the last '1' from the end of the array right now
        int index = 0;

        while (index <= right) {
            if (nums[index] == 0) {
                swap(nums, index++, left++);
            } else if (nums[index] == 1) {
                index++;
            } else {
                swap(nums, index, right--); // index doesn't ++ because you don't know whether the changed number is 0 or 1, but when when nums[index] = 0, you could be sure the nums throught are 0 or 1.
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
