class Solution {
    public int maxAscendingSum(int[] nums) {

         int n=nums.length;
        if(n==1) return nums[0];
        int maxsum=0,sum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
              
            }
             else{
                   maxsum=Math.max(maxsum,sum);
                sum=nums[i];
             

               
            }
            maxsum= Math.max(maxsum,sum);
        }
         return maxsum;
 
    }
}