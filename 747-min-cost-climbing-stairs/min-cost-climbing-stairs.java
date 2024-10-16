class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
    
        return Math.min(mincost(cost,0,dp),mincost(cost,1,dp));
        
    }
    public int mincost(int[] arr,int i,int[] dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int cost=mincost(arr,i+1,dp);
        int notcost=mincost(arr,i+2,dp);
        return dp[i]= Math.min(cost,notcost)+arr[i];
    }
}