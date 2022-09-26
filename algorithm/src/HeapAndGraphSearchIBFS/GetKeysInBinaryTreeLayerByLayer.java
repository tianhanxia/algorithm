package HeapAndGraphSearchIBFS;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GetKeysInBinaryTreeLayerByLayer {
    public List<List<Integer>> layerByLayer(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root ==null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            // the list storing all the nodes on the current level
            List<Integer> curLayer = new ArrayList<>();
            // the seize of current level
            int size = queue.size();
            // traverse all the nodes on current level and prepare for
            // next level
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                curLayer.add(cur.key);
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            list.add(curLayer);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4);

        root.left = n1;
        //root.right = n2;
        n1.left = n2;
        n1.right = n3;

        GetKeysInBinaryTreeLayerByLayer test = new GetKeysInBinaryTreeLayerByLayer();
        List<List<Integer>> result= test.layerByLayer(root);
        System.out.println(result);
    }
}
