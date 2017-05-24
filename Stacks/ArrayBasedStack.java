package stacks;
/**
 * @author Bhagwati Prasad(bpjoshi)
 */
public class ArrayBasedStack implements StackInterface {
	//top variable should be made private and Object array also so that
	//they cannot be altered from outside.
	private int top = -1;
	private Object [] stack;
	
	public ArrayBasedStack (int maxElements){
	      stack = new Object [maxElements];
	   }
	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public Object peek() {
		 if (top < 0)
	          throw new java.util.EmptyStackException ();
		 
	      return stack [top];
	}

	@Override
	public void push(Object o) {
		if (top == stack.length - 1){
			try {
				throw new FullStackException ("Stack Overflow: the stack is full");
			} catch (FullStackException e) {
				e.printStackTrace();
			}
		}
		 stack [++top] = o;	
	}

	@Override
	public Object pop() {
		 if (top < 0)
	          throw new java.util.EmptyStackException ();
	      return stack [top--];
	}

}
