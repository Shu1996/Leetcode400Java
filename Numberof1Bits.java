package leetcode;

public class Numberof1Bits {
    public static int hammingWeight(int n){
        int res = 0;

        while (n != 0)
        {
            n &= (n-1);
            res++;
        }

        return res;
    }

    public static void main(String[] args){
        System.out.println(hammingWeight(11));
    }
}
