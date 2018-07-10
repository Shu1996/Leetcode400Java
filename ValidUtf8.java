package leetcode;

public class ValidUtf8 {
    public static boolean validUtf8(int[] data) {
        if (data == null || data.length == 0) return false;

        boolean isValid = true;


        for (int i = 0; i < data.length; i++) {
            if (data[i] > 247) return false; // 247(1111 0111)
            int numberofBytes = 0;
            if ((data[i] & 128) == 0) // 128(1000 0000)
                numberofBytes = 1;
            else if ((data[i] & 224) == 192)    // 224(1110 0000) 192(1100 0000)
                numberofBytes = 2;
            else if ((data[i] & 240) == 224)    // 240(1111 0000) 224(1110 0000)
                numberofBytes = 3;
            else if ((data[i] & 248) == 240)    // 248(1111 1000) 240(1111 0000)
                numberofBytes = 4;
            else return false;
            for (int j = 1; j < numberofBytes; j++) {
                if (i+j >= data.length) return false;
                if ((data[i+j] & 192) != 128)   // 192(1100 0000) 128(1000 0000)
                    return false;
            }
            i = i + numberofBytes - 1;
        }

        return isValid;
    }

    public static void main(String[] args) {
        int[] num = {237};
        validUtf8(num);
    }
}
