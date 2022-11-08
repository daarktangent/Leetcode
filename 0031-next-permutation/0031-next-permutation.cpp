class Solution {
public:
    void nextPermutation(vector<int>& arr) {
         int a=-1,b=-1;
        int n=arr.size();
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                a=i;
                break;
            }
        }
        if(a!=-1)
        {
                    for(int i=n-1;i>=0;i--)
        {
            if(arr[a]<arr[i])
            {
                b=i;
                break;
            }
        }
        }

        if(a!=-1&&b!=-1)
        {
            swap(arr[a],arr[b]);
            reverse(arr.begin()+a+1,arr.end());
        }
        else
        {
            reverse(arr.begin(),arr.end());
        }
    }
};