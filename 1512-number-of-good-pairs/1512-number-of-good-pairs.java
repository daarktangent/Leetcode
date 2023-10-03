class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> set = new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(set.containsKey(nums[i]))
            {
                ans+=set.get(nums[i]);
                set.put(nums[i],set.get(nums[i])+1);
            }
            else{
                set.put(nums[i],1);
            }
        }
        return ans;
        
    }
}