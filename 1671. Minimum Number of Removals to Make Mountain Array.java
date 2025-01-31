import java.util.*;

class Solution {
    private List<Integer> lisLength(int[] nums) {
        List<Integer> lis = new ArrayList<>();
        lis.add(nums[0]);
        List<Integer> lisLen = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            lisLen.add(1);
        }
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > lis.get(lis.size() - 1)) {
                lis.add(nums[i]);
            } else {
                int index = Collections.binarySearch(lis, nums[i]);
                if (index < 0) {
                    index = -(index + 1);
                }
                lis.set(index, nums[i]);
            }
            lisLen.set(i, lis.size());
        }
        return lisLen;
    }
    
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        
        List<Integer> lis = lisLength(nums);
        
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = nums[n - 1 - i];
        }
        List<Integer> lds = lisLength(reversed);
        Collections.reverse(lds);
        
        int removals = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (lis.get(i) > 1 && lds.get(i) > 1) {
                removals = Math.min(removals, n + 1 - lis.get(i) - lds.get(i));
            }
        }
        
        return removals;
    }
}
