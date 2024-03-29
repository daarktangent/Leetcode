class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']+=1;
        }

        for(int i=0;i<t.length();i++)
        {
            freq[t.charAt(i)-'a']+=1;
        }
        for(int i=0;i<freq.length;i++)
        {
            if((freq[i]&1)==1)
            {
                return (char)(i+'a');
            }
        }
        return 'a';
    }
}