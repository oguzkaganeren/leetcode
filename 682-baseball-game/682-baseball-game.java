class Solution {
    public int calPoints(String[] operations) {
        int len = operations.length;
        int[] records=new int[len];
        int pointer=-1;
        int sum=0;
        for(int i=0;i<len;i++){
            pointer++;
            if(operations[i].equals("+")){
                records[pointer]=records[pointer-1]+records[pointer-2];
            }else if(operations[i].equals("D")){
                records[pointer]=records[pointer-1]*2;
            }else if(operations[i].equals("C")){
                records[--pointer]=0;
                pointer--;
            }else{
                records[pointer]=Integer.valueOf(operations[i]);
            }
        }
        for(int i=0;i<len;i++){
            sum+=records[i];
        }
        return sum;
    }
}