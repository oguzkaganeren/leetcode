class Solution {
    public int[] diStringMatch(String s) {
        int len=s.length();
        int left=0;
        int right=len;
        int[] res=new int[len+1];
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='I'){
                res[i]=left++;
            }
            else{
                res[i]=right--;
            }
        }
       res[len]=left;
        return res;
    }
}