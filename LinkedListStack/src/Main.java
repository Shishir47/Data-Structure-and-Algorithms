
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack <Integer> stack= new Stack<Integer>();
		stack.push(11);
		stack.push(22);
		stack.push(33);
		stack.push(44);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		stack.initialize();
		

  
	}

}
