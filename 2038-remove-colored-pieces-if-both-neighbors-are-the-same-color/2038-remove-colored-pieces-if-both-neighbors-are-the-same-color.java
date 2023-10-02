class Solution {
    public boolean winnerOfGame(String colors) {
        int noOfa=0;
        int noOfb=0;
        for(int i=1;i<colors.length()-1;i++)
        {
            if(colors.charAt(i)=='A'&&colors.charAt(i-1)=='A'&&colors.charAt(i+1)=='A')
            {
                noOfa++;
            }
            else if(colors.charAt(i)=='B'&&colors.charAt(i-1)=='B'&&colors.charAt(i+1)=='B')
            {
                noOfb++;
            }
            
        }
        if(noOfa<=noOfb)
        {
            return false;
        }
        return true;
    }
}