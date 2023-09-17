class Solution {
    public Boolean check(String haystack, String needle,int i)
    {
        if((i+needle.length())>haystack.length())
        {
            return false;
        }
        for(int x=0;x<needle.length();x++)
        {
            if(needle.charAt(x)!=haystack.charAt(i+x))
            {
                return false;
            }
        }
        return true;
    }
    public int strStr(String haystack, String needle) {
        int ans=-1;
        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(0)&&check(haystack,needle,i))
            {
                return i;
            }
        }
        return ans;
    }
}