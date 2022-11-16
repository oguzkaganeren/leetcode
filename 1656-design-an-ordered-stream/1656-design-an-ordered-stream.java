class OrderedStream {
    String[] theArr;
    int pointer=0;
    public OrderedStream(int n) {
        theArr=new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        theArr[idKey-1]=value;
        ArrayList<String> theList = new ArrayList<>();
         while (pointer < theArr.length && theArr[pointer] != null) {
            theList.add(theArr[pointer]);
            pointer++;
        }
        
        return theList;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */