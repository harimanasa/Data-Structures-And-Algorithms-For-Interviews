class Solution {
    public int majorityElement(int[] nums) {
        /** Intuition: If I use a counter or a hashmap, it would be O(N) space
         and O(N) time

         If the array is sorted, I could return (O(N/2)+1) element.
         But here, it is not sorted.

         So, I would sort it now, trade-off O(NlogN) time and O(1) space
         */

        //base case:
        if(nums == null || nums.length==0) return -1;
        if(nums.length == 1) return 1;

        Arrays.sort(nums); //O(NlogN) time and in-place sort O(1)

        return nums[nums.length/2];

    }
}