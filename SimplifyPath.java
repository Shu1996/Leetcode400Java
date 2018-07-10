package leetcode;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        if (path == null || path.length() == 0) {
            return "";
        }
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/+");
        for (String s : paths) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!s.equals(".") && !s.equals("")) {
                stack.push(s);
            }
        }

        String res = "";
        if (stack.isEmpty()) {
            return "/";
        }
        while (!stack.isEmpty()) {
            res = "/" + stack.pop() + res;
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "/c/b/a/";
        String[] ss = s.split("/+");
        for (String sss : ss) {
            System.out.println(sss + "1");
        }
    }
}
