class Solution {
    public String interpret(String command) {
        int index=0;
        String returnVal="";
        while(index<command.length()){
            if(command.charAt(index)=='G'){
                returnVal+="G";
                index++;
            }else if(command.charAt(index)=='('&&command.charAt(index+1)=='a'){
                returnVal+="al";
                index+=4;
            }else{
                returnVal+="o";
                index+=2;
            }
        }
        return returnVal;
    }
}