class Solution {
    public int change(int amount, int[] coins) {
       
        return change(coins,amount,coins.length);


    }
    public static int change(int[] arr,int target,int index){
        int[][] dp=new int[target+1][arr.length+1];
        Arrays.fill(dp[0],1);
        for(int amount=1;amount<=target;amount++){
            for(int j=1;j<=arr.length;j++){
                int coin=arr[j-1];
                int pick=0,not_pick=0;
                if(coin<=amount){
                    pick=dp[amount-coin][j];

                }
                not_pick=dp[amount][j-1];
                dp[amount][j]=pick+not_pick;
            }
            

        }
        return dp[target][index];
    }
}