class Solution {
public:
    int travel(vector<int>& nums, int target,int index,vector<vector<int>> &dp)
    {
        if(target==0)
        {
            return 1;
        }
        if(index>=nums.size()||target<0)
        {
            return 0;
        }
        if(dp[index][target]!=-1)
        {
            return dp[index][target];
        }
        int pick=travel(nums,target-nums[index],0,dp);
        int notpick=travel(nums,target,index+1,dp);
        return dp[index][target]=pick+notpick;
        
        
    }
    int combinationSum4(vector<int>& nums, int target) 
    {
        vector<vector<int>> dp(nums.size(),vector<int>(target+1,-1));
        return travel(nums,target,0,dp);
    }
};