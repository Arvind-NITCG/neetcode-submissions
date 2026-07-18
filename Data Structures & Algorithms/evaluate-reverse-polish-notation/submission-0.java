class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int op1=0,op2=0;
        for(String token:tokens){
            if(token.equals("+")){
              op1 = stack.pop();
              op2 = stack.pop();
              stack.push(op1+op2);
            }
            else if(token.equals("-")){
              op1 = stack.pop();
              op2 = stack.pop();
              stack.push(op2-op1);
            }
            else if(token.equals("/")){
              op1 = stack.pop();
              op2 = stack.pop();
              stack.push(op2/op1);
            }
            else if(token.equals("*")){
              op1 = stack.pop();
              op2 = stack.pop();
              stack.push(op1*op2);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        if(stack.isEmpty()) return 0;
        return stack.pop();
    }
}