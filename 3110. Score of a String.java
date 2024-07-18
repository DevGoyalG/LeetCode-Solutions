class Solution {
    public int scoreOfString(String s) {
        int op = 0;
        for (int i = 1; i < s.length(); ++i) {
            op += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return op;
    }
}
