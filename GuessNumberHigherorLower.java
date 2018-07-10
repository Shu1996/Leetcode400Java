package leetcode;

public class GuessNumberHigherorLower {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == 1) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (guess(start) == 0) {
            return start;
        } else {
            return end;
        }
    }

    private int guess(int n) {
        return 1;
    }
}
