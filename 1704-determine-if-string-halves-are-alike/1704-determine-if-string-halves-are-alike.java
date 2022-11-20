class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        char[] cArr=s.toCharArray();
        int len=cArr.length;
        int halfOne=0;
        int halfTwo=0;
        for(int i=0; i<len/2;i++){
            if(vowels.indexOf(cArr[i])!=-1)
                halfOne++;
            
            if(vowels.indexOf(cArr[len-i-1])!=-1)
                halfTwo++;
            
        }
        return  halfOne==halfTwo;
    }
}