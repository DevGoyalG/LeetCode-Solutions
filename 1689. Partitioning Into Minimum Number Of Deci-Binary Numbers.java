class Solution {
   public int minPartitions(String n) {
        int max = Integer.MIN_VALUE;
        char[] chars = n.toCharArray();

        for (char c : chars)
            if (max < c - '0')
                max = c - '0';

        return max;
    }
}
