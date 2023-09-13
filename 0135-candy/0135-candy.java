class Solution {
    public int candy(int[] ratings) {
        List<Integer> left = new ArrayList<>(Collections.nCopies(ratings.length,1));
        List<Integer> right = new ArrayList<>(Collections.nCopies(ratings.length,1));
        for(int i=1;i<ratings.length;i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                left.set(i,Integer.valueOf(left.get(i-1)+1));
            }
        }
        for(int i=ratings.length-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1])
            {
                right.set(i,Integer.valueOf(right.get(i+1)+1));
            }
        }
        int count=0;
        for(int i=0;i<ratings.length;i++)
        {
            count+=Math.max(left.get(i),right.get(i));
        }
        System.out.println(left+"  "+ right);
               return count;
    }
}