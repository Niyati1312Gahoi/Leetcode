class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return LCS(text1,text1.length()-1,text2,text2.length()-1,dp);
        
    }
    private static int LCS(String s1,int i,String s2,int j,int[][] dp){
        if(i==-1 || j==-1) return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=LCS(s1,i-1,s2,j-1,dp)+1;
        }else{
            int c1=LCS(s1,i-1,s2,j,dp);
            int c2=LCS(s1,i,s2,j-1,dp);
            ans=Math.max(c1,c2);
        }

        return dp[i][j]=ans;
    }
}