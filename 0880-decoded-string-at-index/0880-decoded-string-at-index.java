class Solution {
    public String decodeAtIndex(String s, int k) {
        long total = 0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int digit = s.charAt(i) - '0'; 
                total*=digit;
            }
            else
            {
                total++;
            }
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.println(k%total+" "+ k+" "+total);
            k%=total;
            if(k==0&&Character.isDigit(s.charAt(i))==false)
            {
                return Character.toString(s.charAt(i));
            }
            if(Character.isDigit(s.charAt(i)))
            {
                total = total/(s.charAt(i)-'0');
            }
            else
            {
                total--;
            }
        }
        System.out.println(total);
        return " ";
    }
}