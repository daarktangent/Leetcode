class Solution {
    int num;
    public int travel(int n,int [] dp)
    {
        if(dp[n]!=0)
        {
            return dp[n];
        }
        int maxi=0;
        if(n==num)
        {
            maxi=0;
        }
        else
        {
            maxi=n;
        }
        for(int i=1;i<n;i++)
        {
            int val=travel(n-i,dp)*travel(i,dp);
            maxi=Math.max(maxi,val);
        }
        dp[n]=maxi;
        return maxi;
    }
    public int integerBreak(int n) {
        num=n;
        int [] dp = new int[60];
        return  travel(n,dp);
    }
}