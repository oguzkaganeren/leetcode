class Solution {
    public String toLowerCase(String s) {
        String ret="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>64&&s.charAt(i)<91)
                ret+=(char)(s.charAt(i)+32);
            else
                ret+=s.charAt(i);
        }
        return ret;
    }
}