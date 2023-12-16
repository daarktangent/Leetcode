class Solution {
public:
    bool isAnagram(string s, string t) {
        unordered_map<char,int> m ;
	if(s.size()!=t.size())
	{
		return false;
	}
	else
	{
		for(int i=0;i<s.size();i++)
		{
			m[s[i]]++;
			m[t[i]]--;
		}
		for(auto x:m)
		{
			if(x.second!=0)
			{
				return false;
			}
		}
	}
	return true;
    }
};