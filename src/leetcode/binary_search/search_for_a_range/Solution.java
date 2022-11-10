package leetcode.binary_search.search_for_a_range;

import java.util.Objects;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }
        int startIdx = -1;
        int endIdx = -1;

        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(target == nums[mid]) {
                int midLeft = mid - 1;
                if(midLeft >= 0 && target != nums[midLeft] || midLeft < 0) {
                    startIdx = mid;
                    break;
                } else {
                    right = mid;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


        left = 0;
        right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(target == nums[mid]) {
                int midRight = mid + 1;
                if(midRight < nums.length && target != nums[midRight] || midRight >= nums.length) {
                    endIdx = mid;
                    break;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{startIdx, endIdx};
    }
}
