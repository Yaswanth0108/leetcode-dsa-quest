class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String token : tokens){
            if(token.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b+a);
            }
            else if(token.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }
            else if(token.equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b*a);
            }
            else if(token.equals("/")){
               int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}