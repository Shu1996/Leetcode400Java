package leetcode;

public class MissingNumber {

    public static int missingNumber(int[] nums){
        int n = nums.length;

        for (int i = 0; i < nums.length; i++)
        {
            n ^= i^nums[i];
        }

        return n;
    }

    public static void main(String[] args){
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
