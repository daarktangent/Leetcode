class Solution {
public:
   // int travel(int index,vector<int> &cost,vector<int> &dp)
   // {
   //     if(index>=dp.size()-2)
   //     {
   //         return cost[index];
   //     }
   //     if(dp[index]!=-1)
   //     {
   //         return dp[index];
   //     }
   //     int a=travel(index+1,cost,dp);
   //     int b=travel(index+2,cost,dp);
   //     return dp[index]=cost[index]+min(a,b);
   // }
    int minCostClimbingStairs(vector<int>& cost) {
        int n=cost.size();
        vector<int> dp(n,-1);
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<dp.size();i++)
        {
            int a=dp[i-1]+cost[i];
            int b=dp[i-2]+cost[i];
            dp[i]=min(a,b);
        }
        return min(dp[n-1],dp[n-2]);
    }
};