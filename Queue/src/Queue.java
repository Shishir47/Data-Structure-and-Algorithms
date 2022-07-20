
public class Queue <E>{
	private int front, rear;
	private int size=0;
	private E[] data;
	public Queue(int size) {
		data=(E[]) new Object [size];
	}
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isFull() {
		if(size== data.length) {
			return true;
		}
		else {
			return false;
		}
	}
	public void enqueue(E e) {
		if(isFull()) {
			throw new IllegalStateException("Queue is full");
		}
		else {
			data[rear]=e;
			rear=(rear+1)%data.length;
			size++;
		}
	}
	public E dequeue() {
		if(isEmpty()) {
			return null;
		}
		else {
			E answer=data[front];
			data[front]=null;
			front=(front+1)%data.length;
			size--;
			return answer;
		}
	}
	
}
