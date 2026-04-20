class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int x;

        for (int i = 0; i < tokens.length; i++) {
            
            switch(tokens[i]) {
                case "+":  
                    stack.add(stack.pop() + stack.pop());
                    break;
                case "-":
                    x = stack.pop();
                    stack.add(stack.pop() - x);
                    break;
                case "*":
                    stack.add(stack.pop() * stack.pop());
                    break;
                case "/":
                    x = stack.pop();
                    stack.add(stack.pop() / x);
                    break;
                default:
                    stack.add(Integer.parseInt(tokens[i]));
                }
            
        }

        return stack.pop();

    }

}
