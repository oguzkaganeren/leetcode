class Solution {
    public int percentageLetter(String s, char letter) {
        int totalSize=s.length();
        s=s.replace(String.valueOf(letter),"");
        int withoutLetter=s.length();
        int letterCount=totalSize-withoutLetter;
        return  (int)(((double)letterCount/(double)totalSize)*100);
    }
}