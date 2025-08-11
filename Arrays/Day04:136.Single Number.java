class Solution {
    public int singleNumber(int[] nums) {
        int n =0;//singleno
       Set<Integer> set = new HashSet<>();
       for(int num : nums){
        if(!set.add(num)){ //not contains add && contains then remove the element and finally non repeated elemnet is present
            set.remove(num);//removing repested element
        }
       } 
       for(int i : set){//using for each loop to return the set value
        n = i;
       }
       return n;
    }
}

// 2 approach using xor
class Solution {
    public int singleNumber(int[] nums) {
        int res =0;
        for(int i=0;i<nums.length;i++){
            res = res^nums[i];
        }
        return res;
    }
}
