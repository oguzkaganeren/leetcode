class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] returnArr=new int[encoded.length+1];
        returnArr[0]=first;
        for(int i=0; i<encoded.length;i++){
            returnArr[i+1]=encoded[i]^returnArr[i];
        }
        return returnArr;
    }
}