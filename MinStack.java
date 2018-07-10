package leetcode;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (!minStack.isEmpty()) {
            if (x <= minStack.peek()) { // it's x <= min instead of x < min because of pop operation
                minStack.push(x);
            }
        } else {
            minStack.push(x);
        }

        // stack.push(x);
        // if (!minStack.isEmpty()) {
        //     int min = minStack.peek();
        //     if (x <= min) {
        //         minStack.push(x);
        //     }
        // } else {
        //     minStack.push(x);
        // }
    }

    public void pop() {
        int x = stack.pop();
        if (!minStack.isEmpty()) {
            if (x == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

//public class MinStack2 {
//
//    private Stack<Integer> stack;
//    private int min;
//    /** initialize your data structure here. */
//    public MinStack() {
//        stack = new Stack<>();
//        min = Integer.MAX_VALUE;
//    }
//
//    public void push(int x) {
//        if (x <= min) {
//            stack.push(min);
//            min = x;
//        }
//        stack.push(x);
//    }
//
//    public void pop() {
//        if (stack.pop() == min) {
//            min = stack.pop();
//        }
//    }
//
//    public int top() {
//        return stack.peek();
//    }
//
//    public int getMin() {
//        return min;
//    }
//}
