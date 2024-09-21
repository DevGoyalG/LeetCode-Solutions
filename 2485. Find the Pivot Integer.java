class Solution 
{
    public int pivotInteger(int n) 
    {
        int totalSum = (n * (n+1))/2;
        int left = 0, right = n;    

        while(left <= right)
        {
            int middleNum = (left+right)/2;
            int leftSum = (middleNum * (middleNum+1))/2;
            int rightSum = totalSum - leftSum + middleNum;

            if(leftSum == rightSum)
                return middleNum;

            else if(leftSum < rightSum)
                left = middleNum + 1;

            else
                right = middleNum - 1;
        }

        return -1;
    }
}
