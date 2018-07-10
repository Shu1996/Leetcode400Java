package leetcode;

public class ReverseString {
    public String reverseString(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        int start = 0;
        int end = s.length() - 1;
        char[] word = s.toCharArray();
        while (start < end) {
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            start++;
            end--;
        }

        return new String(word);
    }
}
