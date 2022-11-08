class Solution {
public:
    vector<vector<int>> generate(int n) {
        vector<vector<int>> ans;
        ans.push_back({1});
        
        for(int i=1;i<n;i++)
        {
            vector<int> temp;
            temp.resize(i+1);
            temp[0]=temp[i]=1;
            //cout<<temp[0]<<" "<<temp[1]<<"------------"<<endl;
            for(int j=1;j<i;j++)
            {
                // cout<<i<<" "<<j<<endl;
                // cout<<ans[i-1][j-1]<<" "<<ans[i-1][j]<<endl;
                temp[j]=ans[i-1][j-1]+ans[i-1][j];
                
            }
            ans.push_back(temp);
        }
        return ans;
    }
};