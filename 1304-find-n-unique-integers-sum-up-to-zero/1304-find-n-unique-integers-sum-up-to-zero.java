class Solution {
    public int[] sumZero(int n) {
        int[] res=new int[n];
        for(int i=0;i<n/2;i++){
            res[i]=2*i-n+1;
            res[n-i-1]=2*(n-i-1)-n+1;
        }
        return res;
    }
}