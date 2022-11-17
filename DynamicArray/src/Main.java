
public class Main {

	public static void main(String[] args) {
		DynamicArray da= new DynamicArray(10);
		da.add(1);
		da.add(2);
		da.add(3);
		da.add(4);
		da.add(5);
		da.insert(3, 9);
		da.replace(3, 6);
		da.delete(3);
		da.delete(1);
		da.delete(2);
		System.out.println("Empty: "+da.isEmpty());
		System.out.println("Size: "+da.size());
		System.out.println("Capacity: "+da.capacity());
		System.out.println(da.toString());

	}

}
