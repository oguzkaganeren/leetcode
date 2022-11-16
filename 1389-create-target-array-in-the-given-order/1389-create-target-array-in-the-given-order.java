class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> result=new ArrayList<Integer>();
        int[] resultArr=new int[nums.length];
        result.add(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            result.add(index[i],nums[i]);
        }
        for(int i=0; i<nums.length;i++)
        {
            int val=result.get(i);
            resultArr[i]=val;
        }
        return resultArr;
    }
}