package leetcode.binary_search.search_for_a_range;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int left = 0;
        int right = nums.length - 1;

        int minIdx = -1;
        int maxIdx = -1;


        while(left + 1 < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target && minIdx == -1) {
                if(minIdx == -1 && maxIdx == -1) {
                    minIdx = mid;
                    maxIdx = mid;
                } else {
                    int a = minIdx;
                    int b = maxIdx;
                    int c = mid;

                    minIdx = Math.min(a, Math.min(b,c));
                    maxIdx = Math.max(a, Math.max(b,c));
                }
            } else if(nums[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }


        if(nums[left] == target) {
            int a = minIdx;
            int b = maxIdx;
            int c = left;

            minIdx = Math.min(a, Math.min(b,c));
            maxIdx = Math.max(a, Math.max(b,c));
        }

        if(nums[right] == target) {
            int a = minIdx;
            int b = maxIdx;
            int c = right;

            minIdx = Math.min(a, Math.min(b,c));
            maxIdx = Math.max(a, Math.max(b,c));
        }

        return new int[] {minIdx, maxIdx};
    }
}
