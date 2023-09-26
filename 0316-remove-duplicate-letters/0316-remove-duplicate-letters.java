class Solution {
    public String removeDuplicateLetters(String s) {
        int [] frequency = new int[26];
        StringBuilder sb = new StringBuilder();
        Deque<Character> st = new ArrayDeque<>();
        for(int i=0;i<s.length();i++)
        {
            frequency[s.charAt(i)-'a']+=1;
        }
        for(int i=0;i<s.length();i++)
        {
            System.out.println(st+"printing stack");
            for(int j=0;j<frequency.length;j++)
            {
                if(frequency[j]>0)
                {
                    System.out.println((char)(j+'a')+" : "+frequency[j]);
                }
            }
            char currchar=s.charAt(i);
            if(st.isEmpty())
            {
                st.push(currchar);

            }
            else{
                if(st.peek()<currchar&&!st.contains(currchar))
                {
                    st.push(currchar);
                    
                }
                else
                {
                    while(st.size()>0&&st.peek()>currchar&&frequency[st.peek()-'a']>0&&!st.contains(currchar))
                    {
                        st.pop();
                    }
                    if(!st.contains(currchar))
                    {
                        System.out.println(i +" "+ currchar+" zzdfssddssda");
                        st.push(currchar);
                    }
                    
                }
            }
            frequency[currchar-'a']-=1;
            System.out.println("*88888888888888888888*********");
        }
        System.out.println(st+"printing stack");
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        sb.reverse();
        System.out.println(st+"a     ");
        return sb.toString();
    }
}