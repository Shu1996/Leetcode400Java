package leetcode;

import java.util.LinkedList;
import java.util.List;

public class GeneralizedAbbreviation {
    public List<String> generateAbbreviations(String word) {
        List<String> res = new LinkedList<>();
        helper(res, word, "", 0, 0);
        return res;
    }

    private void helper(List<String> res, String word, String s, int posi, int count) {
        if (posi == word.length()) {
            if (count > 0) {
                s += count;
            }
            res.add(s);
//            return;
        } else {
            helper(res, word, s, posi + 1, count + 1);
            helper(res, word, s + (count > 0 ? count : "") + word.charAt(posi), posi + 1, 0);
        }
    }

    public static void main(String[] args) {
        String s = "ab";
        s = s + 1;
        System.out.println(s + 1);
    }
}
