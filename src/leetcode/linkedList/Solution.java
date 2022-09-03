package leetcode.linkedList;

public class Solution {
	public ListNode reverseList(ListNode head) {
		//https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1205/
		if(head==null) {
			return head;
		}
		ListNode blackNode = head;
		ListNode itrNode = head.next;
		while(itrNode != null ) {
			blackNode.next = itrNode.next;
			itrNode.next = head;
			head = itrNode;
			itrNode = blackNode.next;
		}
		return head;
	}
	
	
	public ListNode removeElements(ListNode head, int val) {
		//https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1207/
        ListNode preHeadNode = new ListNode(999);
        preHeadNode.next = head;
        
        ListNode curNode = head;
        ListNode prevNode = preHeadNode;
        
        while(curNode!=null) {
        	if(curNode.val == val) {
        		prevNode.next = curNode.next;
        	} else {
        		prevNode = prevNode.next;
        	}
        	curNode = curNode.next;
        }
        
        return preHeadNode.next;
    }
}
