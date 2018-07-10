package leetcode;

public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        // 4 situations: (1)+ -; (2)overflow; (3)0 3/5; (4)normal

        int sign = 1;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            sign = -1;
        }
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);

        // Situation (3)
        if (ldividend == 0 || ldividend < ldivisor) {
            return 0;
        }

        // situation (1) (2) (4)
        long lres = divide(ldividend, ldivisor);
        int res = 0;
        if (lres > Integer.MAX_VALUE) {
            res = sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            res = (int)(sign*lres);
        }

        return res;
    }

    public static long divide(long ldividend, long ldivisor) {
        if (ldividend < ldivisor) {
            return 0;
        }
        long sum = ldivisor;
        long multiple = 1;

        while ((sum + sum) < ldividend) {
            sum += sum;
            multiple += multiple;
        }

        return multiple + divide(ldividend-sum, ldivisor);
    }

    public static void main(String[] args) {
        divide(-2147483648, -1);
        System.out.println(Math.abs(-2147483648));
    }
}
