class Solution {
    public boolean areOccurrencesEqual(String s) {
        int len=s.length();
        s=s.replace(s.substring(0,1),"");
        int diff=len-s.length();
        while(s.length()>0){
            len=s.length();
            s=s.replace(s.substring(0,1),"");
            if(len-s.length()!=diff) return false;
        }
        return true;
    }
}