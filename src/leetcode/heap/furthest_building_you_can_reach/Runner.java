package leetcode.heap.furthest_building_you_can_reach;

public class Runner {
    public static void main(String[] args) {
        int[] heights = {4,12,2,7,3,18,20,3,19};
        int bricks = 10, ladders = 2;
//        int[] heights = {1, 2};
//        int bricks = 0, ladders = 0;
        new Solution().furthestBuilding(heights, bricks, ladders);
    }
}
