class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int buy = 0,sell = 0;
        int ans = 0;
        for(int i=1;i<prices.size();i++)
        {
            if(prices[i]<prices[buy])
            {
                buy =i;
                sell = i;
            }
            if(prices[i]>=prices[sell])
            {
                sell = i;
                ans = max(ans,prices[sell]-prices[buy]);
            }
        }
        return ans;
        
    }
};