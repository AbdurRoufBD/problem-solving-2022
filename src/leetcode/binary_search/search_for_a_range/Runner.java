package leetcode.binary_search.search_for_a_range;

public class Runner {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6};
        int target = 4;
        new Solution().searchRange(nums, target);
    }
}
