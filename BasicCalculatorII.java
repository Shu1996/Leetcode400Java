package leetcode;

import java.util.Stack;

public class BasicCalculatorII {
    public int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        char sign = '+';
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = s.charAt(i) - '0';
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    i++;
                    num = num * 10 + s.charAt(i) - '0';
                }
            }

            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == s.length() - 1) {
                if (sign == '+') {
                    stack.push(num);
                }
                if (sign == '-') {
                    stack.push(-num);
                }
                if (sign == '*') {
                    stack.push(stack.pop() * num);
                }
                if (sign == '/') {
                    stack.push(stack.pop() / num);
                }
                sign = s.charAt(i);
                num = 0;
            }
        }

        for (int n : stack) {
            res += n;
        }

        return res;
    }
}
