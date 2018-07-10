package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountofSmallerNumbersAfterSelf {
    public static List<Integer> countSmaller(int[] nums) {
        Integer[] res = new Integer[nums.length];
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int index = findIndex(list, nums[i]);
            res[i] = index;
            list.add(index, nums[i]);
        }
        return Arrays.asList(res);
    }

    private static int findIndex(List<Integer> list, int target) { // 关注 0 5 2 6 6时的边界条件！！
        if (list.size() == 0) {
            return 0;
        }
        int start = 0;
        int end = list.size() - 1;
        if (target < list.get(start)) {
            return start;
        }
        if (target > list.get(end)) {
            return end + 1;
        }
        while (start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if (list.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        if (list.get(start) >= target) {
            return start;
        } else if (list.get(end) < target) {
            return end + 1;
        } else {
            return end;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{26,78,27,100,33,67,90,23,66,5,38,7,35,23,52,22,83,51,98,69,81,32,78,28,94,13,2,97,3,76,99,51,9,21,84,66,65,36,100,41};
        int[] ans = new int[]{10,27,10,35,12,22,28,8,19,2,12,2,9,6,12,5,17,9,19,12,14,6,12,5,12,3,0,10,0,7,8,4,0,0,4,3,2,0,1,0};
        System.out.println(countSmaller(array));
//        System.out.println(Arrays.asList(ans));
    }
}
