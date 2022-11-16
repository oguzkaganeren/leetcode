class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy=0;
        List result=new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            if(maxCandy<candies[i])
                maxCandy=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies<maxCandy)
                result.add(false);
            else
                result.add(true);
        }
        return result;
        
    }
}