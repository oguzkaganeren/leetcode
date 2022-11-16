class Solution {
    public int countPoints(String rings) {
        String[] rods=new String[10];
        int counter=0;
        for(int i=0;i<rings.length();i+=2){
            int rodNumber=Character.getNumericValue(rings.charAt(i+1));
            String color=rings.substring(i,i+1);
            if(rods[rodNumber]==null) rods[rodNumber]=color;
            else if( rods[rodNumber].indexOf(color)==-1){
                rods[rodNumber]+=color;
            }
        }
        for(int i=0;i<10;i++){
            if(rods[i]!=null&&rods[i].length()>2) counter++;
        }
        return counter;
    }
}