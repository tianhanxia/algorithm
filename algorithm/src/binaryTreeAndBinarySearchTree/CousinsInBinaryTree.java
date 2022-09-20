package binaryTreeAndBinarySearchTree;

public class CousinsInBinaryTree {
    public boolean isCousin(TreeNode root, TreeNode a, TreeNode b) {
        if (root == null) {
            return false;
        }
        boolean[] result = new boolean[1];
        helper(root, a, b, result, 0);
        return result[0];
    }

    private int helper(TreeNode root, TreeNode a, TreeNode b, boolean[] result, int level) {
        if (root == null) {
            return -1;
        }
        if (root == a || root == b) {
            return level;
        }
        int left = helper(root.left, a, b, result, level + 1);
        int right = helper(root.right, a, b, result, level + 1);
        if (left == right && left - level > 1) {
            result[0] = true;
        }
        return Math.max(left, right);
    }
}
