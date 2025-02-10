class Solution {
    public String clearDigits(String s) {
        StringBuilder stack=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                if(stack.length()>0){
                    stack.deleteCharAt(stack.length()-1);
                }
            }else{
                stack.append(s.charAt(i));
            }
        }
          return stack.toString();
    }
}