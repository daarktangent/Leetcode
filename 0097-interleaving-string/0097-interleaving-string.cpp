class Solution {
public:
    bool travel(int i,int j,string s1,string s2,string s3,vector<vector<int>> &dp)
    {
        if(i+j==s3.size())
        {
            return true;
        }
        if(s3[i+j]!=s1[i]&&s3[i+j]!=s2[j])
        {
            return false;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        bool first=false;
        bool second=false;
        if(s1[i]==s3[i+j])
        {
            first=travel(i+1,j,s1,s2,s3,dp);
        }
        if(s2[j]==s3[i+j])
        {
            second=travel(i,j+1,s1,s2,s3,dp);
        }
        return dp[i][j]=first|second;
        
    }
    bool isInterleave(string s1, string s2, string s3) {
        if(s1.size()+s2.size()!=s3.size())
        {
            return false;
        }
        if(s3.size()==0)
        {
            return true;
        }
        vector<vector<int>> dp(s1.size()+1,vector<int>(s2.size()+1,-1));
        return travel(0,0,s1,s2,s3,dp);
    }
};