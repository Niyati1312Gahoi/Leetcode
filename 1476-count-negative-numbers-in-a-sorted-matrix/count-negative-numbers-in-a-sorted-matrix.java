class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;

        for(int i=0;i<grid.length;i++){
            int l=0,h=grid[0].length-1;
            while(l<=h){
                int mid=l+(h-l)/2;
                if(grid[i][mid]<0){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }
            c+=grid[0].length-l;
        }
        return c;
        
    }
}