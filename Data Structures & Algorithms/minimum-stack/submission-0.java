class MinStack {
    private Stack<Integer> mainstack;
    private Stack<Integer> minstack;

    public MinStack() {
        mainstack = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) {
        mainstack.push(val);
        if(minstack.isEmpty()){
            minstack.push(val);
        }
        else
        minstack.push(Math.min(val,minstack.peek()));
    }
    
    public void pop() {
        mainstack.pop();
        minstack.pop();
    }
    
    public int top() {
       return mainstack.peek();
    }
    
    public int getMin() {
       return minstack.peek();
    }
}
