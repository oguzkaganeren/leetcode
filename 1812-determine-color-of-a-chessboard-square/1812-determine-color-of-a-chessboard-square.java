class Solution {
    public boolean squareIsWhite(String coordinates) {
        char[] charArr=coordinates.toCharArray();
        return (charArr[0]+charArr[1])%2!=0;
    }
}