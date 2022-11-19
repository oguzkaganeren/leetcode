class Solution {
    public String generateTheString(int n) {
        String ret="";
        int start=0;
        if(n%2==0){
            ret+="a";
            start++;
        }
        for(int i=start;i<n;i++){
            ret+="b";
        }
        return ret;
    }
}