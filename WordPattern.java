package leetcode;

import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char a = pattern.charAt(i);
            String b = words[i];
            if (map.containsKey(a)) {
                if (map.get(a).equals(b)) {
                    return false;
                } else {
                    continue;
                }
            } else {
                if (map.containsValue(b)) {
                    return false;
                } else {
                    map.put(a, b);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String a = "abba";
        String b = "dog cat cat dog";
        wordPattern(a, b);
    }
}
