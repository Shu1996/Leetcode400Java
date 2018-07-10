package leetcode;

public class ReverseWordsinaString {
    public String reverseWords1(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split("\\s+"); // "\\s" meands 回车空格换行 "+" means多个
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i] + " ");
        }
        return sb.toString().trim();
    }


}
