import java.util.ArrayList;

public class Solution {
    public static int findPeakElement(ArrayList<Integer> arr) {
        int start = 0;
        int end = arr.size() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) > arr.get(mid + 1)) {
                // Peak lies on left side (including mid)
                end = mid;
            } else {
                // Peak lies on right side (excluding mid)
                start = mid + 1;
            }
        }

        // start == end is the peak index
        return start;
    }
}


/*import java.util.ArrayList;
public class Solution {
    public static int findPeakElement(ArrayList<Integer> arr) {
        // Write your code here.
        int n = arr.size();
        if(n==1) return 0;
        if(arr.get(0)>arr.get(1)) return 0;
        if(arr.get(n-1)>arr.get(n-2)) return n-1;
        for(int i=1;i<n;i++){
            if(arr.get(i)>arr.get(i-1) && arr.get(i)>arr.get(i+1)){
                return i;
            }
        }
        return -1;
    }
};
*/