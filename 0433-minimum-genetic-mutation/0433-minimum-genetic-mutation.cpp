class Solution {
public:
    int minMutation(string start, string end, vector<string>& banks) {
        unordered_set<string> visited;
        unordered_set<string> bank;
        queue<string> q;
        vector<char> gene={'A','C','G','T'};
        for(int i=0;i<banks.size();i++)
        {
            bank.insert(banks[i]);
        }
        if(start==end)
        {
            return 0;
        }
        if(bank.find(end)==bank.end())
        {
            return -1;
        }
        q.push(start);
        visited.insert(start);
        int level=0;
        while(!q.empty())
        {
            
            int sz=q.size();
            while(sz--)
            {
                string temp=q.front();
                for(int i=0;i<temp.size();i++)
                {
                    string temp2=temp;
                    for(int j=0;j<gene.size();j++)
                    {
                        temp2[i]=gene[j];
                        if(visited.find(temp2)==visited.end()
                           &&bank.find(temp2)!=bank.end())
                        {
                            q.push(temp2);
                            visited.insert(temp);
                            if(temp2.compare(end)==0)
                            {
                                return level+1;
                            }
                        }
                    }
                }
                 q.pop();
            }
            
            level++;
           
        }
        return -1;
    }
};