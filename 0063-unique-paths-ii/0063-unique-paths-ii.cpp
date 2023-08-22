class Solution {
public:

    int uniquePathsWithObstacles(vector<vector<int>>& o) {
        if(o[0][0]==1)
        {
            return 0;
        }
        int m =o.size();
        int n=o[0].size();
        vector<vector<int>> dp(o.size(),vector<int>(o[0].size(),-1));
        dp[0][0]=1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(o[i][j]==1)
                {
                    dp[i][j]= 0;
                    continue;
                }
                if(i!=0||j!=0)
                {
                    int down=0;
                    int right=0;
                    if(i>0) down=dp[i-1][j];
                    if(j>0)right=dp[i][j-1];
                    dp[i][j]=down+right;
                }
            }
        }
        return dp[m-1][n-1];
    }
};