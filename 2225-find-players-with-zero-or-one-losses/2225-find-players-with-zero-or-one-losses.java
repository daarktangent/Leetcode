class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> win = new HashMap<>();
        HashMap<Integer,Integer> lost = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<matches.length;i++)
        {
            win.put(matches[i][0],win.getOrDefault(matches[i][0],0)+1);
            lost.put(matches[i][1],lost.getOrDefault(matches[i][1],0)+1);
        }
        List<Integer> temp1 = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:win.entrySet())
        {
            if(!(lost.containsKey(entry.getKey())))
            {
                temp1.add(entry.getKey());
            }
        }
        List<Integer> temp2 = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:lost.entrySet())
        {
            if(entry.getValue()==1)
            {
                temp2.add(entry.getKey());
            }
        }
        Collections.sort(temp1);
        Collections.sort(temp2);
        ans.add(temp1);
        ans.add(temp2);
        return ans;
    }
}