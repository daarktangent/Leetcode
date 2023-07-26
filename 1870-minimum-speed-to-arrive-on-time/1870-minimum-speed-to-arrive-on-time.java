class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if(hour<=dist.length-1)
        {
            return -1;
        }
        int right=100000000;
        int left =0;
        int mid=0;
        while(left<right)
        {
            mid = left+(right-left)/2;
            System.out.println(left+" "+ mid+ " "+right);
            
            if(check(dist,hour,mid))
            {
                right=mid;            
            }
            else
            {
                left = mid+1;
            }
        }
        return right;
    }
    public Boolean check(int[] dist, double hour,int mid)
    {
        double total =0;
        int i=0;
        for(i=0;i<dist.length-1;i++)
        {
            total +=Math.ceil(dist[i]*1.0/mid);
        }
        System.out.println(total+" "+(dist[i]*1.0)/mid+" print");
        total+=(dist[i]*1.0)/mid;
        System.out.println(total);
        if(total<=hour)
        {
            return true;
        }
        return false;
    }
}