package leetcode;

public class ReadNCharactersGivenRead4II_Callmultipletimes {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */

    private int count = 0;
    private int pointer = 0;
    private char[] temp = new char[4];

    public int read(char[] buf, int n) {
        int index = 0;
        while (index < n) {
            if (pointer == 0) {
                count = read4(temp);
            }
            if (count == 0) {
                break;
            }
            while (pointer < count && index < n) {
                buf[index++] = temp[pointer++];
            }
            if (pointer == count) {
                pointer = 0;
            }
        }
        return index;
    }

    //辅助函数，正常不是这么写
    private static int read4(char[] temp) {
        char[] res = new char[10];
        char[] ret = new char[4];
        int index = 0;
        for (int i = 0; i < res.length; i++) {
            if (index < 4){
                ret[index++] = temp[i];
            }
        }
        return index;
    }
}
