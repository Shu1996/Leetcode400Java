package leetcode;

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int[] res = new int[nums.length];
        res[0] = 1;
        int left = 1; // product what is left
        for (int i = 0; i < nums.length; i++) {
            res[i] = left; // not res[i] *= left because left is so
            left *= nums[i];
        }
        int right = 1; // product what is right
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= right; // it's res[i] *= right because it should product what's left
            right *= nums[i];
        }
        return res;
    }
}
