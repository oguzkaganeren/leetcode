class Solution {
    public String replaceDigits(String s) {
        String ret="";
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>47 && s.charAt(i)<58){
                ret+= (char) (Character.getNumericValue(s.charAt(i))+s.charAt(i-1));
            }else{
                ret+=s.substring(i,i+1);
            }
        }
        return ret;
    }
}