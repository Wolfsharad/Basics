package arrays;

import java.util.Arrays;

public class ArrayStack {
	private static int[] arrayStack;
	private static int stackSize;
	private static int stackTop = -1;

	public ArrayStack(int size) {
		stackSize = size;
		arrayStack = new int[stackSize];
	}

	public static void main(String[] args) {
		ArrayStack astack = new ArrayStack(4);
		astack.push(23);
		astack.push(2);
		astack.push(3);
		astack.push(1);
		astack.push(1);
		astack.printStack();
		System.out.println("Popped :" + astack.pop());
		astack.printStack();
		System.out.println("Popped :" + astack.pop());
		astack.printStack();

	}

	public void push(int input) {
		if (stackTop != (stackSize - 1)) {
			stackTop++;
			arrayStack[stackTop] = input;
		} else
			System.out.println("Stack Full");
	}

	public int pop() {
		if (stackTop == -1) {
			System.out.println("Stack is Empty");
			return -999;
		} else {
			stackTop--;
			stackSize--;
			return arrayStack[stackTop + 1];
		}
	}

	public void printStack() {
		System.out.println("_________");
		for (int i = stackSize; (i > 0); i--) {
			System.out.println(arrayStack[i - 1]);
		}
		System.out.println("_________");
	}
}
