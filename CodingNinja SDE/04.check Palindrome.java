public class Solution {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        if(str == null) return false;
        int left=0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
