package leetcode;

public class ReverseVowelsofaString {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        String vowel = "aeiouAEIOU";
        int start = 0;
        int end = s.length() - 1;
        char[] arr = s.toCharArray();
        while (start < end) {
            while (start < end && vowel.indexOf(arr[start]) == -1) {
                start++;
            }
            while (end > start && vowel.indexOf(arr[end]) == -1) {
                end--;
            }
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }

        return String.valueOf(arr);
    }
}
