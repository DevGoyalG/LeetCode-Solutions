class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] res=new int[(encoded.length)+1];
        res[0]=first;
        int xor=0;
        int x=0;
        int y=0;
        while(y<encoded.length)
        {
            xor=encoded[x]^res[y];
            y++;
            res[y]=xor;
            x++;
        }
        return res;
    }
}
