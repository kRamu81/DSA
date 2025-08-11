class Solution {
    public int maxSubArray(int[] nums) {
        // using kadens Algorithm
        int n = nums.length;
        int sum =0;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(sum > max) max=sum;
            if(sum<0) sum =0;
        }
        return max;
    }
}


// bruteforce approach 




class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int res = arr[0];
        int maxi = arr[0];
        for(int i=1;i<arr.length;i++){
            maxi = Math.max(maxi+arr[i] ,arr[i]);
            
            res = Math.max(res,maxi);
            
        }
        return res;
    }
}
