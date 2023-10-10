class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans =n;
        List<Integer> unique = new ArrayList<>();
        HashSet<Integer> map = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(!map.contains(nums[i]))
            {
                unique.add(nums[i]);
            }
            map.add(nums[i]);
        }
        Collections.sort(unique);
        System.out.println(unique);
        int j=0;
        for(int i=0;i<unique.size();i++)
        {
            int tar = n+unique.get(i)-1;
            //System.out.println(tar+" "+n+" "+unique.get(i));
            while(j<unique.size()&&unique.get(j)<=tar)
            {
                //System.out.println("in "+unique.get(j)+" "+ j+" "+ans);
                j++;
            }
            ans = Math.min(ans,n-(j-i));
        }
        return ans;
    }
}