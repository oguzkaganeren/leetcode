class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result=0;
        for(int i=0; i<operations.length; i++)
        {
            switch(operations[i]){
                 case "--X":
                case "X--":
            result--;
        break;
        case "++X":
                case "X++":
            result++;
        break;
            }
            
        }
        return result;
        
    }
}