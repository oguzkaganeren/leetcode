class Solution {
    public int heightChecker(int[] heights) {
        int[] nonOrder=heights.clone();
        Arrays.sort(heights);
        int counter=0;
        for(int i=0;i<heights.length;i++){
            if(nonOrder[i]!=heights[i]) counter++; 
        }
        return counter;
    }
}