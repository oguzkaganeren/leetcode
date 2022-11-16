class Solution {
    public int balancedStringSplit(String s) {
        int counter=0;
        int balanced=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='L')
                balanced++;
            else
                balanced--;
            if(balanced==0)
            {
                counter++;
            }
        }
        return counter;
        
    }
}