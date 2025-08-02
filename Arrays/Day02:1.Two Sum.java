class Solution {
    public int[] twoSum(int[] nums, int target) {
        // optimize using HAshmap
       Map<Integer,Integer>  map = new HashMap<>();
       int n = nums.length;
       for(int i=0;i<n;i++){
        int first = nums[i];
        int sec = target-first;
        if(map.containsKey(sec)){
            return new int[] {map.get(sec),i};
        }
        map.put(first,i);
       }
       return new int[] {};
    }
}


// 2 two pointers
