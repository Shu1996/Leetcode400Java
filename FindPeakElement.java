package leetcode;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        /*
        规律一：如果nums[i] > nums[i+1]，则在i之前一定存在峰值元素
        规律二：如果nums[i] < nums[i+1]，则在i+1之后一定存在峰值元素
        **/

        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        if (nums[start] > nums[end]) {
            return start;
        } else {
            return end;
        }
    }
}
