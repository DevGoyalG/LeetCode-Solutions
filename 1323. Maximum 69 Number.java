class Solution {
    public int maximum69Number (int num) {
     StringBuilder s= new StringBuilder(""+num);

     for(int i=0;i<s.length();i++){
         if(s.charAt(i)=='6') {
             s.setCharAt(i,'9');
             break;
         }
     }   

     return Integer.parseInt(s.toString());
    }
}
