
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Character> firstNode = new Node<Character>(null,'A',null);
		Node<Character> secondNode = new Node<Character>(null,'B',null);
		Node<Integer> thirdNode = new Node<Integer>(null,10,null);
		firstNode.setNext(secondNode);
		secondNode.setPrev(firstNode);
		secondNode.setNext(thirdNode);
		thirdNode.setPrev(secondNode);
		
		System.out.println("Forward Fashion: ");
		Node i = firstNode;
		while(i != null) {
			System.out.println(i.getInfo()+ " ");
			i = i.getNext();
		}
		System.out.println("Backward Fashion: ");
		Node j = thirdNode;
		while(j != null) {
			System.out.println(j.getInfo()+ " ");
			j = j.getPrev();
		}
	}

}

