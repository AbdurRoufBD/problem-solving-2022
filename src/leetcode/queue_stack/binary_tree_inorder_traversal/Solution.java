package leetcode.queue_stack.binary_tree_inorder_traversal;

import java.util.*;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        Set<TreeNode> visited = new HashSet<>();
        List<Integer> inorder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if(node.left == null) {
                inorder.add(node.val);
            } else {
                if(node.right != null) {
                    stack.push(node.right);
                    visited.add(node.right);
                }
                stack.push(node);
                visited.add(node);
                stack.push(node.left);
                visited.add(node.left);
            }
        }
        return inorder;
    }
}
