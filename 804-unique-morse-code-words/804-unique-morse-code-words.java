class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> morseCodeWordList=new HashSet<>();
        String[] charCodes= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<words.length;i++){
            String morseCodeWord="";
            for(int j=0;j<words[i].length();j++)
            {
                char wChar=words[i].charAt(j);
                int charCode=(int)wChar;
                morseCodeWord+=charCodes[charCode-97];
            }
            morseCodeWordList.add(morseCodeWord);
        }
        return morseCodeWordList.size();
    }
}