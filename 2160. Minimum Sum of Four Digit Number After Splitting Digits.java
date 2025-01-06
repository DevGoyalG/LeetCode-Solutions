class Solution {
    public int minimumSum(int n) {
        int[] a = new int[4];
        int i = 0;
        while (n > 0) {
            a[i] = n % 10;
            n /= 10;
            i++;
        }
        Arrays.sort(a);
        int x = (a[0] * 10) + a[2];
        int y = (a[1] * 10) + a[3];
        return x + y;
    }
}
