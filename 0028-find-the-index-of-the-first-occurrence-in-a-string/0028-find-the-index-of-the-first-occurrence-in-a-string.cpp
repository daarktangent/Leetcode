class Solution {
public:
    int strStr(string haystack, string needle) {
        vector<int> lps;
        for(int i=0;i<needle.size();i++)
        {
            lps.push_back(0);
        }
        int i=0;
        int j=1;
        while(j<lps.size())
        {
            if(needle[i]==needle[j])
            {
                lps[j]=i+1;
                i++;
                j++;
            }
            else
            {
                if(i!=0)
                {
                    i=lps[i-1];
                }
                if(needle[i]==needle[j])
                {
                    lps[j]=i+1;
                    j++;
                    i++;
                }
                else
                {
                    j++;
                }
            }
        }
        i=0;
        j=0;
        int flag=0;
        int flag1=0;
        int temp=-1;
        int n=haystack.size();
        int m= needle.size();
        while(i<haystack.size())
        {
            if(haystack[i]==needle[j])
            {
                i+=1;
                j+=1;
                if(j==m)
                    return i-j;
                
            }
            
            else
            {
                if(j)
                    j = lps[j-1];
                else
                    i+=1;
            }
        }
        return -1;
    }
};