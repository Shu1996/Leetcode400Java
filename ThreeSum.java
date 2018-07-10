package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {              // not using nums[i] == nums[i + 1] because [-1, -1, 2]
                continue;
            }
            int start = i + 1;
            int end = nums.length - 1;
            int sum = 0 - nums[i];

            while (start < end) {
                if (nums[start] + nums[end] == sum) {
                    res.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while (start < end && nums[start] == nums[start + 1]) {     // there are start < end because while changes the start value and start < end is the basis of deleting duplicated number
                        start++;
                    }
                    while (start < end && nums[end] == nums[end - 1]) {
                        end--;
                    }
                    start++;
                    end--;
                } else if (nums[start] + nums[end] < sum) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return res;
    }
}
