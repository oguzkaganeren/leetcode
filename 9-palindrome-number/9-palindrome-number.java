class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String inputStr=String.valueOf(x);
        for(int i=0;i<inputStr.length()/2;i++)
        {
            if(inputStr.charAt(i)!=inputStr.charAt(inputStr.length()-(i+1))){
                return false;
            }
        }
        return true;
    }
}