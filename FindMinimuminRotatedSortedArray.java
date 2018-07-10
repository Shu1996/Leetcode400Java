package leetcode;

public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if (nums[mid] > nums[end]) { // compare [mid] and [end] in case of none rotation
                start = mid;
            } else {
                end = mid;
            }
        }
        if (nums[start] > nums[end]) {
            return nums[end];
        } else {
            return nums[start];
        }
    }
}
