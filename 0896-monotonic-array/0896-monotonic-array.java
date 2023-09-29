class Solution {
    public boolean isMonotonic(int[] nums) {
        int flag=0;
        int flag2=0;
        for(int i=1;i<nums.length;i++)
        {
            if(!(nums[i-1]<=nums[i]))
            {
                flag=1;
                break;
            }
        }
        for(int i=1;i<nums.length;i++)
        {
            if(!(nums[i-1]>=nums[i]))
            {
                flag2=1;
                break;
            }
        }
        if(flag==1&&flag2==1)
        {
            return false;
        }
        return true;
    }
}