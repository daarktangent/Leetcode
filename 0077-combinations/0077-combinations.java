class Solution {
    public void travel(int n,int k, List<List<Integer>> ans,List<Integer> temp,int curr,Set<List<Integer>> map )
    {
        
        if(temp.size()==k)
        {
            List<Integer> combination = new ArrayList<>(temp);
            map.add(combination);
            return;
        }
        for(int i=curr;i<=n;i++)
        {
            temp.add(i);
            travel(n,k,ans,temp,i+1,map);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Set<List<Integer>> map = new HashSet<>();
        for(int i=1;i<=n;i++)
        {
            travel(n,k,ans,temp,i,map);
        }
        ans.addAll(map);
        return ans;
    }
}