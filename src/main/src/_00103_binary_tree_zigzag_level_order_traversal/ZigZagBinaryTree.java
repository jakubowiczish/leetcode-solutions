package _00103_binary_tree_zigzag_level_order_traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagBinaryTree {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();

        if (root == null) return resultList;

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);

        boolean isRightToLeft = false;

        while (!nodeQueue.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            int size = nodeQueue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = nodeQueue.poll();

                if (node == null) continue;
                if (isRightToLeft) levelList.add(0, node.val);
                else levelList.add(node.val);
                if (node.left != null) nodeQueue.add(node.left);
                if (node.right != null) nodeQueue.add(node.right);
            }

            resultList.add(levelList);
            isRightToLeft = !isRightToLeft;
        }

        return resultList;
    }
}
