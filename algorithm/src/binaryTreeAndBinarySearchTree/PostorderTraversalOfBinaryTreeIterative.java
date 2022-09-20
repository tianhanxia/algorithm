package binaryTreeAndBinarySearchTree;



import java.util.*;

public class PostorderTraversalOfBinaryTreeIterative {
    public List<Integer> postOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> preOrder = new LinkedList<>();
        preOrder.offerFirst(root);
        while (!preOrder.isEmpty()) {
            TreeNode current = preOrder.pollFirst();
            result.add(current.key);
            if (current.left != null) {
                preOrder.offerFirst(current.left);
            }
            if (current.right != null) {
                preOrder.offerFirst(current.right);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
