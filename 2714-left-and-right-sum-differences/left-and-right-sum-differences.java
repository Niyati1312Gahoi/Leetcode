class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int[] arr1=new int[n];
        
        for(int i=1;i<n;i++){
            arr[0]=0;
            arr[i]=arr[i-1]+nums[i-1];
        }
        for(int i = n-2 ; i >= 0 ; i--){
            arr1[n-1]=0;
            arr1[i] = arr1[i+1]+nums[i+1];
            
        }
        
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(arr[i]-arr1[i]);
        }
         return nums;
    }
    
    
}