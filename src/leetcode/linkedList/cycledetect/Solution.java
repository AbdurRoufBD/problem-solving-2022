package leetcode.linkedList.cycledetect;

public class Solution {
	//https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1212/
    public boolean hasCycle(ListNode head) {
    	if(head == null) {
    		return false;
    	}
        
    	ListNode slowPointer = head;
    	ListNode fastPointer = head;
    	while(fastPointer != null) {
    		if(fastPointer.next != null) {
    			fastPointer = fastPointer.next.next;
    		} else {
    			return false;
    		}
    		slowPointer = slowPointer.next;
    		if(fastPointer == slowPointer) {
    			return true;
    		}
    	}
    	
    	return false;
    }
}
