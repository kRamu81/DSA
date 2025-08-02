class Solution {
    public int majorityElement(int[] nums) {
        //using Moris mortin algorithm 
        int n = nums.length;
        int freq = 0, ans = 0;
        for(int i=0;i<n;i++){
            if(freq == 0){
                ans = nums[i];
            }
            if(ans == nums[i]) freq++;
            else freq--;
        }
        return ans;
    }
}


// 2 Method o(nlogn)
class Solution {
    public int majorityElement(int[] nums) {
        // using optimized soln O(nlogn)
        Arrays.sort(nums);
        int n = nums.length;
        int freq = 1, ans = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                freq++;
            }else{
                freq = 1;
                ans= nums[i];
            }
            if(freq>n/2){
                return ans;
            }
        } return ans;
    }
}

//3.Brute force Approach  o(n^2)
class Solution {
    public int majorityElement(int[] nums) {
        //using brute force
        int n = nums.length;
        for(int val : nums){
            int freq = 0;
            for(int ele : nums){
                if(val == ele){
                    freq++;
                }
            }
            if(freq > n/2){
               return val; 
            }
        }
        return -1;
        
    }
}
