package sllist;

public class Driver {

	public static void main(String[] args) {
		SLList list = new SLList();
		list.head = new Node(5);
		list.head.next = new Node(10);
		list.head.next.next = new Node(15);
		list.head.next.next.next = new Node(20);
		list.head.next.next.next.next = new Node(25);
		list.head.next.next.next.next.next = new Node(30);

		SLList list1 = new SLList();
		list1.head = new Node(4);
		list1.head.next = new Node(8);
		list1.head.next.next = new Node(12);
		list1.head.next.next.next = new Node(16);
		list1.head.next.next.next.next = list.head.next.next.next;

		// System.out.println(list.detectLoop());
		// System.out.println(list.detectLoopHash());
		// list.findNth(4);
		// list.addLoop(99);
		// System.out.println(list.detectLoop());
		// System.out.println(list.detectLoopHash());
		list.print();
		//list1.print();

		// Looping
		// list.head.next.next.next.next.next.next = list.head.next.next;
		// System.out.println("~~~~~~~~~");
		// System.out.println(list.detectLoopHashAndRemove());
		// System.out.println("Loop Start : "+list.findLoopStart());
		// System.out.println("Loop Length: "+list.findLoopLength());
		// list.print();

		// list.addSorted(1);
		// list.addSorted(101);
		// list.addSorted(41);
		// list.print();
		// System.out.println("~~~~~~~~~");
		// list.reverseList();
		// list.print();

		//SLList.findIntersection(list, list1);
		System.out.println("~~~~~~~~~");
		list.rotate(list.head,7);

	}
}
