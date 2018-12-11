package singleLinkedList;

public class TestSingleLinkedList {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		SingleLinkedList list1 = new SingleLinkedList();
		SingleLinkedList list2 = new SingleLinkedList();
		SingleLinkedList sort1 = new SingleLinkedList();
		SingleLinkedList sort2 = new SingleLinkedList();

		list.insertAtEnd(5);
		list.insertAtEnd(25);
		list.insertAtEnd(3);
		list.insertAtBeginning(9);
		list.insertAtBeginning(90);
		// System.out.println("List is : ");
		// list.display();
		// System.out.println("~~~~~~~~~~~~~~~~~~");
		// System.out.println(list.findloop());
		// System.out.println(list.findLoopHash());
		// int n = 3;
		System.out.println("~~~~~~~~~~~~~~~~~~");
		// list.insertLoop(999);
		list.insertAtBeginning(78);
		// list.display();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		// System.out.println(list.findloop());
		// System.out.println(list.findLoopHash());
		// System.out.println(list.head.data);

		list.reverseList();
		// list.display();
		System.out.println("end");
		// list.display();
		// list.hashNth(3);
		// System.out.println("Finding the Element "+n+" from the last");
		// list.findN(head, n);
		// System.out.println(ans);
		// list.display();
		// list.insertAtNth(45, 8);
		// list.insertAtNth(7, 0);
		// System.out.println("~~~~~~~~~~~~~~~~~~");
		// list.display();
		//
		// list.deleteHead();
		// System.out.println("~~~~~~~~~~~~~~~~~~");
		// list.display();
		//
		// list.deleteHead();
		// System.out.println("~~~~~~~~~~~~~~~~~~");
		// list.display();
		//
		// list.deleteNthNode(3);
		// System.out.println("~~~~~~~~~~~~~~~~~~");
		// list.display();
		//
		// list.deleteNthNode(1);
		// System.out.println("~~~~~~~~~~~~~~~~~~");hea
		// list.display();

		list.reverseListRecursive();
		// list.display();

		list1.insertAtEnd(1);
		list1.insertAtEnd(2);
		list1.insertAtEnd(3);
		list1.insertAtEnd(4);

		// list 1 : 78 90 9 5 25 3
		// list 2 : 1 2 3 4 (Linked at 5)
		SingleLinkedList.createIntersection(list, list1);

		// System.out.println("~~~~~~~~~~~~~~~~~~");
		list.display();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		list1.display();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		// SingleLinkedList.findIntersection(list, list1);
		// SingleLinkedList.findIntersectionHash(list, list1);
		// SingleLinkedList.findIntersectionStack(list, list1);
		SingleLinkedList.findIntersectionOptimal(list, list1);

		SingleLinkedList.findMiddle(list);
		SingleLinkedList.findMiddleHash(list);
		SingleLinkedList.findMiddleOneScan(list);
		System.out.println("~~~~~~~~~~~~~~~~~~");
		list.printReverse(list.head);
		System.out.println("~~~~~~~~~~~~~~~~~~");
		SingleLinkedList.findOddEven(list1);
		System.out.println("~~~~~~~~~~~~~~~~~~");
		sort1.insertAtEnd(1);
		sort1.insertAtEnd(3);
		sort1.insertAtEnd(5);
		sort1.insertAtEnd(7);

		sort2.insertAtEnd(2);
		sort2.insertAtEnd(4);
		sort2.insertAtEnd(6);
		sort2.insertAtEnd(8);
		sort1.display();
		System.out.println();
		sort2.display();
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~");
		SingleLinkedList.mergeSortList(sort1, sort2);
		
		list.printReverse(SingleLinkedList.mergeSortListRecurse(sort1.head, sort2.head));
		System.out.println("~~~~~~~~~~~~~~~~~~");
		list.display();
		System.out.println();
		list.reverseInPair();
		list.display();
	}
	



}
