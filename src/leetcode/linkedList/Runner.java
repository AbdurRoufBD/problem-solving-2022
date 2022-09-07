package leetcode.linkedList;

public class Runner {
	public static void main(String[] args) {
		ListNode obj10 = new ListNode(10);
		ListNode obj20 = new ListNode(20);
		ListNode obj30 = new ListNode(30);
		ListNode obj40 = new ListNode(40);
		ListNode obj50 = new ListNode(50);
		
		ListNode obj11 = new ListNode(15);
		ListNode obj21 = new ListNode(20);
		ListNode obj31 = new ListNode(29);
		ListNode obj41 = new ListNode(40);
		ListNode obj51 = new ListNode(43);
		
		ListNode head1 = obj10;
		obj10.next = obj20;
		obj20.next = obj30;
		obj30.next = obj40;
		obj40.next = obj50;
		
		ListNode head2 = obj11;
		obj11.next = obj21;
		obj21.next = obj31;
		obj31.next = obj41;
		obj41.next = obj51;
		
		new Solution().mergeTwoLists(null, head2);
		
	}
}
