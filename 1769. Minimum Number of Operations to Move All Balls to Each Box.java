class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(boxes.charAt(j)=='1'){
                    count=count+Math.abs(j-i);
                }
            }
            arr[i]=count;
            count=0;
        }
        return arr;
    }
}
