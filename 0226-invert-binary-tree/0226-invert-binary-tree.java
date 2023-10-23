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
    public void travel(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        travel(root.left);
        travel(root.right);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        {
            return root;
        }
        travel(root);
        return root;
        
    }
}