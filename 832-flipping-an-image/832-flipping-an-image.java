class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            int[] forFlip=new int[image[i].length];
            for(int j=0;j<image[i].length;j++)
            {
                forFlip[j]=image[i][(image.length-1)-j];
                if(forFlip[j]==0){
                    forFlip[j]=1;
                }else{
                    forFlip[j]=0;
                }
            }
            image[i]=forFlip;
        }
        return image;
    }
}