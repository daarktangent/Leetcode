class MyQueue {
    stack<int> main_stack, aux_stack;
public:
    MyQueue() {
        
    }
    
    void push(int x) {
        for(int i = 0; !main_stack.empty(); i++)
        {
            aux_stack.push(main_stack.top());
            main_stack.pop();
        }
        main_stack.push(x);
        for(int i = 0; !aux_stack.empty(); i++)
        {
            main_stack.push(aux_stack.top());
            aux_stack.pop();
        }
    }
    
    int pop() {
        int x = main_stack.top();
        main_stack.pop();
        return x;
    }
    
    int peek() {
        return main_stack.top();
    }
    
    bool empty() {
        return main_stack.empty();
    }
};

