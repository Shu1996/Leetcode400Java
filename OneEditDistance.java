package leetcode;

public class OneEditDistance {
    public static boolean isOneEditDistance(String s, String t) {
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (s.length() == t.length()) {
                    return s.substring(i + 1).equals(t.substring(i + 1));
                } else if (s.length() > t.length()) {
                    return s.substring(i + 1).equals(t.substring(i));
                } else {
                    return s.substring(i).equals(t.substring(i + 1));
                }
            }
        }
        return Math.abs(s.length() - t.length()) == 1;
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "b";
        isOneEditDistance(s, t);
        System.out.println(s.substring(s.length()));
    }
}
