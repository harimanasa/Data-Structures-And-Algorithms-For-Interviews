class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) return null;
        Map<Integer, Integer> pairMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target-nums[i];
            if(pairMap.containsKey(complement)){
                return new int[]{i, pairMap.get(complement)};
            } else {
                pairMap.put(nums[i], i);
            }
        }
        return new int[2];
    }
}

/**
Can optimize:

If we know if all values are positive, no need to process the values that are greater than the target

 */