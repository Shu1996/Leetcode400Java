package leetcode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePath {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        helper(res, root, "");
        return res;
    }

    private void helper(List<String> res, TreeNode root, String path) {
        if (root.right == null && root.left == null) {
            res.add(path + root.val);
            return;
        }
        if (root.left != null) {
            helper(res, root.left, path + root.val + "->");
        }
        if (root.right != null) {
            helper(res, root.right, path + root.val + "->");
        }
    }
}
