package leetcode;

import java.util.LinkedList;
import java.util.List;

public class FlipGame {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> res = new LinkedList<>();
        if (s.length() < 2) {
            return res;
        }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '+' && s.charAt(i - 1) == '+') {
                res.add(s.substring(0, i - 1) + "--" + s.substring(i + 1, s.length()));
            }
        }

        return res;
    }
}
