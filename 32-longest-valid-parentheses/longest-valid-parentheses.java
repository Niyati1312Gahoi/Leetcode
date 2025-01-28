class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> S=new Stack<>();
        S.push(-1);
        int maxlen=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                S.push(i);
            }else{
               S.pop();
               if(S.isEmpty()){
                S.push(i);
               }else{
                maxlen=Math.max(maxlen,i-S.peek());
               }
            }
        }
        return maxlen;
    }
}