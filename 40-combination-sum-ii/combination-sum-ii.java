class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int start=0;
        List<Integer> current=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        
        helper(candidates,target,0,current,result);
        return result;

    }
    public void helper(int[] candidates, int target, int start,
    List<Integer> current,
    List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        
        for(int i =start;i<candidates.length;i++){
            if (candidates[i] > target) {
                    break;
                }
                if (i > start && candidates[i] == candidates[i - 1]) {
            continue;
        }
            current.add(candidates[i]);
            helper(candidates, target-candidates[i],i+1,current,result);
            current.remove(current.size()-1);
        }
        
    }
}