/**
 * @author Bhagwati Prasad(bpjoshi)
 */
/*Demo of Mamoization for exponential time complexity algorithms*/
public class FibonacciWithMamoization {
	public static void main(String[] args) {
		printFib(10);
	}
	public static void  printFib(int  n)  { 
		int[]  memo  = new  int[n  + 1]; 
		for  (int  i  = 0;  i  <  n;  i++)  { 
		System.out.println(i  + " : "  +  fib(i,  memo)); 
	   } 
	} 
	/* Uses Mamoization to save old values 
	 * that saves complexity changes from O(2^N) to O(N)
	 * Mamoization is used in case of exponential time complexities
	 */
	public static int fib(int  n,  int[]  memo)  {
		if(n<=0) return 0;
		else if(n==1) return 1;
		else if(memo[n]>0) return memo[n];
		memo[n]=fib(n-1, memo)+fib(n-2, memo);
		return memo[n];
	}
}
