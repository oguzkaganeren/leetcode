class Solution {
    public String longestCommonPrefix(String[] strs) {
        String firstOne=strs[0];
        String result="";
        for(int i=0;i<firstOne.length();i++){
            for(int z=1;z<strs.length;z++){
                if(i==strs[z].length()|| firstOne.charAt(i)!=strs[z].charAt(i)){
                    return result;
                }
            }
            result+=firstOne.charAt(i);
        }
        return result;
    }
}