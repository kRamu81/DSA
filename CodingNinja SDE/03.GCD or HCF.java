public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        if(m==0) return n;
        return calcGCD(m,n%m);
    }
}