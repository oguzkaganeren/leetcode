class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        int unique=n+1;
        int result=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=null){
                int val=map.get(nums[i])+1;
                map.put(nums[i],val);
            }else{
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> item:map.entrySet()){
            if(item.getValue().equals(n)){
                result=item.getKey();
                break;
            }
        }
        return result;
    }
}