package leetcode.heap.k_closest_points_to_origin;

import java.util.PriorityQueue;
//https://leetcode.com/explore/learn/card/heap/646/practices/4088/
class DistPointPair implements Comparable<DistPointPair> {
    public int[] point;
    public int dist;

    public DistPointPair(int[] point) {
        this.point = point;
        this.dist = getDistanceFromOrigin();
    }

    private int getDistanceFromOrigin() {
        return point[0] * point[0] + point[1] * point[1];
    }

    @Override
    public int compareTo(DistPointPair o) {
        return this.dist - o.dist;
    }
}
public class Solution {


    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<DistPointPair> minHeap = new PriorityQueue<>();
        for(int[] point : points) {
            minHeap.add(new DistPointPair(point));
        }

        int[][] ans = new int[k][2];
        for(int i = 0; i < k; i++) {
            ans[i] = minHeap.poll().point;
        }

        return ans;
    }
}
