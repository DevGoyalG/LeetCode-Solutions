class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean isFound=false;
        int count=0;
        for(String a:words){
            for(int i=0;i<a.length();i++){
                isFound=false;
                char c1=a.charAt(i);
                for(int j=0;j<allowed.length();j++){
                    char c2=allowed.charAt(j);   
                    if(c1==c2){
                        isFound=true;
                    }           
                }
                if (!isFound){
                    break;
                }
            }
            if(isFound){
                count++;
            }
        }
        return count;
    }
}
