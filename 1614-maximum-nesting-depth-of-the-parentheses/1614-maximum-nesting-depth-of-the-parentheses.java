class Solution {
    public int maxDepth(String s) {
        int len=s.length();
        int counter=0;
        int max=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='('){
                counter++;
            }
            else if(s.charAt(i)==')'){
                counter--;
            }
            if(max<counter) max=counter;
        }
        return max;
    }
}