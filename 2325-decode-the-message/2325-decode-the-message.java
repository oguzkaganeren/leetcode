class Solution {
    public String decodeMessage(String key, String message) {
        String res="";
        key=key.replace(" ","");
        HashMap<Character,Character> map=new HashMap<>();
        char start='a';
        for(int i=0;i<key.length();i++)
        {
            if(!map.containsKey(key.charAt(i)))
                map.put(key.charAt(i),start++);
        }
        
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                res+=" ";
            }else{
                res+= map.get(message.charAt(i));
            }
        }
        return res;
    }
}