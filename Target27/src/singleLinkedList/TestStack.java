package singleLinkedList;

public class TestStack {
	public static void main(String[] args) {
		LinkedStack stack = new LinkedStack();
		stack.push(45);
		stack.push(6);
		stack.push(8);
		stack.push(61);
		
		
		stack.display();
		stack.pop();
		System.out.println("....................");
		stack.display();
		
		stack.push(81);
		System.out.println("....................");
		stack.display();
		
		stack.pop();
		
		System.out.println("....................");
		stack.display();
	}

}
