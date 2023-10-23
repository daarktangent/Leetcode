class MinStack {
    Stack<Pair<Integer,Integer>> sta = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(sta.isEmpty())
        {
            sta.push(new Pair(val,val));
        }
        else
        {
             int currentMin = Math.min(val, sta.peek().getValue()); // Access the top element with peek()
             sta.push(new Pair<>(val, currentMin));
        }
    }
    
    public void pop() {
        sta.pop();
    }
    
    public int top() {
         return sta.peek().getKey();
    }
    
    public int getMin() {
         return sta.peek().getValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */