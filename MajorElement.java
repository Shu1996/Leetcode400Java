package leetcode;

public class MajorElement {
    // Moore Voting Algorithm
    public int majorityElement(int[] nums) {
        int res = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                res = num;
            }
            if (num != res) {
                count--;
            } else {
                count++;
            }
        }

        return res;
    }
}
