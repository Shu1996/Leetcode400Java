package leetcode;

public class Pow {
    public static double myPow(double x, int n) {
        if (n < 0) {
            return 1.0 / pow(x, n);
        } else {
            return pow(x,n);
        }
    }

    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double temp = pow(x, n/2);
        double res;
        if (n%2 == 0) {
            res = temp*temp;
        } else {
            res = x*temp*temp;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(3/2);
    }
}
