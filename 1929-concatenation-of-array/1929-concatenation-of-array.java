class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] temp = new int[nums.length*2];
        int secondSeries=nums.length;
        for(int i=0; i<nums.length; i++)
        {
            temp[i]=nums[i];
            temp[secondSeries+i]=nums[i];
        }
        return temp;
    }
}