public class Stack<E> {
	private int top=-1;
	private int size;
	E[] data;
	public Stack(int size) {
		this.size=size;
		data=(E[]) new Object [size];
	}
	public boolean isFull() {
		if(top==(size-1)) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public void push(E item) {
		if(!isFull()) {
			System.out.println("Stack is full!");
		}
	}
	public E pop() {
		if(!isEmpty()) {
			E item= data[top];
			data[top]=null;
			top--;
			return item;
		}
		else {
			System.out.println("Stack is empty!");
			return null;
		}
	}
	public E peek() {
		if(!isEmpty()) {
			return data[top];
		}
		else {
			System.out.println("Stack is empty!");
			return null;
		}
	}
}