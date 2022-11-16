class Solution {
    public String truncateSentence(String s, int k) {
        String[] str=s.split(" ");
        String returnStr="";
        for(int i=0;i<k;i++){
            returnStr+=str[i]+" ";
        }
        return returnStr.substring(0,returnStr.length()-1);
    }
}