package singleLinkedList;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class SingleLinkedList {

	public Node head;
	int size;

	public SingleLinkedList() {
		this.head = null;
		this.size = 0;
	}

	/*
	 * Insertion is basically at the End Normally Create New Node with the given
	 * data If its Empty List, make the node head and size++ Else traverse to the
	 * end of the List Insert the element and size++
	 */
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node tempNode = head;

			while (tempNode.next != null)
				tempNode = tempNode.next;

			tempNode.next = newNode;
		}
		size++;
	}

	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}

	public void insertAtNth(int data, int n) {
		Node newNode = new Node(data);
		Node tempNode = head;
		int count = 1;
		if (n == 1) {
			insertAtBeginning(data);
		}

		else if (n == size) {
			insertAtEnd(data);
		}

		else if (n != 0 && n <= size) {
			while (tempNode.next != null && count != (n - 1)) {
				tempNode = tempNode.next;
				count++;
			}
			newNode.next = tempNode.next;
			tempNode.next = newNode;
			size++;
		}

		else {
			System.out.println("Insertion out of Bound");
		}

	}

	// Brute Force
	static int counter;

	public int findN(Node head, int n) {

		if (head == null)
			return -1;

		int data = findN(head.next, n);
		counter++;
		if (counter == n)
			return head.data;

		return data;

	}

	// Hashtable soution

	public void hashNth(int n) {

		Node temp = head;
		int count = 1;
		Hashtable h = new Hashtable();
		h.put(count, temp.data);
		while (temp.next != null) {
			count++;
			h.put(count, temp.next.data);

			temp = temp.next;
		}
		System.out.println(count);
		System.out.println(h.get(count - n + 1));

		// Enumeration items = h.values();
		//
		// while(items.hasMoreElements())
		// {
		// System.out.println(items.nextElement());
		// }

	}

	// 2 pointer Move one to n-1
	// Move both till first reach last element
	public int findNthNodeFromEnd(int n) {
		if (n > size) {
			System.out.println("Out of bound");
			return 0;
		}
		Node current = head;
		Node pointer = head;
		int i = 0;
		while (i < n - 1) {
			pointer = pointer.next;
			i++;
		}
		while (pointer.next != null) {
			current = current.next;
			pointer = pointer.next;
		}
		return current.data;
	}

	public void deleteHead() {

		Node tempNode = head;
		head = tempNode.next;
		tempNode.next = null;
		size--;
	}

	public void deleteNthNode(int n) {
		if (n == 1) {
			deleteHead();
		} else if (n > size || n <= 0) {
			System.out.println("Out of bound");
		} else {
			int count = 1;
			Node tempNode = head;
			Node pointer = tempNode.next;
			while (tempNode.next != null && count != (n - 1)) {
				tempNode = tempNode.next;
				pointer = pointer.next;
				count++;
			}
			tempNode.next = pointer.next;
			size--;
		}
	}

	public void display() {
		Node tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode.data+"  ");
			tempNode = tempNode.next;
		}
	}

	public void insertLoop(int i) {
		Node newNode = new Node(i);
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.next = head;

	}

	public boolean findloop() {
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

	// Author: Sharad
	public boolean findLoopHash() {
		Node temp = head;
		int i = 0;
		HashSet ht = new HashSet();
		while (temp.next != null && !(ht.contains(temp.next))) {
			ht.add(temp.next);
			i++;
			temp = temp.next;
		}
		if (temp.next == null)
			return false;
		else
			return true;
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

	public void reverseListRecursive() {
		reverseListRecursive(head);
	}

	private void reverseListRecursive(Node curr) {
		if (curr == null) {
			return;
		}
		if (curr.next == null) {
			head = curr;
			return;
		}
		reverseListRecursive(curr.next);
		curr.next.next = curr;
		curr.next = null;
	}

	public static int listLength(SingleLinkedList list) {
		int length = 0;
		Node temp = list.head;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		return length;
	}

	public static void findIntersection(SingleLinkedList list, SingleLinkedList list1) {
		// System.out.println(listLength(list));
		// System.out.println(listLength(list1));
		Node temp = list.head;
		Node temp1 = list1.head;
		Node intersection = null;
		Node data, data1;

		while (temp != null) {
			data = temp.next;
			System.out.println(temp.data);
			while (temp1 != null) {
				data1 = temp1.next;
				System.out.println(temp1.data);
				if (data == data1) {
					System.out.println("Should break");
					intersection = data;
					break;
				}
				temp1 = temp1.next;
				if (intersection != null)
					break;
			}
			temp1 = list1.head;
			temp = temp.next;
			System.out.println("---------");
		}
		System.out.println("Intersection at Node: " + intersection.data);
	}

	public static void createIntersection(SingleLinkedList list, SingleLinkedList list1) {
		// TODO Auto-generated method stub
		list1.head.next.next.next.next = list.head.next.next.next;
	}

	public static void findIntersectionHash(SingleLinkedList list, SingleLinkedList list1) {
		Node temp1 = list.head;
		Node temp2 = list1.head;
		Node intersection = null;
		HashSet<Node> ht = new HashSet<>();
		while (temp1 != null) {
			ht.add(temp1);
			temp1 = temp1.next;
		}

		while (temp2 != null) {
			if (!(ht.contains(temp2))) {
				ht.add(temp2);
				temp2 = temp2.next;
			} else {
				intersection = temp2;
				System.out.println("Hash Intersection at Node: " + intersection.data);
				break;
			}

		}
	}

	// Not Working.Dono how to implement pointer concept using java
	public static void findIntersectionStack(SingleLinkedList list, SingleLinkedList list1) {
		LinkedStack stack1 = new LinkedStack();
		LinkedStack stack2 = new LinkedStack();
		Node temp1 = list.head;
		Node temp2 = list1.head;
		Node intersection = null;

		while (temp1 != null) {
			stack1.pushNode(temp1);
			temp1 = temp1.next;
		}

		while (temp2 != null) {
			stack2.pushNode(temp2);
			temp2 = temp2.next;
		}
		System.out.println("=======");
		stack1.displayNode();
		System.out.println("=======");
		stack2.displayNode();
		// while(stack1.top != stack2.top) {
		// intersection = stack1.top;
		// stack1.pop();
		// stack2.pop();
		// }

		// System.out.println("Stack Intersection at Node: " + intersection.data);
	}

	public static void findIntersectionOptimal(SingleLinkedList list, SingleLinkedList list1) {
		int l1 = listLength(list);
		int l2 = listLength(list1);
		Node pointer1 = null;
		Node pointer2 = null;
		int diff = 0;

		if (l1 > l2) {
			diff = l1 - l2;
			pointer1 = list.head;
			pointer2 = list1.head;
		} else {
			diff = l2 - l1;
			pointer1 = list1.head;
			pointer2 = list.head;
		}

		for (int i = 0; i < diff; i++) {
			pointer1 = pointer1.next;
		}

		while (pointer1 != null && pointer2 != null) {
			if (pointer1.data == pointer2.data) {
				System.out.println("Intersection at Node : " + pointer1.data);
				break;
			} else {
				pointer1 = pointer1.next;
				pointer2 = pointer2.next;
			}
		}
	}

	public static void findMiddle(SingleLinkedList list) {
		int len = listLength(list);
		Node temp = list.head;
		for (int i = 1; i <= (len / 2); i++) {
			temp = temp.next;
		}
		System.out.println("Middle Node is " + temp.data);
	}

	public static void findMiddleHash(SingleLinkedList list) {
		int len = listLength(list);
		Node temp = list.head;
		int pos = 1;
		Hashtable ht = new Hashtable();
		while (temp != null) {
			ht.put(pos, temp.data);
			pos++;
			temp = temp.next;
		}
		System.out.println("Middle Node is " + ht.get((len / 2) + 1));
	}

	// Author Sharad
	public static void findMiddleOneScan(SingleLinkedList list) {
		Node temp1 = list.head;
		Node temp2 = list.head;

		while (temp2 != null && temp2.next != null) {
			temp1 = temp1.next;
			temp2 = temp2.next.next;
		}

		System.out.println("Middle Node is " + temp1.data);
	}

	public static Node mergeSortListRecurse(Node head1, Node head2) {
		if (head1 == null)
			return head2;

		if (head2 == null)
			return head1;

		Node head = new Node(0);
		if (head1.data <= head2.data) {
			head = head1;
			head.next = mergeSortListRecurse(head1.next, head2);
		} else {
			head = head2;
			head.next = mergeSortListRecurse(head2.next, head1);
		}
		return head;
	}

	public static void mergeSortList(SingleLinkedList sort1, SingleLinkedList sort2) {
		SingleLinkedList sort3 = new SingleLinkedList();
		Node temp1 = sort1.head;
		Node temp2 = sort2.head;
		while (temp1 != null && temp2 != null) {
			if (temp1.data <= temp2.data) {
				sort3.insertAtEnd(temp1.data);
				temp1 = temp1.next;
			} else {
				sort3.insertAtEnd(temp2.data);
				temp2 = temp2.next;
			}
		}
		sort3.display();
	}
	// TBD	
	public void printReverse(Node head) {
		Node temp = head;
		while (temp == null) {
			return;
		}
		// temp = temp.next;
		// printReverse(temp);
		printReverse(temp.next);
		System.out.println(temp.data);
	}

	public static void findOddEven(SingleLinkedList list) {
		Node temp2 = list.head;

		while (temp2 != null && temp2.next != null) {
			temp2 = temp2.next.next;
		}

		if (temp2 == null)
			System.out.println("List is even");
		else
			System.out.println("List is odd");
	}

	public void reverseInPair() {
		Node temp1 = head;
		Node temp2 = null;
		if(head != null)
			head = head.next;
		
		while(temp1 != null && temp1.next !=null) {
			temp2 = temp1.next.next;
			temp1.next.next = temp1;
			temp1.next = temp2.next;
			temp2 = null;
			temp1 = temp1.next;
		}
		
		
	}

}
