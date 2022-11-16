class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len=word1.length()>=word2.length()?word1.length():word2.length();
        String ret="";
        for(int i=0;i<len;i++){
            if(i<word1.length())
                ret+=word1.charAt(i);
            if(i<word2.length())
                ret+=word2.charAt(i);
        }
        return ret;
    }
}