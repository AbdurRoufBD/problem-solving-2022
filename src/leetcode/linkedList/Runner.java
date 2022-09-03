package leetcode.linkedList;

public class Runner {
	public static void main(String[] args) {
		ListNode obj10 = new ListNode(10);
		ListNode obj20 = new ListNode(20);
		ListNode obj30 = new ListNode(30);
		ListNode obj40 = new ListNode(40);
		ListNode obj50 = new ListNode(50);
		
		ListNode head = null;
		obj10.next = obj20;
//		obj20.next = obj30;
//		obj30.next = obj40;
//		obj40.next = obj50;
		
		new Solution().oddEvenList(head);
		
	}
}
