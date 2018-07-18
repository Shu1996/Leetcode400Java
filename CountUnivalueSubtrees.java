package leetcode;

public class CountUnivalueSubtrees {
    int res;

    public int countUnivalSubtrees(TreeNode root) {
        res = 0;
        if (root == null) {
            return res;
        }
        helper(root);
        return res;
    }

    private boolean helper(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = helper(root.left);
        boolean right = helper(root.right);
        if (left && right) {
            if (root.left != null && root.left.val != root.val) {
                return false;
            }
            if (root.right != null && root.right.val != root.val) {
                return false;
            }
            res++;
            return true;
        }
        return false;
    }
}
