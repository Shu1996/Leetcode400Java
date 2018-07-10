package leetcode;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder("");
        }
        for (int i = 0; i < s.length(); i++) {
            int index = i % (2 * numRows - 2); // one cycle is 2n-2, index is the index in the circle
            index = index < numRows ? index : (2 * numRows - 2 - index); // index is the rowPlace of the char
            sb[index].append(s.charAt(i));
        }
        for (int i = 1; i < numRows; i++) {
            sb[0].append(sb[i]);
        }

        return sb[0].toString();
    }
}
