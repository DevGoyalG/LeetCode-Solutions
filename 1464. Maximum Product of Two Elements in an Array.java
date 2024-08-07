class Solution {
    public int maxProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            }
            
            else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        int ans = (largest - 1) * (secondLargest - 1);
        return ans;
    }
}
