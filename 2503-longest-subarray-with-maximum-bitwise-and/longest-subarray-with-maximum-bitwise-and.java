class Solution {
    public int longestSubarray(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            x= Math.max(x,nums[i]);
        }
  int curr=0  ;
int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]== x){
                curr++;
                ans=Math.max(ans,curr);
            }else{
                curr=0;
            }
            
            
           
        }
      return ans;  
    }
}