class Solution {
    public int minDistance(String word1, String word2) {
        int[][] d1=new int[word1.length()][word2.length()];
        for(int[] i:d1){
            Arrays.fill(i,-1);
        }
        return editdistance(word1,0,word2,0,d1);
        
    }
    private int editdistance(String s1,int i,String s2,int j,int[][] dp){
        if(i==s1.length()) return s2.length()-j;
        if(j==s2.length()) return s1.length()-i;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=editdistance(s1,i+1,s2,j+1,dp);
        }
        else{
            int insertion=editdistance(s1,i,s2,j+1,dp);
            int deletion=editdistance(s1,i+1,s2,j,dp);
            int replace=editdistance(s1,i+1,s2,j+1,dp);
            ans=Math.min(insertion,Math.min(deletion,replace))+1;
        }

        return dp[i][j]=ans;
    }
}