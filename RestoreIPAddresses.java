package leetcode;

import java.util.LinkedList;
import java.util.List;

public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new LinkedList<>();
        if (s == null || s.length() == 0) {
            return res;
        }
        helper(res, s, "", 0, 0);
        return res;
    }

    private void helper(List<String> res, String s, String addr, int index, int count) {
        if (count > 4) {
            return;
        }
        if (count == 4 && index == s.length()) {
            res.add(addr);
            return;
        }
        for (int i = 1; i < 4; i++) {
            if (index + i > s.length()) {
                return;
            }
            String temp = s.substring(index, index + i);
            if ((temp.startsWith("0") && temp.length() > 1) || (i == 3 && Integer.parseInt(temp) >= 256)) {
                return;
            }
            helper(res, s, addr + temp + (count == 3 ? "" : "."), index + i, count + 1);
        }
    }
}
