class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWord=0;
        for(int i=0; i<sentences.length; i++)
        {
            String[] splitted=sentences[i].split(" ");
            if(maxWord<splitted.length){
                maxWord=splitted.length;
            }
        }
        return maxWord;
    }
}