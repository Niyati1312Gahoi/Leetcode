class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0,r=n-1;
        int maxarea=0;
        while(l<r){
            int area=Math.min(height[l],height[r]) * (r-l);
            maxarea=Math.max(maxarea,area);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxarea;
       
        

        
    }
}