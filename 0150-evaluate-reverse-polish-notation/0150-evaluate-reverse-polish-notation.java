class Solution {
    public Boolean isOper(String c)
    {
        if(c.equals("*")||c.equals("+")||c.equals("/")||c.equals("-"))
                return true;
        return false;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> sta = new Stack<>();
        for(String x: tokens)
        {
            if(isOper(x))
            {
                System.out.println("h "+x);
                int op1 = sta.pop();
                int op2 = sta.pop();
                if(x.equals("+"))
                {
                    sta.push(op1+op2);
                }
                else if(x.equals("*"))
                {
                    sta.push(op1*op2);
                }
                else if(x.equals("/"))
                {
                    sta.push(op2/op1);
                }
                else
                {
                    sta.push(op2-op1);
                }
            }
            else
            {
               sta.push(Integer.valueOf(x));
            }
        }
        return sta.pop();
    }
}