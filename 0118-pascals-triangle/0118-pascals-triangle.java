class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(1));
        for(int i=1;i<numRows;i++)
        {
            List<Integer> temp = Arrays.asList(new Integer[i+1]);
            temp.set(0,1);
            temp.set(i,1);
            for(int j=1;j<i;j++)
            {
                temp.set(j,ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            ans.add(temp);
        }
        return ans;
    }
}