package ds.sllist;

import java.util.HashSet;
import java.util.Hashtable;

public class SLList {

	public Node head;
	public int size;

	public SLList() {
		this.head = null;
		this.size = 0;
	}

	public void add(int data) {
		Node newNode = new Node(data);
		Node tempNode = head;
		if (head == null) {
			head = newNode;
		} else {
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
			size++;
		}
	}

	public void unreach() {
		System.out.println("Unreachable");
	}

	public void addSorted(int data) {
		Node newNode = new Node(data);
		Node temp = head;
		Node current = null;
		if (head == null) {
			head = newNode;
		} else if (temp.data > newNode.data) {
			newNode.next = head;
			head = newNode;
		}

		else {
			while (temp != null && temp.data < newNode.data) {
				current = temp;
				temp = temp.next;
			}
			newNode.next = temp;
			current.next = newNode;
		}

	}

	public void addLoop(int data) {
		Node newNode = new Node(data);
		Node tempNode = head;
		while (tempNode.next != null) {
			tempNode = tempNode.next;
		}
		tempNode.next = newNode;
		size++;
		newNode.next = head;
	}

	public void findNth(int n) {
		Node temp = head;
		Node point = head;
		int count = 1;
		while (count < n) {
			temp = temp.next;
			count++;
		}

		while (temp.next != null) {
			temp = temp.next;
			point = point.next;
		}
		System.out.println("Element " + n + " : " + point.data);
	}

	public boolean detectLoopHashAndRemove() {
		Node temp = head;
		HashSet<Node> ht = new HashSet<>();
		while (temp.next != null) {
			if (ht.contains(temp.next)) {
				temp.next = null;
				return true;
			}
			ht.add(temp.next);
			temp = temp.next;
		}

		return false;
	}

	public void print() {
		Node tempNode = head;
		while (tempNode != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
	}

	public boolean detectLoop() {
		Node slowPtr = head;
		Node fastPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if (slowPtr == fastPtr)
				return true;
		}

		return false;
	}

	public int findLoopLength() {
		Node slowPtr = head;
		Node fastPtr = head;
		int loopLength = 0;
		boolean loop = false;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if (slowPtr == fastPtr) {
				loop = true;
				break;
			}
		}
		if (loop == true) {

			do {
				slowPtr = slowPtr.next;
				loopLength++;

			} while (slowPtr != fastPtr);
		}
		return loopLength;
	}

	public int findLoopStart() {
		Node slowPtr = head;
		Node fastPtr = head;
		boolean loop = false;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if (slowPtr == fastPtr) {
				loop = true;
				break;
			}
		}
		if (loop == true) {
			slowPtr = head;
			while (slowPtr != fastPtr) {
				slowPtr = slowPtr.next;
				fastPtr = fastPtr.next;
			}
			return slowPtr.data;
		}
		return -1;
	}

	public void reverseList() {

		Node current = head;
		Node prev = null;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public static void findIntersection(SLList list, SLList list1) {
		Node head1 = list.head;
		Node head2 = list1.head;
	}

	public void rotate(Node head, int k) {
		
		int length = 0;
		Node temp = head;
		while(temp != null) {
			length++;
			temp=temp.next;
			
			
		}
		
		System.out.println(length);
		System.out.println("~~~~~~~~~");
		if (k <= 0 ||  k >= length) {
			System.out.println("Invalid K");
			return;
		}
		Node current = head;
		int count = 1;
		while (count < k && current != null) {
			current = current.next;
			count++;
		}
		if (current == null)
			return;
		Node kthNode = current;
		while (current.next != null)
			current = current.next;

		current.next = head;
		head = kthNode.next;
		kthNode.next = null;

		Node tempNode = head;
		while (tempNode != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
	}
}
