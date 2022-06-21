
public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>(10);
		stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        System.out.println("Item in the Top is:");
        System.out.println( stack.peek() );
        System.out.println();
        System.out.println("Items in the Stack:");
        while (!stack.isEmpty())
        {
            System.out.println( stack.pop() );	
 
        }
	}

}
