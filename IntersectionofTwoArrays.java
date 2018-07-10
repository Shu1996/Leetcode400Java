package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[]{};
        }
        Arrays.sort(nums2);
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            if (binarySearch(nums2, num)) {
                set.add(num);
            }
        }
        int[] res = new int[set.size()];
        int k = 0;
        for (Integer num : set) {
            res[k++] = num;
        }
        return res;
    }

    private boolean binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int mid = (end - start) / 2 + start;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
