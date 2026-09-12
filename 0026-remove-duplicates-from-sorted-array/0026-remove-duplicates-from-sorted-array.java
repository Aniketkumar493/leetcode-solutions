class Solution {
    public int removeDuplicates(int[] nums) {
// Brute force approch
        HashSet<Integer> seen = new HashSet<>();
        int index = 0;
        for(int num: nums){
            if(!seen.contains(num)){
                seen.add(num);

                nums[index]=num;

                index++;
            }
        }
        return index;
        
    }
}