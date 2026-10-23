class Solution {
    public int hammingWeight(int n) {
        int count =0;
        while(n>0){
            
               count+=(n&1);
            
            // # Shift right to process the next bit
            n>>>=1;
        }
        return count;
    }
}