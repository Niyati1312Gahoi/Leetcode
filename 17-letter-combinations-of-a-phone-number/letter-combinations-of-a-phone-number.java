class Solution {
    static String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
         List<String> result=new ArrayList<>();
         if(digits.length()==0){
            return result;
         }
         combination(result,"",digits);
         return result;
        
    }
    public static void combination(List<String> s, String st,String digits){
        if(digits.length()==0){
            s.add(st);
            return;
        }

        char c=digits.charAt(0);
        String p=map[c-'0'];
        for(int i=0;i<p.length();i++){
            combination(s,st+p.charAt(i),digits.substring(1));
        }
      
    }
}