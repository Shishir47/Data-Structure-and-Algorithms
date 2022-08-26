
import java.util.Scanner;
import java.util.Random;
public class Matrix {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Row: ");
		int row=sc.nextInt();
		System.out.println("Enter Column: ");
		int col=sc.nextInt();
		Random random= new Random();
		int[][] array= new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array[i][j]=random.nextInt(10);
			}
//How to Convert Multidimensional Array into toString?
		}
		//For Array 2
		int[][] array2= new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array2[i][j]=random.nextInt(10);
			}
		}
		System.out.println("\nThe First Matrix is: ");
		for(int i=0;i<row;i++) {
		for(int j=0; j<col; j++) {
			System.out.print(array[i][j]+"\t");
		}
		System.out.println();
		}
		System.out.println("\nThe Second Matrix is: ");
		for(int i=0;i<row;i++) {
		for(int j=0; j<col; j++) {
			System.out.print(array2[i][j]+"\t");
		}
		System.out.println();
		}
		System.out.println("\nThe Addition of Two Matrix is: ");
		int [][]plusArray= new int [row][col];
		for(int i=0; i<row;i++) {
			for(int j=0;j<col;j++) {
				plusArray[i][j]= array[i][j]+array2[i][j];
				System.out.print(plusArray[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\nThe Subtraction of Two Matrix is: ");
		int [][]subArray= new int [row][col];
		for(int i=0; i<row;i++) {
			for(int j=0;j<col;j++) {
				subArray[i][j]= array[i][j]-array2[i][j];
				System.out.print(subArray[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\nThe Division of Two Matrix is: ");
		int [][]divArray= new int [row][col];
		for(int i=0; i<row;i++) {
			for(int j=0;j<col;j++) {
				try {
				divArray[i][j]= array[i][j]/array2[i][j];
				}
				catch(ArithmeticException e) {
					System.out.print("1/");
				}
				System.out.print(divArray[i][j]+"\t");
				
			}
			System.out.println();
		}
		System.out.println("\nThe Multiplication of Two Matrix is: ");
		int [][]sumArray= new int [row][col];
		for(int i=0; i<row;i++) {
			for(int j=0;j<col;j++) {
				for(int k=0; k<col;k++) {
				sumArray[i][j]+= array[i][k]*array2[k][j];
				}
				System.out.print(sumArray[i][j]+"\t");
			}
			System.out.println();
		}
	
		
		System.out.print("\nPrincipal Diagonal: ");
		 
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + ", ");
                }
            }
        }
        System.out.println("");
 
        System.out.print("\nSecondary Diagonal: ");
 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if ((i + j) == (row - 1)) {
                    System.out.print(array[i][j] + ", ");
                }
            }
        }
        System.out.println("");
        sc.close();
	}

}
