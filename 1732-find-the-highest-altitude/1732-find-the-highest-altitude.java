class Solution {
    public int largestAltitude(int[] gain) {
        int[] temp=new int[gain.length+1];
        int max=0;
        temp[0]=0;
        for(int i=0;i<gain.length;i++)
        {
            temp[i+1]=temp[i]+gain[i];
            if(max<temp[i+1]){
                max=temp[i+1];
            }
        }
        
        return max;
    }
}