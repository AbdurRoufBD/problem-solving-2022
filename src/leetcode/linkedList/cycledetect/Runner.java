package leetcode.linkedList.cycledetect;

public class Runner {
	public static void main(String[] args) {
		ListNode head = null;
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		
		head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		new Solution().removeNthFromEnd(head, 2);
	}
}
