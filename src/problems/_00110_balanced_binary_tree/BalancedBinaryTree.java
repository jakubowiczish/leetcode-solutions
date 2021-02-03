package _00110_balanced_binary_tree;

public class BalancedBinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */

    private boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        getHeightOfGivenNodeAndCheckIfItsBalanced(root);
        return isBalanced;
    }

    private int getHeightOfGivenNodeAndCheckIfItsBalanced(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = getHeightOfGivenNodeAndCheckIfItsBalanced(node.left);
        int rightHeight = getHeightOfGivenNodeAndCheckIfItsBalanced(node.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            isBalanced = false;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
