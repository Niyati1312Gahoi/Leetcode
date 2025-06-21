class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<numRows;i++){
          List<Integer> t=new ArrayList<>();
          for(int j=0;j<=i;j++){
            if(j==0 || j==i){
                t.add(1);
            }else{
                int val=l.get(i-1).get(j-1)+l.get(i-1).get(j);
                t.add(val);
            }
          }
          l.add(t);
        }
        return l;
    }
}