class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] temp = new int[nums.length];
        for(int i=0; i<nums.length/2;i++){
            temp[2*i]=nums[i];
            temp[2*i+1]=nums[i+n];
        }
        return temp;
    }
}