class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            if(max<nums[i]){
                max=nums[i];
            }
        }
        for(int i=1;i<=min;i++){
            if(min%i==0&&max%i==0){
                result=i;
            }
        }
        return result;
    }
}