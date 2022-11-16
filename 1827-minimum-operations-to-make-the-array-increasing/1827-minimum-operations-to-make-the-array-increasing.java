class Solution {
    public int minOperations(int[] nums) {
        int counter=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
                int diff=Math.abs(nums[i]-nums[i-1]);
                nums[i]+=diff+1;
                counter+=diff+1;
            }
        }
        return counter;
    }
}