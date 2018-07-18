package leetcode;

public class SumofTwoIntegers {
    public int getSum(int a, int b) {
        // 对于二进制数的而言，对应位相加（无进位）就可以使用异或（xor）操作，计算进位就可以使用与（and）操作
        if (b == 0) {
            return a;
        }
        int sum = 0;
        while (b != 0) {
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }

        return a;
    }
}
