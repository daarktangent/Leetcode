class Solution {
    public int travel(int x,int y,int m,int n, int dp[][])
    {
        if(x>=m||y>=n)
        {
            return 0;
        }
        if(x==m-1&& y==n-1)
        {
            return 1;
        }
        if(dp[x][y]!=-1)
        {
            return dp[x][y];
        }
        int a= travel(x,y+1,m,n,dp);
        int b=travel(x+1,y,m,n,dp);
        dp[x][y]=a+b;
        return a+b ;
    }
    public int uniquePaths(int m, int n) {
         int dp[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++)
                dp[i][j] = -1;
        }
        
        return travel(0,0,m,n,dp);
        
    }
}