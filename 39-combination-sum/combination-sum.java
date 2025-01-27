class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> combination=new ArrayList<>();
        combinationsum(candidates,target,combination,result,0);
        return result;

        
    }public void combinationsum(int[] candidates,int target,List<Integer> combination,List<List<Integer>> result,int start){
        if(target==0){
            result.add(new ArrayList<>(combination));
            return;
        }
        if(target<0) return;

        for(int i=start;i<candidates.length;i++){
            combination.add(candidates[i]);
            combinationsum(candidates,target-candidates[i],combination,result,i);
            combination.remove(combination.size()-1);

        }
    }

}