class Solution {
    public boolean halvesAreAlike(String s) {
        char[] cArr=s.toCharArray();
        int len=cArr.length;
        int halfOne=0;
        int halfTwo=0;
        for(int i=0; i<len/2;i++){
            switch(cArr[i]){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    halfOne++;
                break;    
            }
            
            
            switch(cArr[len-i-1]){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    halfTwo++;
                break;
            }
            
        }
        return  halfOne==halfTwo;
    }
}