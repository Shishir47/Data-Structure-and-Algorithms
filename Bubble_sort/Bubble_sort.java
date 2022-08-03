import java.util.Scanner;
public class Bubble_sort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Array Length: ");
		int n= sc.nextInt();
		int []array= new int [n];
		System.out.println("Enter "+n+ " Array Elements to Bubble Sort: ");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap array[j+1] and array[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
	}
		System.out.println("Sorted Array is: ");
		 for (int i = 0; i < n; i++)
	            System.out.print(array[i] + " ");
	        System.out.println();
		sc.close();
	}

}
