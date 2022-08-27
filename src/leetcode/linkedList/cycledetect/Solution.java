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
    		} else {
    			pointer.val = pointer.val + maxValue;
    		}
    		
    		pointer = pointer.next;
    	}
    	
    	if(pointer == null) {
    		return null;
    	} else {
    		return finalNode;
    	}
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	//https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1215/
        ListNode intercpetionNode = null;
        //mark all node to negative
        ListNode parserNode = headA;
        while(parserNode!=null) {
        	parserNode.val = parserNode.val * (-1);
        	parserNode = parserNode.next;
        }
        
        parserNode = headB;
        //search negative node from second list
        while(parserNode != null) {
        	if(parserNode.val < 0) {
        		intercpetionNode = parserNode;
        		break;
        	}
            parserNode = parserNode.next;
        }
        
        //mark all node to positive
        parserNode = headA;
        while(parserNode!=null) {
        	parserNode.val = parserNode.val * (-1);
        	parserNode = parserNode.next;
        }
    	return intercpetionNode;
    }
}
