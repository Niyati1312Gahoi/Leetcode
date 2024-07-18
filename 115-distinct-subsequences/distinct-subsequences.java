class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp=new int[s.length()][t.length()];
        for(int[]arr:dp){
            Arrays.fill(arr,-1);
        }
        return num(s,0,t,0,dp);
        
    }
    public int num(String s,int i,String t,int j,int[][] dp){
        if(j==t.length()) return 1;
        if(i==s.length()) return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int pick=0;
        int not_pick=0;
        if(s.charAt(i)==t.charAt(j)){
            pick=num(s,i+1,t,j+1,dp);
            not_pick=num(s,i+1,t,j,dp);
        }else{
            not_pick=num(s,i+1,t,j,dp);
        }

       return dp[i][j]=pick+not_pick;
    }
}