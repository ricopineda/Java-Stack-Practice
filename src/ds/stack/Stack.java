package ds.stack;

public class Stack {
	
	private int maxSize;
	private long [] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top = -1;
	}
	
	// methods
	public void push(long j) {
		// this if condition is an additional measure to indicate to user that stack is full
		if(isFull()) {
			System.out.println(" this stack is already full");
		} else {
			top++;
			stackArray[top] = j;
		}
	}
	
	public long pop() {
		// this if condition is an additional measure to indicate to user that stack is empty
		if(isEmpty()) {
			System.out.println(" the stack is already empty");
			return -1;
		} else {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
	}
	
	public long peak() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (maxSize -1 == top);
	}
	
}
