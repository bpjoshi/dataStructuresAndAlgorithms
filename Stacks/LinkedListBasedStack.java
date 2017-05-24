/**
 * 
 */
package stacks;

/**
 * @author Bhagwati Prasad(bpjoshi)
 *
 */
public class LinkedListBasedStack implements StackInterface {

	 private static class Node{
	      Object o;
	      Node next;
	   }
	 
	 private Node top = null;
	@Override
	public boolean isEmpty() {
		
		return top==null;
	}

	
	@Override
	public Object peek() {
		if (top == null)
	          throw new java.util.EmptyStackException ();
	      return top.o;
	}

	
	@Override
	public void push(Object o) {
		Node temp= new Node();
		temp.o=o;
		temp.next=top;
		top=temp;
	}

	
	@Override
	public Object pop() {
		if (top == null)
			throw new java.util.EmptyStackException ();
		Object o = top.o;
		top = top.next;
		return o;
	}

}
