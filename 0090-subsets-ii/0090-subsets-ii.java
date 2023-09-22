class Solution {
    public void travel(int[] nums,int index,ArrayList<Integer> temp,List<List<Integer>> ans)
    {
        if(index>=nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        temp.add(nums[index]);
        travel(nums,index+1,temp,ans);
        temp.remove(temp.size()-1);
        travel(nums,index+1,temp,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        ArrayList<Integer> temp = new ArrayList();
        travel(nums,0,temp,ans);
        for(List<Integer> x:ans)
        {
            set.add(x);
        }
        ans.clear();
        for(List<Integer> x:set)
        {
            ans.add(x);
        }
        return ans;
    }
}