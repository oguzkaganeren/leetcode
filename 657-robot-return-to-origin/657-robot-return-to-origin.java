class Solution {
    public boolean judgeCircle(String moves) {
        int posx=0;
        int posy=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R'){
                posy++;
            }else if(moves.charAt(i)=='L'){
                posy--;
            }else if(moves.charAt(i)=='U'){
                posx++;
            }else{
                posx--;
            }
        }
        return posx==0 && posy==0;
    }
}