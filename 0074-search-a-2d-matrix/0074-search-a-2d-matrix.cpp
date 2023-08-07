class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row = matrix.size()-1;
        int col = matrix[0].size()-1;
        int left =0,right = row;
        int mid;
        while(left<right)
        {
            mid = left+((right-left)/2);
            if(matrix[mid][col]==target)
            {
                return true;
            }
            else if(matrix[mid][col]<target)
            {
                left = mid+1;
            }
            else
            {
                right = mid;
            }
        }
        for(int i=0;i<matrix[0].size();i++)
        {
            if(matrix[left][i]==target)
            {
                return true;
            }
        }
        return false;
    }
};