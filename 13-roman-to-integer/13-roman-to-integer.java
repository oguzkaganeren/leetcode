class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        int total=0;
        for(int i=0; i<s.length();i++)
        {
            char romanCh=s.charAt(i);
            if(i+1<s.length()){
                char secondCh=s.charAt(i+1);
                if(secondCh!='I'){
                    if((romanCh=='I' && (secondCh=='V'||secondCh=='X'))
                       ||(romanCh=='X'&&(secondCh=='L'||secondCh=='C'))
                       ||romanCh=='C'&&(secondCh=='D'||secondCh=='M')){
                        total+=roman.get(secondCh)-roman.get(romanCh);
                        i++;
                    }else{
                        total+=roman.get(romanCh);
                    }
                }else{
                    total+=roman.get(romanCh);
                }
            }else{
                total+=roman.get(romanCh);
            }
            
        }
        return total;
    }
}