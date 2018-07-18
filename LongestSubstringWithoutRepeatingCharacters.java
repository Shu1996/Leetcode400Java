package leetcode;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int[] count = new int[256];
        int res = 1;
        for (int i = 0, j = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
            while (greaterThanOne(count)) {
                count[s.charAt(j++)]--;
            }
            res = Math.max(res, i - j + 1);
        }

        return res;
    }

    private boolean greaterThanOne(int[] nums) {
        for (int num : nums) {
            if (num > 1) {
                return true;
            }
        }
        return false;
    }
}
