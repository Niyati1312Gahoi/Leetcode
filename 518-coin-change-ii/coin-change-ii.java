class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[amount+1][coins.length];
        for(int[]arr:dp){
            Arrays.fill(arr,-1);
        }
        return change(coins,amount,0,dp);

        
    }
     public static int change(int[] arr,int target,int index,int[][] dp){
        if(target==0){
            return 1;
        }
       
        if(index == arr.length){
            return 0;
        }
         if(dp[target][index]!=-1){
            return dp[target][index];
        }
        int choose,not_choose;
        choose=not_choose=0;
        if(arr[index]<= target){
            choose=change(arr,target-arr[index],index,dp);

        }
        not_choose=change(arr,target,index+1,dp);
        return dp[target][index]=choose+not_choose;
    }
}