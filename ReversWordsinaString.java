package leetcode;

public class ReversWordsinaString {
    public void reverseWords(char[] str) {
        reverse(str, 0, str.length - 1);
        int right = 0;
        while (right < str.length) {
            int left = right;
            while (right < str.length && str[right] != ' ') {
                // while (str[right] != ' ' && right < str.length) {        is wrong because of the sequence of logic statements
                right++;
            }
            reverse(str, left, right - 1);
            right++;
        }
    }

    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
