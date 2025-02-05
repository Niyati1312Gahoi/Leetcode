class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int c=0;
        for(int i=1;i<nums.length;i++){
            if((nums[i]%2==0 && nums[i-1]%2!=0)||(nums[i-1]%2==0 && nums[i]%2!=0) ){
                c++;
            }
        }
        if(c==nums.length-1){
            return true;
        }
       return false; 
    }
}