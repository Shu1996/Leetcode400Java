package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GroupShiftedStrings {
    public List<List<String>> groupStrings(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new LinkedList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strings) {
            int offset = str.charAt(0) - 'a';
            String key = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = (char)(str.charAt(i) - offset);
                if (ch < 'a') {
                    ch += 26;
                }
                key += ch;
            }
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> list = new LinkedList<>();
                list.add(str);
                map.put(key, list);
            }
        }

        return new LinkedList<>(map.values());
    }
}
