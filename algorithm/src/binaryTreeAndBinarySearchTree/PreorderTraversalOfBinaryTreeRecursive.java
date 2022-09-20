package binaryTreeAndBinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversalOfBinaryTreeRecursive {
    public List<Integer> preOrder(TreeNode root) {
        // Write your solution here
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.key);
        helper(root.left, res);
        helper(root.right, res);
    }
}
