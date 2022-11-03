package leetcode.binary_search.search_in_rotated_sorted_array;

public class Solution {
    private int findPivot(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        do {
            mid = left + (right - left) / 2 ;
            if(mid + 1 < nums.length && nums[mid] > nums[mid + 1]) {
                break;
            } else if(nums[left] <= nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        } while (left <= right);
        return (mid + 1) % nums.length;
    }
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        return pivot;
    }
}
