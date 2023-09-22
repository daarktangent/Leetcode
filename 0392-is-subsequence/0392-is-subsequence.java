class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length())
        {
            return false;
        }
        int sPointer = 0;
        int tPointer =0;
        while(tPointer<t.length())
        {
            if(sPointer>=s.length())
            {
                return true;
            }
            if(s.charAt(sPointer)==t.charAt(tPointer))
            {
                sPointer++;
            }
            tPointer++;
        }
        if(sPointer<s.length())
        {
            return false;
        }
        return true;
    }
}