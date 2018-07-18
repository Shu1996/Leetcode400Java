package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();
        for (int i = 0; i < s.length() - 9; i++) {
            String temp = s.substring(i, i + 10);
            if (!seen.add(temp)) {
                repeated.add(temp);
            }
        }
        return new ArrayList<>(repeated);
    }

    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
//        findRepeatedDnaSequences(s);
        HashSet<Integer> set = new HashSet<>();
        System.out.println(set.add(1));
        System.out.println(set.add(1));
    }
}
