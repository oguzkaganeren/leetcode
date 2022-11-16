class Solution {
    public String reverseWords(String s) {
        String[] words= s.split(" ");
        String ret="";
        for(int i=0;i<words.length;i++){
            String rever=new StringBuffer(words[i]).reverse().toString();
            ret+=rever+" ";
        }
        return ret.substring(0,ret.length()-1);
    }
}