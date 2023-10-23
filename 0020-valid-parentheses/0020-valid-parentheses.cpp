class Solution {
public:
    bool isValid(string s) {
	stack <char> sta;
	bool output = true;
	for(int i=0;i<s.size();i++)
	{
		if(s[i]=='('||s[i]=='['||s[i]=='{')
		{
			sta.push(s[i]);
		}
		else
		{
			if(  (!sta.empty())  &&  ((s[i]==')'&&sta.top()=='(')||(s[i]==']'&&sta.top()=='[')||(s[i]=='}'&&sta.top()=='{'))  )
			{
				sta.pop();
			}
			else
			{
				output = false;
				break;
			}
		}
	}
	if(!sta.empty())
	{
		output = false;
	}
        return output;
    }
};