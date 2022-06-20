
public class Main {

	public static void main(String[] args) {

    LinkedListType lt= new LinkedListType();
        lt.insertFirst(5);
        Node first=lt.getFront();
	    lt.insertLast(2);
	    lt.insertLast(4);
	    lt.insertLast(6);
	    lt.insertLast(7);
	    lt.insertLast(1);
	    lt.insertLast(9);
	    Node last=lt.getBack();
	    last.setLink(null);
	    System.out.println("The Linked List is:");
	    System.out.println(lt.toString());
	    int tobsrc=5;
	    lt.search(tobsrc);
	    System.out.println("Searching for "+tobsrc+" and "+ lt.find);
	    lt.deleteNode(lt.getFront());
	    System.out.println("\nAfter Deletion of Node:");
	    System.out.println(lt.toString());
	    lt.deleteNode(lt.getFront());
	    System.out.println(lt.toString());
	    lt.search(7);
	    lt.initalizeList();
	    lt.deleteNode(lt.f);
	    System.out.println(lt.toString());
	    


	}

}
