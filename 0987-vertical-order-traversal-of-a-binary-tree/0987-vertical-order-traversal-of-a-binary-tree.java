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
    public class pair
    {
        TreeNode node;
        int pos;
        pair(TreeNode node,int val)
        {
            this.node=node;
            this.pos=val;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<pair> q = new LinkedList<>();
       TreeMap<Integer, List<Integer>> m = new TreeMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        q.offer(new pair(root,0));
        while(!q.isEmpty())
        {
            int size = q.size();
            HashMap<Integer,List<Integer> > map= new HashMap<>();
            //System.out.println("in");
            while(size>0)
            {
                //System.out.println("out");
                
                pair temp = q.poll();
                if(!map.containsKey(temp.pos))
                {
                    map.put(temp.pos,new ArrayList<>());
                }
                if(temp.node.left!=null)
                {
                    q.offer(new pair(temp.node.left,temp.pos-1));
                }
                if(temp.node.right!=null)
                {
                    q.offer(new pair(temp.node.right,temp.pos+1));
                }
                map.get(temp.pos).add(temp.node.val);
                size--;
               // System.out.println(map+" "+"map");
            }
            map.forEach((key,value)->
                        {
                            if(!m.containsKey(key))
                            {
                                m.put(key,new ArrayList<>());
                            }
                            Collections.sort(value);
                            m.get(key).addAll(value);
                        });
        }
        m.forEach((key,value)->
                  {
                      ans.add(value);
                  });
        return ans;
    }
}