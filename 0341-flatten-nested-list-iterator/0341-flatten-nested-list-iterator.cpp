class NestedIterator {
    vector<int> ans;
    int i=0;
    public:
        NestedIterator(vector<NestedInteger> &l) 
        {
            for(auto x:l)
            {
                flat(x);
            }
                    for(auto x:ans)
            {
                cout<<x<<endl;
            }

        }

            void flat(NestedInteger x)
            {
            if(x.isInteger())
            {
                ans.push_back(x.getInteger());
            }
             else 
             {
                 for (auto y : x.getList())
                 {
                      flat(y);
                 }
                   
            }
        }

    

    
    int next() {
        return ans[i++];
    }
    
    bool hasNext() {
        return i<ans.size();
    }
    
};
