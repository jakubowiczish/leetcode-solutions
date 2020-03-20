package _00094_binary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

    public List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.add(current);
                current = current.left;
            }

            current = stack.pop();
            resultList.add(current.val);
            current = current.right;
        }

        return resultList;
    }


    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderRecursive(result, root);
        return result;
    }

    private void inorderRecursive(List<Integer> result, TreeNode node) {
        if (node == null) return;
        inorderRecursive(result, node.left);
        result.add(node.val);
        inorderRecursive(result, node.right);
    }
}
