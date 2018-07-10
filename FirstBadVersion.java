package leetcode;

public class FirstBadVersion {
    private boolean isBadVersion(int n) {
        return true;
    }
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = (end - start) / 2 + start;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        if (isBadVersion(start)) {
            return start;
        } else {
            return end;
        }
    }
}
