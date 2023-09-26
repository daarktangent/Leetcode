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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            System.out.println(q+"queue ");
            while(size>0)
            {
             TreeNode temp = q.poll();   
                size--;
                if(temp!=null)
                {
                    if(size==0)
                    {
                        ans.add(temp.val);
                    }
                    if(temp.left!=null)
                    {
                        q.offer(temp.left);
                    }
                    if(temp.right!=null)
                    {
                        q.offer(temp.right);
                    }
                }
                
            }
        }
        return ans;
    }
}