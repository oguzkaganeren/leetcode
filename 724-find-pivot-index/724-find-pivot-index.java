class Solution {
    public int pivotIndex(int[] nums) {
        int len=nums.length;
        int[] leftSum=new int[len];
        int[] rightSum=new int[len];
        leftSum[0]=nums[0];
        rightSum[len-1]=nums[len-1];
        for(int i=1;i<len;i++){
           leftSum[i]=nums[i]+leftSum[i-1];
            rightSum[len-i-1]=nums[len-i-1]+rightSum[len-i];
        }
        for(int i=0;i<len;i++){
            if(leftSum[i]==rightSum[i]) return i;
        }
        return -1;
    }
}