
public class LinearSearch {
    public static void main(String []args){    
        int[] a1= {10,20,30,50,70,90};    
        int key = 50, src=-1;  
        for(int i=0; i<a1.length;i++) {
        	if(a1[i]==key) {
        		src=i;
        	}
        }
        System.out.println(key+ " found at index: "+src);
    }    

}
