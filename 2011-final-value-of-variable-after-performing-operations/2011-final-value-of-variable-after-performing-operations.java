class Solution {
    public int finalValueAfterOperations(String[] op) {
        int count =0;
        for(int i =0; i<op.length;i++){
            if((op[i]).equals("--X") || (op[i]).equals ("X--")){
                count--;
            }
            else{
                count++;
            }
        }
        return count;
    }
}