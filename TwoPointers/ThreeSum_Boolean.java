import java.util.*;
public class SumOfThree{
    public static boolean findSumOfThree(int[] nums, int target) {

        // Write your code here
        Arrays.sort(nums); // O(NlogN)
        int current = 0;
        while(current<nums.length-1){
            int low = current+1;
            int high = nums.length-1;
            while(current<nums.length-1 && low<high){
                int sum = nums[current] + nums[low] + nums[high];
                if(sum == target) return true;
                else if(sum<target) low++;
                else high--;
            }
            current++;
        }

        return false;
    }
}