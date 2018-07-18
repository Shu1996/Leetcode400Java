package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean x = true;
        while (!queue.isEmpty()) {
            int num = queue.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < num; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
                if (x) {
                    list.add(temp.val);
                } else {
                    list.add(0, temp.val);
                }
            }
            x = !x;
            res.add(list);
        }
        return res;
    }
}
