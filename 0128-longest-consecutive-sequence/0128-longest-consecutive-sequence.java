class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int x:nums)
        {
            set.add(x);
        }
        System.out.println(set);
        int count=1;
        int ans=0;
        for(int x:set)
        {
            if(set.contains(x+1))
            {
                System.out.println(x+"asdas"+count);
                count++;
            }
            else
            {
                System.out.println(count);
                ans = Math.max(ans,count);
                count=1;
            }
        }
        return ans;
    }
}