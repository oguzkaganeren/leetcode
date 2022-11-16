class Solution {
    public String sortSentence(String s) {
        String[] splitted=s.split(" ");
        String[] resArr=new String[splitted.length];
        for(int i=0;i<splitted.length;i++){
            int wordLen=splitted[i].length();
            int wordPos=Integer.valueOf(splitted[i].substring(wordLen-1,wordLen)); 
            resArr[wordPos-1]=splitted[i].substring(0,wordLen-1);
        }
        return String.join(" ",resArr);
    }
}