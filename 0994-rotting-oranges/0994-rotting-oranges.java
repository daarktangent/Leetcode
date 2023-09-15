class Solution {
    public int orangesRotting(int[][] grid) {
        int [][] visited  = new int[grid.length][grid[0].length];
        Queue<List<Integer>> queue = new LinkedList<>();

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                {
                    queue.offer(Arrays.asList(i,j));
                }
            }
        }
        int time=0;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            while(size>0)
            {
                List<Integer> temp = new ArrayList<>();
               
                temp = queue.poll();
                int x = temp.get(0);
                int y = temp.get(1);
                if(visited[x][y]==0)
                {
                    System.out.println(x+"  "+ y);
                    visited[x][y]=1;
                    if(x+1<grid.length&&(grid[x+1][y]==1)&&visited[x+1][y]==0)
                    {
                         
                        grid[x+1][y]=2;
                        queue.offer(Arrays.asList(x+1,y));
                    }
                    if(x-1>=0&&(grid[x-1][y]==1)&&visited[x-1][y]==0)
                    {
                       
                         grid[x-1][y]=2;
                        queue.offer(Arrays.asList(x-1,y));
                    }
                    if(y+1<grid[0].length&&(grid[x][y+1]==1)&&visited[x][y+1]==0)
                    {
                       
                         grid[x][y+1]=2;
                         queue.offer(Arrays.asList(x,y+1));
                    }
                     if(y-1>=0&&(grid[x][y-1]==1)&&visited[x][y-1]==0)
                    {
                         
                          grid[x][y-1]=2;
                         queue.offer(Arrays.asList(x,y-1));
                    }
                }
                size--;
            }
           
            time++;
        }
        for(int [] x:grid)
        {
            for(int y:x)
            {
                if(y==1)
                {
                    return -1;
                }
            }
        }
        if(time==0)
        {
            return 0;
        }
        return time-1;
    }
}