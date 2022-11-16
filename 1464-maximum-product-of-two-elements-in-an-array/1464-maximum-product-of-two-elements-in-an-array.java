class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int maxSec=0;
        
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                maxSec=max;
                max=nums[i];
            }else{
                if(maxSec<nums[i]){
                    maxSec=nums[i];
                }
            }
        }
        return (max-1)*(maxSec-1);
    }
}