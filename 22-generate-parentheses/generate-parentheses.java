class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> s=new ArrayList<>();
        para(n,s,"",0,0);
        return s;
        
    }
    public void para(int n,List<String> s,String com,int open_count,int close_count){
      
        if(open_count==n && close_count==n){
            s.add(com);
            return;
        }
        if(open_count<n){
            para(n,s,com+"(",open_count+1,close_count);
        }
        if(close_count<open_count){
            para(n,s,com+")",open_count,close_count+1);
        }

    }
}