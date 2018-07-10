package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StrobogrammaticNumberII {
    public List<String> findStrobogrammatic(int n) {
        return helper(n, n);
    }

    private List<String> helper(int n, int m) {
        List<String> res = new LinkedList<>();
        if (n == 0) {
            return new LinkedList<>(Arrays.asList(""));
        }
        if (n == 1) {
            return new LinkedList<>(Arrays.asList("0", "1", "8"));
        }
        List<String> list = helper(n - 2, m);

        for (int i = 0; i < list.size(); i++) {
            if (n != m) {
                res.add("0" + list.get(i) + "0");
            }
            res.add("1" + list.get(i) + "1");
            res.add("6" + list.get(i) + "9");
            res.add("8" + list.get(i) + "8");
            res.add("9" + list.get(i) + "6");
        }

        return res;
    }
}
