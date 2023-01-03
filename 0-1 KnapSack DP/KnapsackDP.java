public class KnapsackDP {
	
	static int max(int a, int b){ 
    	return (a > b) ? a : b; 
	}
	
    static int knapSack(int W, int wt[], int val[], int n){
        if (n == 0 || W == 0)
            return 0;

        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);
 
        else
            return max(val[n - 1]+knapSack(W - wt[n - 1], wt,val, n - 1),knapSack(W, wt, val, n - 1));  
    }
    public static void main(String args[]){
        int val[] = {100,300,400,100,200};
        int wt[] = {20,15,40,15,200};
        int W = 55;
        int n = val.length;
        System.out.println("Maximum Value is: "+knapSack(W, wt, val, n));
    }
}