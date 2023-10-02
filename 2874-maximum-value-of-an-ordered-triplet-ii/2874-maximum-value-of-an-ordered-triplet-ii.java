class Solution {
    public long maximumTripletValue(int[] nums) {
        int [] pre = new int[nums.length];
        int [] post = new int[nums.length];
        long ans=0;
        pre[0]=0;
        post[nums.length-1]=0;
        for(int i=1;i<nums.length;i++)
        {
            pre[i] = Math.max(pre[i-1],nums[i-1]);
        }
        for(int i = nums.length-2;i>=0;i--)
        {
            post[i] = Math.max(post[i+1],nums[i+1]);
        }
        for(int i=1;i<nums.length-1;i++)
        {
            long temp = pre[i]-nums[i];
            ans = Math.max(ans,(temp*post[i]));
            //System.out.println(pre[i]+ " "+ post[i]+" "+nums[i]+" "+ans+" "+(pre[i]-nums[i]));
        }
        return ans;
    }
    
}