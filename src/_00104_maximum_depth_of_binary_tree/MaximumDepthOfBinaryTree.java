package _00104_maximum_depth_of_binary_tree;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftMaxDepth = root.left == null ? 0 : maxDepth(root.left);
        int rightMaxDepth = root.right == null ? 0 : maxDepth(root.right);

        return 1 + Math.max(leftMaxDepth, rightMaxDepth);
    }
}

