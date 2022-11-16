class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> hset=new HashSet<>();
        char ret=' ';
        for(int i=0;i<s.length();i++){
            if(hset.contains(s.charAt(i))){
                ret=s.charAt(i);
                break;
            }
            hset.add(s.charAt(i));
        }
        return ret;
    }
}