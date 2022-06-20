public class Node {
	public Node() {
		
	}
	private int info;
	private Node link;
	Node first;
	Node last;
	int count;
	public void initializeList() {
	last=null;
	count=0;
	}
	public Node(int info, Node link) {      //Constructor same name as Class and no return type
	this.info= info;					//this means elements of this class
	this.link=link;
	}
	public void insertLast(int info) {
		
	}
	public void setInfo(int info) {
	this.info=info;
	}
	public void setLink(Node link) {
	this.link=link;
	}
	public int getInfo() {
	return info;
	}
	public Node getLink() {
	return link;
	}
	
	}
