package stacks;
/**
 * @author Bhagwati Prasad(bpjoshi)
 */
public class StackTest {

	public static void main(String[] args) {
		//ArrayBased Stack Testing
		ArrayBasedStack aBS=new ArrayBasedStack(2);
		System.out.println(aBS.isEmpty());
		aBS.push(new String("BP"));
		aBS.push(new String("Joshi"));
		//aBS.push(new String("this will cause Stackoverflow"));
		System.out.println(aBS.peek());
		aBS.pop();
		System.out.println(aBS.peek());
		
		//LinkedListBased Stack testing
		LinkedListBasedStack lLBS=new LinkedListBasedStack();
		System.out.println(lLBS.isEmpty());
		lLBS.push(new String("BP"));
		lLBS.push(new String("Joshi"));
		System.out.println(lLBS.isEmpty());
		System.out.println(lLBS.peek());
		lLBS.pop();
	}

}
