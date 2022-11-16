class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> resultList = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int firstNumber=nums[i];
            
            for(int z=i+1;z<nums.length;z++)
            {
                if(firstNumber+nums[z]==target){
                    resultList.add(i);
                    resultList.add(z);
                    i++;
                }
            }
        }
        int[] result = new int[resultList.size()];
        result = resultList.stream().mapToInt(i->i).toArray();
        return result;
    }
}