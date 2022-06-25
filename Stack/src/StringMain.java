
public class StringMain {

	public static void main(String[] args) {
		int n=10;
		Stack <String> stStack= new Stack<String>(n);
		stStack.push("Shishir");
		stStack.push("Rony");
		stStack.push("Shawon");
		stStack.push("Raj");
		System.out.println("Stack size is: ");
		System.out.println(stStack.size());
		System.out.println();
		System.out.println("Top Item in Stack is: ");
		System.out.println(stStack.peek());
		System.out.println();
		System.out.println("Items in Stack: ");
		while(!stStack.isEmpty()) {
			System.out.println(stStack.pop());
		}
	}

}
