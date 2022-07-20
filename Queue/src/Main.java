import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>(10);
		Random rand= new Random();
		for(int i=0; i<10; i++) {
			int value=rand.nextInt(100);
			System.out.print(value+" ");
			queue.enqueue(value);
		}
		System.out.println();
		for(int i=0; i<10; i++) {
		System.out.print(queue.dequeue()+" ");
		
		}

	}

}
