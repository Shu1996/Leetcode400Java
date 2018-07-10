package leetcode;

public class HIndexII {
    public static int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) {
            return 0;
        }
        int start = 0;
        int end = citations.length;
        int length = citations.length;

        while (start < end) {
            int mid = (end - start) / 2 + start;
            if (citations[mid] == length - mid) { // mid(the number of papers less than h) = length - citations[mid]
                return citations[mid];
            } else if (citations[mid] > length - mid) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return length - start;                      // why (length - start)???
    }

    public static void main(String[] args) {
        int[] citations = new int[]{0,1,5,6,7};
        System.out.println(hIndex(citations));
    }
}
