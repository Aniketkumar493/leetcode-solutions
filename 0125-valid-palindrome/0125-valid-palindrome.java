class Solution {
    public boolean isPalindrome(String s) {
        String sh = s.toLowerCase();
        String ans = "";
        for(int i=0;i<sh.length();i++){
            char ch = sh.charAt(i);
            if(ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                ans = ans + ch;
            }
        }
        int left = 0;
        int right = ans.length()-1;
        while(left<right){
            if(ans.charAt(left)!=ans.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
        
    }
}