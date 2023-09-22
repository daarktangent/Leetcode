class Solution {
    public void swap(int[] nums,int index1,int index2)
    {
        int temp = nums[index2];
        nums[index2]=nums[index1];
        nums[index1] = temp;
    }
    public void travel(int [] nums,List<List<Integer>> ans,int n) 
    {
        if(n==nums.length)
        {
            List<Integer> combination = new ArrayList<>();
            for(int x:nums)
            {
                combination.add(x);
            }
            ans.add(combination);
            return ;
        }
        for(int i=n;i<nums.length;i++)
        {
            swap(nums,i,n);
            travel(nums,ans,n+1);
            swap(nums,i,n);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer> > ans = new ArrayList<>();
        System.out.println(Arrays.toString(nums));
        travel(nums,ans,0);
        return ans;
    }
}