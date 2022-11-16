class Solution {
    public String firstPalindrome(String[] words) {
        String result="";
        for(int i=0;i<words.length;i++){
            int lenW=words[i].length();
            result=words[i];
            for(int j=0;j<lenW/2;j++){
                if(words[i].charAt(j)!=words[i].charAt(lenW-1-j)){
                    result="";
                    break;
                }
            }
            if(!result.equals("")) {
                break;
            }
        }
        return result;
    }
}