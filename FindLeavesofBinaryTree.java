package leetcode;

import java.util.LinkedList;
import java.util.List;

public class FindLeavesofBinaryTree {
    // 每次删的是每条树枝的最远点
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        helper(res, root);
        return res;
    }

    public int helper(List<List<Integer>> res, TreeNode root) {
        if (root == null) {
            return -1;
        }
        int left = helper(res, root.left);
        int right = helper(res, root.right);
        int level = Math.max(left, right) + 1;
        if (res.size() == level) {
            res.add(new LinkedList<>());
        }
        res.get(level).add(root.val);
        root.left = null;
        root.right = null;
        return level;
    }
}
