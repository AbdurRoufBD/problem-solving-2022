package leetcode.heap.kth_largest_element_in_a_stream;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class KthLargest {
    private PriorityQueue<Integer> maxHeap;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : nums) {
            maxHeap.add(n);
        }
    }

    public int add(int val) {
        maxHeap.add(val);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < k - 1; i++) {
            stack.push(maxHeap.poll());
        }
        int kthElement = maxHeap.peek();
        while(!stack.isEmpty()) {
            maxHeap.add(stack.pop());
        }
        return kthElement;
    }
}
