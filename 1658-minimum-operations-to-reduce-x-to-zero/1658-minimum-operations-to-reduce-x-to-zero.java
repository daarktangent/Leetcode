class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int target = sum-x;
        int maxwin = -1;
        int left=0;
        int right=0;
        int total=0;
        System.out.println(sum);
        while(right<nums.length)
        {
            
            total+=nums[right];
            right++;
            while(left<right&&total>target)
            {
                total-=nums[left];
                left++;
            }
            if(total == target)
            {
                //System.out.println("in"+right);
                maxwin = Math.max(maxwin,right-left);
            }
            //System.out.println(total+" "+maxwin);
        }
        if(maxwin==-1)
        {
            return -1;
        }
        return nums.length-maxwin;
    }
}