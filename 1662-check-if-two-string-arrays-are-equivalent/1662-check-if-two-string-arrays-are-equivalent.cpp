class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& word1, vector<string>& word2) {
        string temp1="";
        string temp2="";
        for(auto x:word1)
        {
            temp1+=x;
        }
        for(auto x:word2)
        {
            temp2+=x;
        }
        if(temp1.compare(temp2)==0)
        {
            return true;
        }
        return false;
    }
};