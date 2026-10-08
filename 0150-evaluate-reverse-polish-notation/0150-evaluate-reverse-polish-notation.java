class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String token : tokens){
            stack.push(token);
            String top = stack.peek();
            if(top.equals("+")){
                stack.pop();
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b+a));
            }
            else if(top.equals("-")){
                stack.pop();
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b-a));
            }
            else if(top.equals("*")){
                stack.pop();
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b*a));
            }
            else if(top.equals("/")){
                stack.pop();
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b/a));
            }
        }
        return Integer.parseInt(stack.pop());
    }
}