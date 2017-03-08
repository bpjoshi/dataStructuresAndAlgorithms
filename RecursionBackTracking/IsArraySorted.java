/**
 * 
 * @author Bhagwati Prasad(bpjoshi)
 *
 */
/*
 Problem statement: Check if an array is sorted in an ascending order using recursion
 */
public class IsArraySorted {
	public static void main(String[] args) {
		IsArraySorted iAS= new IsArraySorted();
		int[] arr= {10, 20, 60, 40, 50};
		System.out.println(arr.length);
		int i=iAS.isArraySorted(arr, arr.length);
		if(i==0) 
			System.out.println("The array is not sorted.");
		else
			System.out.println("The array is sorted in ascending order.");
	}

	//Function takes array and array length as inputs
	private int isArraySorted(int[] arr, int length) {
		if(length==1){
			//Base case, if the length is 1 ..array is sorted
			return 1;
		}
		/*If second last element is bigger than last element (length-1)th element 
		 return 0 else check if (length-3)th element is bigger than (length-2)th element*/
		return ((arr[length-1]<arr[length-2])?  0: isArraySorted(arr, length-1));
	}

}
