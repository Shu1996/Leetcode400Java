package leetcode;

public class SuperPow {
    public static int superPow(int a, int[] b) {
        return superPow(a, b, b.length, 1337);
    }

    private static int superPow(int base, int[] exponents, int length, int divisor) {
        if (length == 1) {
            return powMod(base, exponents[0], divisor);
        } else {
            return powMod(superPow(base, exponents, length - 1, divisor), 10, divisor) * powMod(base, exponents[length - 1], divisor) % divisor;
        }
    }

    private static int powMod(int base, int exponent, int divisor) {
        int pow = 1;
        base %= divisor;
        for (int i = 0; i < exponent; i++) {
            pow = base * pow % divisor;
        }
        return pow;
    }

    public static void main(String[] args) {
        int a = 5;
        int[] b = new int[] {
                1,0,2,4
        };
        System.out.println(superPow(a, b));
    }
}
