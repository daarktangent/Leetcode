class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        vector<int> ans;
        deque<pair<int,int>> q;
        for(int i=0;i<nums.size();i++)
        {
            if(!q.empty()&&q.front().first==(i-k))
            {
                q.pop_front();
            }
            while(!q.empty()&&q.back().second<=nums[i])
            {
                q.pop_back();
            }
            q.push_back({i,nums[i]});
            if(i>=k-1) ans.push_back(q.front().second);
        }
        return ans;

    }
};