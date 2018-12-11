package singleLinkedList;

import java.util.Hashtable;

public class Single {

	Node head;
	int size;

	// Default Constructor
	public Single() {
		this.head = null;
	}

	// Solution 1 : Recursion
	static int cnt = 0;
	public int findNthRecursion(Node startNode, int n)
	{	
		
		if(startNode == null)
			return -1;
		//Traverse to the END of the List
		int data = findNthRecursion(startNode.next, n);
		cnt++;
		
		if(cnt == n)
		{
			return startNode.data;
		}
	
		return 0;
	}
	
	// Solution 2 : HashTable
	public void findNthHash(int n) {
		Node temp = head;
		int length = 1;
		Hashtable<Integer, Integer> h = new Hashtable<>();
		while (temp != null) {
			h.put(length, temp.data);
			temp = temp.next;
			length++;
		}

		System.out.println(h);
		System.out.println(n + "th Element from the Last: " + h.get(length - n));
	}

	// Solution 3 : M-n+2
	public void findNthWithoutHash(int n) {
		Node temp = head;
		int length = 0;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		Node pointer = head;
		int threshold = (length - n + 1);
		for (int i = 1; i < threshold; i++) {
			pointer = pointer.next;
		}
		System.out.println(n + "th Element from the Last: " + pointer.data);
	}

	// Solution 4 : Optimal
	public void findNthOptimal(int n) {
		Node current = head;
		Node pointer = head;

		if (n > size && n < 1)
			System.out.println("N out of bound");
		else {
			int counter = 1;
			while (counter != n) {
				pointer = pointer.next;
				counter++;
			}

			while (pointer.next != null) {
				current = current.next;
				pointer = pointer.next;
			}
			System.out.println(n + "th Element from the Last: " + current.data);
		}
	}

	
	// Insert data to SLL
	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			size++;
		}

		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			size++;
		}
	}

	// Display data in SLL
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
