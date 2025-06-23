class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0)continue;
            for(int j=i+1;j<nums.length-1;j++){
                int s=nums[i]+nums[j],k=j;
                int l=j+1,h=nums.length-1;
                while(l<=h){
                    int mid=(l+h)/2;
                    if(nums[mid]<s){
                        k=mid;
                        l=mid+1;
                    }else{
                        h=mid-1;
                    }
                }
                c+=k-j;
            }
        }
        return c;
    }
}