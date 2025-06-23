class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] arr=new int[spells.length];
       
        for(int i=0;i<spells.length;i++){
            int l=0,h=potions.length;
            

            while(l<h){
                int mid=(l+h)/2;
                if((long)spells[i]*potions[mid]<success){
                    l=mid+1;
                }else if((long)spells[i]*potions[mid]>=success){
                 
                  h=mid;

                }
            }
            arr[i]=potions.length-l;
        }
         return arr;
    }
}