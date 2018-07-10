package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new LinkedList<>();
        }

        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] count = new int[26];
            for (char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }
            String s = "";
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    s += String.valueOf(count[i]) + String.valueOf(i + 'a');
                }
            }
            if (map.containsKey(s)) {
                List<String> list = map.get(s);
                list.add(str);
            } else {
                List<String> list = new LinkedList<>();
                list.add(str);
                map.put(s, list);
            }
        }

        return new LinkedList<>(map.values());
    }
}
