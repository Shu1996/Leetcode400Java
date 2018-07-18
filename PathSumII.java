package leetcode;

import java.util.LinkedList;
import java.util.List;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        helper(res, new LinkedList<>(), root, sum);
        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> ret, TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        ret.add(root.val);
        if (root.left == null && root.right == null) {
            if (root.val == sum) {
                res.add(new LinkedList<>(ret));
            }
            ret.remove(ret.size() - 1);
            return;
        }
        helper(res, ret, root.left, sum - root.val);
        helper(res, ret, root.right, sum - root.val);
        ret.remove(ret.size() - 1);
    }
}
