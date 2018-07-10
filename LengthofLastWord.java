package leetcode;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(s.indexOf(" "));
        String s2 = "a.b c";
        String[] s3 = s2.split("\\ ");
        String[] s4 = s2.split("\\.");
        for (String sss : s3) {
            System.out.println(sss);
        }
        for (String sss : s4) {
            System.out.println(sss);
        }
    }
}
