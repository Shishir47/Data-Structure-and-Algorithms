import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayExpen {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int [] array= new int[5];
    String coma=", ";
    Random random= new Random();
    for (int i=0; i<array.length; i++) {
    	array[i]= random.nextInt(20);
    }
     int [] backup= array;      // Backup previous array
    for(int i=0; i<array.length;i++) {
    	System.out.print(array[i]);
    	if(i<array.length-1) {
    		System.out.print(coma);
    	}
    	else {
    		break;
    	}
    }

    array= new int [10];
    System.out.println();
    for(int i=0; i<backup.length;i++) {
    	array[i]=backup[i];
    }
    for (int i=0; i<array.length; i++) {
    	array[i]= random.nextInt(20);
    }
    for(int i=0; i<array.length; i++) {
    	System.out.print(array[i]);
    	if(i<array.length-1) {
    		System.out.print(coma);
    	}
    	else {
    		break;
    	}
    }
    sc.close();
	}

}