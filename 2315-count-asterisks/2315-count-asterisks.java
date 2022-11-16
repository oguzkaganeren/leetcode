class Solution {
    public int countAsterisks(String s) {
        int row=0;
        int counter=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|' && row==0) row++;
            else if(s.charAt(i)=='|' && row==1) row--;
            else if(s.charAt(i)=='*' && row==0) counter++;
        }
        return counter;
    }
}