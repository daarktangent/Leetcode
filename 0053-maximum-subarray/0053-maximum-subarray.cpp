class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int max_sum = nums[0];
        int temp=0;
        for(int i=0;i<nums.size();i++)
        {
            temp = temp+nums[i];
            if(temp>max_sum)
            {
                max_sum = temp;
            }
            if(temp<0)
            {
                temp =0;
            }
        }
        return max_sum;
    }
};