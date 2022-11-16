class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter=0;
       
        for(int i=0; i<words.length;i++){
            
           for(int j=0;j<allowed.length();j++){
               words[i]= words[i].replace(String.valueOf(allowed.charAt(j)),"");
           } 
            if(words[i].length()==0) counter++;
            
        }
        return counter;
    }
}