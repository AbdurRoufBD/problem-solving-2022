package leetcode.queue_stack.binary_tree_inorder_traversal;

public class Runner {
    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);

        node3.left = node4;
        node1.left = node2;
        node1.right = node3;

        new Solution().inorderTraversal(node1);
    }
}

//         1
//       /   \
//      2     3
//           /
//          4
