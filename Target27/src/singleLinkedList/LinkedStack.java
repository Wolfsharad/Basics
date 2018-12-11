package singleLinkedList;

public class LinkedStack {
	Node top;

	public LinkedStack() {
		this.top = null;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		if (top == null)
			top = newNode;
		else {
			Node tempNode = top;
			newNode.next = tempNode;
			top = newNode;
		}
	}

	public void pushNode(Node newNode ) {
		if (top == null)
			top = newNode;
		else {
			Node tempNode = top;
			newNode.next = tempNode;
			top = newNode;
		}
	}

	public Node pop() {

		Node tempNode = top.next;
		top.next = null;
		top = tempNode;
		return top;
	}

	public void display() {
		Node tempNode = top;
		while (tempNode != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
	}

	public void displayNode() {
		Node tempNode = top;
		while (tempNode != null) {
			System.out.println(tempNode);
			tempNode = tempNode.next;
		}
	}
}
