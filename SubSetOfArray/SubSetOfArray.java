
public class SubSetOfArray {

	public static void main(String[] args) {
		int n=8;
	    int count=(int) Math.pow(2,n);
	    int arr[]={9,4,4,5,9,4,9,10};
	    for(int i=0;i<count; i++ ){
	        for(int j=0; j<n; j++)
	        {
	            if((i & (1<<j))!=0)
	            {
	            	System.out.print(arr[j]+" ");
	                
	            }
	        }
	        System.out.println();
	    }

	}

}
