class Solution {
public:
    void sortColors(vector<int>& nums) {
        int l=0,m=0;
        int r=nums.size()-1;
        int n = nums.size();
        
        while(m<=r)
        {
            if(nums[m]==0)
            {
                swap(nums[m],nums[l]);
                m++;
                l++;
            }
            else if(nums[m]==1)
            {
                m++;
            }
            else if(nums[m]==2)
            {
                swap(nums[m],nums[r]);
                r--;
            }
        }
    }
};