class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector <int> out(2);
	    unordered_map <int,int> count;
        for(int i=0;i<nums.size();i++)
        {
            if(count[nums[i]]==0)
            {
                count[nums[i]] = i+1;
                int temp = target-nums[i];
                if(count[temp]&&nums[i]!=temp)
                {
                    out[0] = i;
                    out[1] = count[temp]-1;
                    break;
                }
            }
            else if(target==nums[i]*2)
            {
                out[0]= i;
                out[1] = count[nums[i]]-1;
                break;
            }
        }
        return out;
        }
};