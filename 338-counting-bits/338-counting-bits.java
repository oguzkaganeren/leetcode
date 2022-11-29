class Solution {
    public int[] countBits(int n) {
        int[] ret=new int[n+1];
        for(int i=0;i<ret.length;i++){
            ret[i]=Integer.bitCount(i);
        }
        return ret;
    }
}