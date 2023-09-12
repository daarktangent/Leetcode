class Solution {
    public int minDeletions(String s) {
        List<Integer> freq = new ArrayList<>(Collections.nCopies(26, 0));
        for(int i=0;i<s.length();i++)
        {
            freq.set(s.charAt(i)-'a',freq.get(s.charAt(i)-'a')+1);
        }
        Collections.sort(freq);
        int count=0;
        int maxi = freq.get(25);
        for(int i=25;i>=0;i--)
        {
            if(freq.get(i)==0)
            {
                break;
            }
            if(maxi==freq.get(i))
            {
               
                maxi--;
                 //System.out.println(i+"if" +count);
            }
            else if(freq.get(i)<maxi&&maxi>=0)
            {
                maxi=freq.get(i);
                maxi--;
                 //System.out.println(i+"else if"+  count);
            }
            else if(freq.get(i)>maxi&&maxi>=0)
            {
                count+=freq.get(i)-maxi;
                maxi--;
            }
            else
            {
                
                count+=freq.get(i);
                 //System.out.println(i+"else"+count);
            }
        }
         //System.out.println(freq);
        return count;
    }
}