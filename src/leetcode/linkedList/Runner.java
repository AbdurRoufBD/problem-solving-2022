package leetcode.linkedList;

public class Runner {
	public static void main(String[] args) {
		ListNode obj10 = new ListNode(10);
		ListNode obj20 = new ListNode(20);
		ListNode obj30 = new ListNode(30);
		ListNode obj40 = new ListNode(40);
		
		ListNode head = obj10;
//		obj10.next = obj20;
//		obj20.next = obj30;
//		obj30.next = obj40;
		
		new Solution().reverseList(head);
		
	}
}
