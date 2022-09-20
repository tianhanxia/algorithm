package binaryTreeAndBinarySearchTree;


public class SearchInBST {
    public TreeNode search(TreeNode root, int key) {
        if (root == null || root.key == key) {
            return root;
        }
        return search(key < root.key ? root.left : root.right, key);
    }
}
