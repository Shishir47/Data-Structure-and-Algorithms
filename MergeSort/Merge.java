
public class Merge {
	void merge(int a[], int beg,int mid, int end) {
		int i,j,k;
		int n= mid-beg+1;
		int n1= end-mid;
		int [] left= new int [n];
		int [] right= new int [n1];
		for(i=0; i<n; i++) {
			left[i]= a[beg+i];
		}
		for(j=0; j<n1; j++) {
			right[j]=a[mid+1+j];
		}
		i=0;
		j=0;
		k=beg;
		while(i<n && j<n1) {
			if(left[i]<=right[j]) {
				a[k]=left[i];
				i++;
			}
			else {
				a[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<n) {
			a[k]= left[i];
			i++;
			k++;
		}
		while(j<n1) {
			a[k]= right[j];
			j++;
			k++;
		}
		
	}
	void mergeSort(int []a, int beg, int end) {
		if(beg<end) {
			int mid=(beg+end)/2;
			mergeSort(a,beg,mid);
			mergeSort(a,mid+1,end);
			merge(a,beg,mid,end);
		}
	}
	public static void main(String[] args) {
		int [] arr= {5,15,6,3,2,10,20};
		int n= arr.length;
		Merge m1= new Merge();
		m1.mergeSort(arr, 0, n-1);
		System.out.println("Sorted Array is: ");
		for(int i=0; i<n;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
