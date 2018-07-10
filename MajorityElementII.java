package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        int number1 = 0;
        int number2 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == number1) {
                count1++;
            } else if (nums[i] == number2) {
                count2++;
            } else if (count1 == 0) {
                count1++;
                number1 = nums[i];
            } else if (count2 == 0) {
                count2++;
                number2 = nums[i];
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == number1) {
                count1++;
            } else if (num == number2) {
                count2++;
            }
        }
        if (count1 > nums.length / 3) {
            res.add(number1);
        }
        if (count2 > nums.length / 3) {
            res.add(number2);
        }

        return res;
    }
}
