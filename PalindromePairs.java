package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PalindromePairs {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        if (words == null || words.length == 0) {
            return res;
        }
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j <= words[i].length(); j++) {
                String str1 = words[i].substring(0, j);
                String str2 = words[i].substring(j);
                if (isPalin(str1)) {
                    String str2rev = new StringBuilder(str2).reverse().toString();
                    if (map.containsKey(str2rev) && map.get(str2rev) != i) {
                        res.add(Arrays.asList(map.get(str2rev), i));
                    }
                }
                if (str2.length() != 0 && isPalin(str2)) {
                    String str1rev = new StringBuilder(str1).reverse().toString();
                    if (map.containsKey(str1rev) && map.get(str1rev) != i) {
                        res.add(Arrays.asList(i, map.get(str1rev)));
                    }
                }
            }
        }

        return res;
    }

    private boolean isPalin(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }

        return true;
    }
}
