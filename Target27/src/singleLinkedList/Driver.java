package singleLinkedList;

public class Driver {
	public static void main(String[] args) {
		Single list = new Single();
		list.insert(5);
		list.insert(6);
		list.insert(1);
		list.insert(3);
		list.insert(7);
		list.insert(2);
		list.insert(22);

		list.display();

		// Finding the Nth Element from the END
		// Solution 1 : Recursion

		// Solution 2 : HashTable
		System.out.println("Solution 2 : HashTable");
		list.findNthHash(2);
		System.out.println();

		// Solution 3 : M-n+2
		System.out.println("Solution 3 : M-n+2");
		list.findNthWithoutHash(2);
		System.out.println();

		// Solution 4 : Optimal
		System.out.println("Solution 4 : Optimal");
		list.findNthOptimal(2);
		System.out.println();
		
		//Solution 0 : Stack Implementation
		System.out.println("Solution 0 : Stack Implementation");
		LinkedStack stack = new LinkedStack();
		stack.push(5);
		stack.push(8);
		stack.push(3);
		stack.push(2);
		stack.display();
		stack.pop();
		stack.pop();
		stack.display();
		
		
	}

}
