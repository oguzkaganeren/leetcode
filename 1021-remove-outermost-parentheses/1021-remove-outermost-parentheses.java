class Solution {
    public String removeOuterParentheses(String s) {
        int counter=0;
        int start=0;
        String ret="";
        for(int i=0;i<s.length();i++){
            counter++;
            if(s.charAt(i)==')') counter-=2;
            if(counter==0){
                ret+=s.substring(start+1,i);
                start=i+1;
            }
        }
        return ret;
    }
}