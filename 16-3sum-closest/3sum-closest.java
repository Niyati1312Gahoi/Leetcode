class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int diff =Integer.MAX_VALUE;
        int sum=0;
        int ans=0;
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
             
            while(j<k){
                sum=(nums[i]+nums[j]+nums[k]);
                if(sum==target){
                    return sum;
                }
                else if(Math.abs(sum-target)<diff){
                    diff=Math.abs(sum-target);
                    ans=sum;
                }

                if(sum<target){
                   j++;
                }else if(sum>target){
                   k--;
                }
            }
               
        }

        return ans;
        
    }
}