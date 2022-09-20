package binaryTreeAndBinarySearchTree;

public class SymmeiricBinaryTree {
    public boolean isSymmetric(TreeNode root) {
        // Write your solution here
        if (root == null) {
            return true;
        }
        return isSymmtric(root.left, root.right);
    }

    private boolean isSymmtric(TreeNode one, TreeNode two) {
        if (one == null && two == null) {
            return true;
        } else if (one == null || two == null) {
            return false;
        } else if (one.key != two.key) {
            return false;
        }
        return isSymmtric(one.left, two.right) && isSymmtric(one.right, two.left);
    }
}
