class Solution {
    public List<String> cellsInRange(String s) {
        String[] rowCol=s.split(":");
        int startWord=(int)rowCol[0].charAt(0);
        int startNum=Character.getNumericValue(rowCol[0].charAt(1));
        int endWord=(int)rowCol[1].charAt(0);
        int endNum=Character.getNumericValue(rowCol[1].charAt(1));
        List<String> list=new ArrayList<>();
        for(int i=startWord;i<=endWord;i++){
            for(int j=startNum;j<=endNum;j++){
                list.add((char)i + String.valueOf(j));
            }
        }
        return list;
    }
}