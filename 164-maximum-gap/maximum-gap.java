class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2){
            return 0;
        }
        Arrays.sort(nums);
        int current=0;
        int max_diff=0;
        for(int i=0;i<n-1;i++){
            current=(nums[i+1]-nums[i]);
            if(current>max_diff){
                max_diff=current;
            }


        }
        return max_diff;
        
    }
}