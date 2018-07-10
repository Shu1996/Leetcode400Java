package leetcode;

import java.util.Stack;



/**
 dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext
 split\n: {dir, \tsubdir1, \tsubdir2, \t\tfile.ext}

 stack 0 4 13 21
 res 20
 level 3
 len 13
 dir: \t\tfile.ext:

 */
public class LongestAbsoluteFilePath {
    public static int lengthLongestPath(String input) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int res = 0;
        for (String s : input.split("\n")) {
            int level = s.lastIndexOf("\t") + 1; // +1是为了初始化 且"\t"算一个字符
            while (level + 1 < stack.size()) {
                stack.pop();
            }
            int len = stack.peek() + s.length() - level + 1; // +1是先把\dir的算上（都有\）
            stack.push(len); // \dir\sub\file 不是每次push的len都能减
            if (s.contains(".")) {
                res = Math.max(res, len - 1); // -1是把\dir的'\'去掉
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        System.out.println(lengthLongestPath(s));
        String ss = "\t\tsubdir1";
        System.out.println(ss.length());
        System.out.println(ss.charAt(2));
    }
}
