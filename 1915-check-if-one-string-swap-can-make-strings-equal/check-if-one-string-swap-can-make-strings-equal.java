class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
     
        List<Integer> l=new ArrayList<>();
      

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                l.add(i);
                if(l.size()>2){
                    return false;
                }
            }

            
        }
        if(l.size()==0){
            return true;
        }
        if(l.size()==2){
            int l1=l.get(0);
            int l2=l.get(1);
            return s1.charAt(l1)==s2.charAt(l2) && s1.charAt(l2)==s2.charAt(l1);
        }

        return false;
    }
}