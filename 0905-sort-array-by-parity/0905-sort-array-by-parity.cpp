class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        int start=0;
        int end=nums.size()-1;
        while(start<end)
        {
            if(nums[start]%2==0)
            {
                start++;
            }
            if(nums[end]%2!=0)
            {
                end--;
            }
            if(start<end)
            {
                swap(nums[start],nums[end]);
            }
        }
        
        return nums;
        
    }
};