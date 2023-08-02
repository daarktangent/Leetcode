class Solution {
    public static void swapIntegers(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public void travel(int[] nums,List<List<Integer>> ans,int n)
    {
        if(n==nums.length)
        {
           List<Integer> combination = new ArrayList<>();
            for (int num : nums) {
                combination.add(num);
            }
            ans.add(combination);
            return;
        }
        for(int i=n;i<nums.length;i++)
        {
            swapIntegers(nums,i,n);
            travel(nums,ans,n+1);
            swapIntegers(nums,i,n);
        }
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        travel(nums,ans,0);
        return ans;
    }
}