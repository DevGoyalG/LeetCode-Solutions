class Solution {
    public String restoreString(String s, int[] indices) {
        char character[]=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            character[indices[i]]=s.charAt(i);
        }
        return new String(character); 
    }
}
