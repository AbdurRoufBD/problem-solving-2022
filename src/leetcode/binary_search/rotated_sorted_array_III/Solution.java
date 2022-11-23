package leetcode.binary_search.rotated_sorted_array_III;

public class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] >= nums[left]) {
                int midNext = (mid + 1) % nums.length;
                if(nums[midNext] < nums[mid]) {
                    return nums[midNext];
                } if(nums[midNext] == nums[mid]) {
                    int midBefore = (nums.length + mid - 1) % nums.length;
                    if(midBefore > left && nums[midBefore] < nums[mid]) {
                        return nums[midBefore];
                    } else {
                        right = mid - 1;
                    }
                } else {
                    left = mid + 1;
                }
            } else {
                right = mid - 1;
            }
        }
        return left < nums.length ? nums[left] : nums[0];
    }
}
