class MinStack {

    private Stack<Integer> s = new Stack<>();
    private Stack<Integer> min_values = new Stack<>();

    public MinStack() {
    }

    public void push(int value) {
        s.push(value);
        if (min_values.isEmpty()) {
            min_values.push(value);
        } else {
            min_values.push(Math.min(min_values.peek(), value));
        }
    }

    public void pop() {
        s.pop();
        min_values.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min_values.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */