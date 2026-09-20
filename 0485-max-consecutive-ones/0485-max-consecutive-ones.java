class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int Maxcount =0;
        int count =0;
        for(int num: nums){
            if(num == 1){
                count++;
            }
            else{
                count=0;
            }

            Maxcount = Math.max(Maxcount, count);
        }
        return Maxcount;
        
    }
}