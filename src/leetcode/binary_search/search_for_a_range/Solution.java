package leetcode.binary_search.search_for_a_range;

import java.util.Objects;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(Objects.isNull(nums) || nums.length == 0) {
            return new int[] {-1, -1};
        }

        int left = 0;
        int right = nums.length;
        int startIdx = -1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            int midRight = (mid + 1) % nums.length;
            if(nums[mid] != target && nums[midRight] == target) {
                startIdx = midRight;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int endIdx = -1;
        left = 0;
        right = nums.length;
        while(left < right) {
            int mid = left + (right - left) / 2;
            int midLeft = (mid - 1 + nums.length) % nums.length;
            if(nums[mid] != target && nums[midLeft] == target) {
                endIdx = midLeft;
                break;
            } else if (nums[midLeft] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        return new int[]{startIdx, endIdx};
    }
}
