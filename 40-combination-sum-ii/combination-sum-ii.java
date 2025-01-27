class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        combinationsum(candidates,target,new ArrayList<Integer>(),result,0);
        return result;

    }
    public void combinationsum(int[] candidates,int target,List<Integer> combination,List<List<Integer>> result,int start){
        if(target==0){
            result.add(new ArrayList<>(combination));
            return;
        }
        if(target<0){
            return;
        }

        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]) continue;
            combination.add(candidates[i]);
            combinationsum(candidates,target-candidates[i],combination,result,i+1);
            combination.remove(combination.size()-1);
        }
    }
}