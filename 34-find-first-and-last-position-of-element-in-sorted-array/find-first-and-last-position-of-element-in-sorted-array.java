class Solution {
    public int[] searchRange(int[] nums, int target) {
         int[] arr={-1,-1};
         if(nums.length==0){
            return arr;
         }
         int l=0;
         int r=nums.length-1;
         while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=target){
                r=mid-1;
            }else{
                l=mid+1;
            }
         }
         if(l<nums.length && nums[l]==target){
            arr[0]=l;
         }else{
            return arr;
         }
          l = 0;
    r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target) {
                l= mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (r >= 0 && nums[r] == target) {
            arr[1] = r;
        }
        
        return arr;

                 
    }
}