package leetcode;

import java.util.HashMap;

public class FlipGameII {
    public static boolean canWin(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }
        HashMap<String, Boolean> map = new HashMap<>();
        return helper(s, map);
    }

    public static boolean helper(String s, HashMap<String, Boolean> map) {
        if (map.containsKey(s)) {
            return map.get(s);
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '+' && s.charAt(i + 1) == '+') {
                String opponent = s.substring(0, i) + "--" + s.substring(i + 2);
                if (!helper(opponent, map)) {
                    map.put(s, true);
                    return true;
                }
            }
        }
        map.put(s, false);
        return false;

    }

    public static void main(String[] args) {
        String s = "++++";
        canWin(s);
    }
}
