class Solution {
    public int totalSteps(int[] nums) {
        int n=nums.length;
        int ans=0;
        Stack<Pair<Integer,Integer>> st=new Stack<>();
        st.push(new Pair<>(nums[n-1],0));
        for(int i=n-2;i>=0;i--){
            int c=0;
            while(!st.isEmpty() && nums[i]>st.peek().getKey()){
                c=(int)Math.max(c+1,st.peek().getValue());
                st.pop();
            }
            ans=(int)Math.max(ans,c);
            st.push(new Pair<>(nums[i],c));
        }
        return ans;
        
        
    }
}