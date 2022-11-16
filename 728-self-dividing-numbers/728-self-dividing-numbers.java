class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            char[] digits=(""+i).toCharArray();
            boolean isSD=true;
            for(int j=0;j<digits.length;j++){
                if(digits[j]=='0' ||i%Character.getNumericValue(digits[j])!=0){
                    isSD=false;
                    break;
                }
            }
            if(isSD){
                list.add(i);
            }
        }
        return list;
    }
}