class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return maxmoney(nums,nums.length-1,dp);


        
    }
     public static int maxmoney(int[] house,int index,int[] dp){


        if(index < 0){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int choose=house[index]+maxmoney(house,index-2,dp);
        int not_choose=maxmoney(house,index-1,dp);

        return dp[index]=Math.max(choose,not_choose);

    }

}