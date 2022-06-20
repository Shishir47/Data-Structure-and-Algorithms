
public class Main {

	public static void main(String[] args) {

    LinkedListType lt= new LinkedListType();
        lt.insertFirst(5);
	    lt.insertLast(2);
	    lt.insertLast(4);
	    lt.insertLast(6);
	    lt.insertLast(7);
	    lt.insertLast(1);
	    lt.insertLast(9);
	    lt.insertLast(3);
	    Node last=lt.getBack();
        Node first=lt.getBack().getLink();
	    last.setLink(first);
	    System.out.println("The List is Empty: "+lt.isEmptyList());
	    System.out.println("The Linked List is:");
	    System.out.println(lt.toString());
	    System.out.println("First Node is: "+first.getInfo());
	    System.out.println("Node after Last Node is: "+last.getLink().getInfo());
	    System.out.println("Length of the List: "+lt.length());
	    int tobsrc=6;
	    lt.search(tobsrc);
	    System.out.println("Searching for "+tobsrc+" and "+ lt.find+" at Link: "+lt.f);
	    System.out.println(lt.toString());
	    lt.initalizeList();
	    System.out.println("The List is Empty: "+lt.isEmptyList());


	}

}
