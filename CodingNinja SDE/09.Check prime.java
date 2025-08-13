public class Solution {
    public static String isPrime(int num) {
        if (num <= 1) return "NO";
        int limit = (int) Math.sqrt(num);
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                return "NO"; // divisible => not prime
            }
        }
        return "YES"; // no divisors found => prime
    }
}
