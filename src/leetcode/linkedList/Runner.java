package leetcode.linkedList;

public class Runner {
	public static void main(String[] args) {
		MyLinkedList obj = new MyLinkedList();
		obj.deleteAtIndex(0);
		
		obj.addAtIndex(0, 10);
		obj.printList();


		obj.addAtIndex(0, 20);
		obj.printList();


		obj.addAtIndex(1, 30);
		obj.printList();


		obj.get(0);
		obj.printList();
	}
}
