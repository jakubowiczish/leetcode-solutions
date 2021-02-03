package _00230_kth_smallest_element_in_a_bst;

import java.util.ArrayDeque;
import java.util.Deque;

public class KthSmallestElementInABst {

    public int kthSmallest(TreeNode root, int k) {
        final Deque<TreeNode> stack = new ArrayDeque<>();

        while (root != null) {
            stack.push(root);
            root = root.left;
        }

        while (k != 0) {
            TreeNode top = stack.pop();
            --k;
            if (k == 0) return top.val;

            TreeNode right = top.right;
            while (right != null) {
                stack.push(right);
                right = right.left;
            }
        }

        return -1;
    }
}
