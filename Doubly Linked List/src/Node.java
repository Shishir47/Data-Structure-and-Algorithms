
public class Node<E> {
	private E info;
	private Node prev;
	private Node next;
	
	public Node(Node prev,E info, Node next) {      //Constructor same name as Class and no return type
		this.info= info;					//this means elements of this class
		this.prev=prev;
		this.next=next;
	}
	public void setInfo(E info) {
		this.info=info;
	}
	public void setPrev(Node prev) {
		this.prev=prev;
	}
	public void setNext(Node next) {
		this.next=next;
	}
	public E getInfo() {
		return info;
	}
	public Node getPrev() {
		return prev;
	}
	public Node getNext() {
		return next;
	}
		
}
