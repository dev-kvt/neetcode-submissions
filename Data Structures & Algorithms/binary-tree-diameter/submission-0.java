/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        int lHeight = maxH(root.left);
        int rHeight = maxH(root.right);
        int diameter = lHeight + rHeight;
        int sub = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));

        return Math.max(diameter, sub);
    }
    private int maxH(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxH(root.left), maxH(root.right)) + 1;
    }
}
