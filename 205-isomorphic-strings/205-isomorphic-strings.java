class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] temp=new int[256];
        int[] temp2=new int[256];
        for(int i=0;i<s.length();i++){
            if(temp[s.charAt(i)]!=temp2[t.charAt(i)]) return false;
            temp[s.charAt(i)]=i+1;
            temp2[t.charAt(i)]=i+1;
        }
        return true;
    }
}