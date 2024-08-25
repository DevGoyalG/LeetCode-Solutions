class Solution {
    public int[] sortArrayByParity(int[] nums) {
      int pos = 0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]%2==0){
            int s = nums[pos];
            nums[pos] = nums[i];
            nums[i] = s;
            pos++;
          }
        }
        if(nums.length==0){
          return nums;
        }
        return nums;
    }
}
