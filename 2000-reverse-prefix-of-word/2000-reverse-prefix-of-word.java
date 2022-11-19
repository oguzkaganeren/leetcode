class Solution {
    public String reversePrefix(String word, char ch) {
        int charindex=word.indexOf(ch);
        if(charindex==-1) return word;
        StringBuilder str=new StringBuilder();
        str.append(word.substring(0,charindex+1));
        str.reverse();
        str.append(word.substring(charindex+1,word.length()));
        return str.toString();
    }
}