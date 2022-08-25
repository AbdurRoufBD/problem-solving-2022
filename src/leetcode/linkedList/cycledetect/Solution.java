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
    
    public ListNode detectCycle(ListNode head) {
    	//https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1214/
    	int maxValue = 10000 * 10000;
    	if(head == null) {
    		return null;
    	}
        
    	
    	ListNode pointer = head;
    	ListNode finalNode = null;
    	while(pointer != null) {
    		int value = pointer.val;
    		if(value > 100000) {
    			pointer.val = pointer.val - maxValue;
    			finalNode = pointer;
    			break;
    		}
    		
    		pointer = pointer.next;
    	}
    	
    	if(pointer == null) {
    		return null;
    	} else {
    		return finalNode;
    	}
    }
}
