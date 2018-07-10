package leetcode;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String sub = haystack.substring(i, i + needle.length());            // substring(start, end): [start, end)
            if (sub.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String hack = "ab";
        String needle = "b";
        System.out.println(hack.substring(1,2));
    }
}
