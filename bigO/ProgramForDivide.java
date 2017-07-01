
public class ProgramForDivide {
	public static void main(String[] args) {
		int result= div(12, 3);
		System.out.println("result is : "+result+" complexity is a/b");
	}
	
	public static int  div(int  a,  int  b)  { 
		int  count  = 0; 
		int  sum  =  0; 
		while  (sum  < a)  { 
			sum  +=  b; 
			count++; 
		} 
		return  count; 
	}
}
