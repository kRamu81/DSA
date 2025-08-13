public class Solution {
    public static int[] generateFibonacciNumbers(int n) {
        int[] a = new int[n];

        if (n > 0) a[0] = 0;
        if (n > 1) a[1] = 1;

        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }

        return a;
    }
}
