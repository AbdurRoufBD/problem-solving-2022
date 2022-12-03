package leetcode.binary_search.rotated_sorted_array_III;

public class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
        	int mid = left + (right - left) / 2;
        	if(nums[mid] < nums[right]) {
        		right = mid;
        	} else if(nums[mid] > nums[right]) {
        		left = mid + 1;
        	} else {
        		right--;
        	}
        }
        return nums[left];
    }
}
