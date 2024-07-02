class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ll=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int min_row=0;
        int min_col=0;
        int max_row=n-1;
        int max_col=m-1;
        int count_max=n*m;
        int c=0;
        while(min_row<=max_row && min_col<=max_col && c<count_max){
        for(int i=min_col;i<=max_col && c<=count_max ;i++){
            ll.add(matrix[min_row][i]);
            c++;
        
        }
        min_row++;
        for(int i=min_row;i<=max_row && c<count_max;i++){
             ll.add(matrix[i][max_col]);
             c++;
        
        }
        max_col--;
        for(int i=max_col;i>=min_col && c<count_max;i--){
            ll.add(matrix[max_row][i]);
            c++;
        }
        max_row--;
        for(int i=max_row;i>=min_row && c<count_max;i--){
            ll.add(matrix[i][min_col]);
            c++;
        }
        min_col++;
        }
        return ll;
        
    }
}