package _00111_minimum_depth_of_binary_tree;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {

    public int minDepthRecursive(TreeNode root) {
        if (root == null) return 0;

        int left = minDepthRecursive(root.left);
        int right = minDepthRecursive(root.right);

        if (left == 0 || right == 0)
            return Math.max(left, right) + 1;
        else
            return Math.min(left, right) + 1;
    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();

                if (current.left == null && current.right == null)
                    return depth;

                if (current.left != null)
                    queue.offer(current.left);

                if (current.right != null)
                    queue.offer(current.right);
            }

            ++depth;
        }

        return depth;
    }

}
