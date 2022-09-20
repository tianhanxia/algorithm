package binaryTreeAndBinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversalOfBinaryTreeRecursive {
    public List<Integer> inOrder(TreeNode root) {
        // Write your solution here
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    private void helper(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        helper(root.left, res);
        res.add(root.key);
        helper(root.right, res);
    }
}
