class Solution {
    public String destCity(List<List<String>> paths) {
        String last="";
        HashMap<String,String> doub=new HashMap<>();
        for(List<String> el:paths){
             doub.put(el.get(0),el.get(1));
        }
        for(String entry:doub.values()){
            if(!doub.containsKey(entry)){
                return entry;
            }
        }
        return last;
    }
}