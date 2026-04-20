class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> min;

    public MinStack() {

        stack = new Stack<Integer>();
        min = new Stack<Integer>();
        
    }
    
    public void push(int val) {

        stack.push(val);
        if (min.empty() || val < min.lastElement()) {
            min.push(val);
        } else {
            min.push(min.lastElement());
        }
        
    }
    
    public void pop() {
        stack.pop();
        min.pop();
    }
    
    public int top() {
        return stack.lastElement();
    }
    
    public int getMin() {
        return min.lastElement();
    }
}
