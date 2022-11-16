class Solution {
    public int xorOperation(int n, int start) {
        int[] nums=new int[n];
        int returnVal=0;
        for(int i=0;i<n;i++){
            nums[i]=start+2*i;
            if(i==0) returnVal=nums[i];
            else returnVal^=nums[i];
        }
        return returnVal;
    }
}