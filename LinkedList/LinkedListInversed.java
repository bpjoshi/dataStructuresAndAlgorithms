/**
 * 
 * @author Bhagwati Prasad(bpjoshi)
 *
 */
//Inversion of a singly list i.e. Make the last element top
public class LinkedListInversed {

	static class Node{
		String name;
		Node next;
	}
	public static void main(String[] args) {
		//Initializing a singly linked list
		Node top = new Node ();
	      top.name = "D";
	      top.next = null;
	      Node temp = new Node ();
	      temp.name = "C";
	      temp.next = top;
	      top = temp;
	      temp = new Node ();
	      temp.name = "B";
	      temp.next = top;
	      top = temp;
	      temp = new Node ();
	      temp.name = "A";
	      temp.next = top;
	      top = temp;
	      System.out.println(top.name);
	      print("inverse ", top);
	      top=inverse(top);
	      System.out.println(top.next.name);
	      print("inverse ", top);
	}
	private static Node inverse(Node top) {
		Node beforeTop=null, afterTop;
		while(top!=null){
			afterTop=top.next;
			top.next=beforeTop;
			beforeTop=top;
			top=afterTop;
		}
		return beforeTop;
	}
	static void print (String msg, Node top)
	   {
	      System.out.print (msg + " ");
	      while (top != null)
	      {
	         System.out.print (top.name + " ");
	         top = top.next;
	      }
	      System.out.println ();
	   }
}
