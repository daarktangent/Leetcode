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
class Pair
{
    TreeNode node;
    int val;
    Pair(TreeNode node,int val)
    {
        this.node = node;
        this.val=val;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        int ans=0;
        while(!q.isEmpty())
        {
            int min=-1;
            int max = -1;
            int size=q.size();
            while(size>0)
            {
                Pair temp = q.poll();
                if(min==-1)
                {
                    min = temp.val;
                }
                max=Math.max(max,temp.val);
                if(temp.node.left!=null)
                {
                    q.offer(new Pair(temp.node.left,2*(temp.val-min)+1));
                }
                if(temp.node.right!=null)
                {
                     q.offer(new Pair(temp.node.right,2*(temp.val-min)+2));
                }
                size--;
                
            }
            ans = Math.max(ans,max-min+1);
            
        }
        return ans;
    }
}