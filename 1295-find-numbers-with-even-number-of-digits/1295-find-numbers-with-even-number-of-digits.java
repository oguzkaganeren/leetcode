class Solution {
    public int findNumbers(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            String tmp=String.valueOf(nums[i]);
            if(tmp.length()%2==0){
                result++;
            }
        }
        return result;
    }
}