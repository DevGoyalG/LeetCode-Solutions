class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2*n];         // for x and y
        for(int i=0; i<n; i++){
            arr[2 * i] = nums[i];         // Place xi at even indices
            arr[2 * i + 1] = nums[i + n]; // Place yi at odd indices
        }
        return arr;
    }
}
