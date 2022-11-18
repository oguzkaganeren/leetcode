class Solution {
    public String freqAlphabets(String s) {
        char init='a';
        String ret="";
        int len=s.length();
        for(int i=0;i<len; i++)
        {
            if(i+2<len && s.charAt(i+2)=='#'){
                ret+=(char)(init+Character.getNumericValue(s.charAt(i))*10+Character.getNumericValue(s.charAt(i+1))-1);
                i=i+2;
            }else{
                ret+=(char)(init+Character.getNumericValue(s.charAt(i))-1);
            }
            
        }
        return ret;
    }
}