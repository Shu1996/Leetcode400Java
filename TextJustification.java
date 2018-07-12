package leetcode;

import java.util.LinkedList;
import java.util.List;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new LinkedList<>();
        int index = 0;

        while (index < words.length) {
            // determine nums of words of every string
            int count = words[index].length();
            int last = index + 1;
            while (last < words.length) {
                if (words[last].length() + count + 1 > maxWidth) {
                    break;
                }
                count += words[last].length() + 1;
                last++;
            }
            // add spaces
            StringBuilder sb = new StringBuilder();
            sb.append(words[index]);
            int diff = last - 1 - index;
            // last row
            if (last == words.length || diff == 0) {
                for (int i = index + 1; i < last; i++) {
                    sb.append(" ");
                    sb.append(words[i]);
                }
                for (int i = sb.length(); i < maxWidth; i++) {
                    sb.append(" ");
                }
            } else { // common situations
                int spaces = (maxWidth - count) / diff;
                int r = (maxWidth - count) % diff;
                for (int i = index + 1; i < last; i++) {
                    for (int j = spaces; j > 0; j--) {
                        sb.append(" ");
                    }
                    if (r > 0) {
                        sb.append(" ");
                        r--;
                    }
                    sb.append(" ");
                    sb.append(words[i]);
                }
            }
            res.add(sb.toString());
            index = last;
        }

        return res;
    }
}
