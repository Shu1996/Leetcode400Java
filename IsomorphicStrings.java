package leetcode;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) {
            return true;
        }
        int[] sChar = new int[256];
        int[] tChar = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (sChar[s.charAt(i)] != tChar[t.charAt(i)]) {
                return false;
            } else {
                sChar[s.charAt(i)] = t.charAt(i);
                tChar[t.charAt(i)] = t.charAt(i);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "ab";
        String t = "aa";
        isIsomorphic(s, t);
        int i = s.charAt(0);
//        char c = s.charAt(10);
        System.out.println(i);
    }
}
