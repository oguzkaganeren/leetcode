class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result=0;
        for(int i=0;i<items.size();i++)
        {
            List<String> element=items.get(i);
            String name="";
            if(ruleKey.equals("type")){
                name=element.get(0);
            }else if(ruleKey.equals("color")){
                name=element.get(1);
            }else{
                name=element.get(2);
            }
            if(name.equals(ruleValue)){
                result++;
            }
        }
        return result;
    }
}