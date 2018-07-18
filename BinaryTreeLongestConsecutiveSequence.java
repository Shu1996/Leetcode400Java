package leetcode;

public class BinaryTreeLongestConsecutiveSequence {
    private int res = 0;

    public int longestConsecutive(TreeNode root) {
        if (root == null) {
            return res;
        }
        helper(root, res, root.val);
        return res;
    }

    private void helper(TreeNode root, int max, int target) {
        if (root == null) {
            return;
        }
        if (root.val == target) {
            max++;
        } else {
            max = 1;
        }
        res = Math.max(res, max);
        helper(root.left, max, root.val + 1);
        helper(root.right, max, root.val + 1);
    }
}
