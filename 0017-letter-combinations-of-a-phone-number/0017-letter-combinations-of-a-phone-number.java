class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        if(digits.length()==0)
        {
            return ans;
        }
        HashMap<Character,List<String>> map= new HashMap<>();
        map.put('2',Arrays.asList("a","b","c"));
        map.put('3',Arrays.asList("d","e","f"));
        map.put('4',Arrays.asList("g","h","i"));
        map.put('5',Arrays.asList("j","k","l"));
        map.put('6',Arrays.asList("m","n","o"));
        map.put('7',Arrays.asList("p","q","r","s"));
        map.put('8',Arrays.asList("t","u","v"));
        map.put('9',Arrays.asList("w","x","y","z"));
        travel(digits,0,temp,ans,map);
        return ans;
    }
    public void travel(String digits,int currPos,StringBuilder temp, List<String> ans,HashMap<Character,List<String>> map)
    {
        if(currPos==digits.length())
        {
            ans.add(temp.toString());
            return;
        }
        List<String> last= map.get(digits.charAt(currPos));
        for(int i=0;i<last.size();i++)
        {
            temp.append(last.get(i));
            travel(digits,currPos+1,temp,ans,map);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}