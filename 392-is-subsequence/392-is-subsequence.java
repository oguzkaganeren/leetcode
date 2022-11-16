class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            int cindex=t.indexOf(arr[i]);
            if(cindex==-1 || t.length()==0) return false;
            t=t.substring(cindex+1);
        }
        return true;
    }
}