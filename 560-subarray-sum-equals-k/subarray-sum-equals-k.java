class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mpp=new HashMap<>();
        int c=0;
        int presum=0;
        mpp.put(0,1);
       
       for(int i=0;i<nums.length;i++){
        presum+=nums[i];
        int remove=presum-k;
        c += mpp.getOrDefault(remove, 0);

        mpp.put(presum,mpp.getOrDefault(presum,0) + 1);
       }
        return c;
    }
}