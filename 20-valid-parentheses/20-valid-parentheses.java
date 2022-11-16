class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0||s.length()==0||s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']') return false;
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> brackets = new HashMap<Character, Character>();
        brackets.put('(',')');
        brackets.put('{','}');
        brackets.put('[',']');
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                if(stack.size()>0){
                  char popup=stack.pop();
                if(brackets.get(popup)!=s.charAt(i)){
                    return false;
                }  
                }else{
                    return false;
                }
                
            }
        }
        if(stack.size()>0){
            return false;
        }
        return true;
    }
}