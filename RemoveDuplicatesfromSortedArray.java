package leetcode;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[res] = nums[i];
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
