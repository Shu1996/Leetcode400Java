package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class IntersectionofTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }
        for (int num : nums2) {
            if (map.containsKey(num)) {
                if (map.get(num) > 0) {
                    list.add(num);
                    map.put(num, map.get(num) - 1);
                }
            }
        }
        int[] res = new int[list.size()];
        int k = 0;
        for (int num : list) {
            res[k++] = num;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2};
        intersect(nums1, nums2);
    }
}
