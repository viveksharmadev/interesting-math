// https://leetcode.com/problems/evaluate-reverse-polish-notation/
class Solution {
    // tc -> n, sc-> d where d is number of digits
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String t : tokens){
            if(t.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(t.equals("-")){
                Integer a = stack.pop();
                Integer b = stack.pop();
                stack.push(b-a);
            }else if(t.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(t.equals("/")){
                Integer a = stack.pop();
                Integer b = stack.pop();
                stack.push(b/a);
            }else{
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }
}
