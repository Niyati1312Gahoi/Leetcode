class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> set=new ArrayList<>();
        sub(nums,new ArrayList<>(),set,0);
        return set;
        
        
    }
    public void sub(int[] nums,List<Integer>sets,List<List<Integer>>result,int start){
        result.add(new ArrayList<>(sets));
        for(int i=start;i<nums.length;i++){
            sets.add(nums[i]);
            sub(nums,sets,result,i+1);
            sets.remove(sets.size()-1);

        }
    }
}