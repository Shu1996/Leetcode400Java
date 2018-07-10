package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        // record every num's frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // put the nums in a list grouped by frequency
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int num : map.keySet()) {
            int freq = map.get(num);
            if (bucket[freq] == null) {
                bucket[freq] = new LinkedList<>();
            }
            bucket[freq].add(num);
        }

        // return k
        List<Integer> res = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && res.size() < k; i--) {
                res.addAll(bucket[i]);
        }

        return res;
    }
}
