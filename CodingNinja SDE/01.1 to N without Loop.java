public class Solution {
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        fillArray(arr, 1);
        return arr;
    }

    private static void fillArray(int[] arr, int num) {
        if (num > arr.length) return; // Base case
        arr[num - 1] = num;
        fillArray(arr, num + 1); // Recursive call
    }
}
