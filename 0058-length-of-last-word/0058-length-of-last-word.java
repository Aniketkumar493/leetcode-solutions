class Solution {
    public int lengthOfLastWord(String s) {
        if(s.trim().isEmpty()){
            return 0;
        }

        String[] sh = s.trim().split("\\s+");
        int count = sh[sh.length-1].length();
        return count;
        
    }
}