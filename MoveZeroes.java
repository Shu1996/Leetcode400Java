package leetcode;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int p1 = 0; // go through the array.
        int p2 = 0; // before p2, there are none zoroes.
        for (; p1 < nums.length; p1++) {
            if (nums[p1] != 0) {
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2++] = temp;
            }
        }
    }
}
