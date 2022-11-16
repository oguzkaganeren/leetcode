class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> tempList=new ArrayList<Integer>();
        for(int i=0; i < nums.length;i+=2)
        {
            int freq=nums[i];
            int val=nums[i+1];
            for(int j=0;j<freq;j++){
                tempList.add(val);
            }
        }
        int[] result=new int[tempList.size()];
        for(int i=0;i<result.length;i++){
            int val=tempList.get(i);
            result[i]=val;
        }
        return result;
    }
}