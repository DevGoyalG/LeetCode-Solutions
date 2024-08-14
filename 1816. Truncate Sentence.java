class Solution {
    public String truncateSentence(String s, int k) {
        String ans=new String("");
        int ind=0;
        for(String word:s.split(" ")){
                 ind++;
                 ans+=word;
                 if(ind==k){
                    return ans;
                 }
                 ans+=" ";
                 
        }
        return ans;
    }
}
