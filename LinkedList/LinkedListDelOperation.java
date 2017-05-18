public class LinkedListDelOperation {
	static class Node{
		String name;
	    Node next;
	}
	public static void main (String [] args){
		//Build a linkedList B, A, D, C
		Node top = new Node ();
	      top.name = "C";
	      top.next = null;
	      Node temp = new Node ();
	      temp.name = "D";
	      temp.next = top;
	      top = temp;
	      temp = new Node ();
	      temp.name = "A";
	      temp.next = top;
	      top = temp;
	      temp = new Node ();
	      temp.name = "B";
	      temp.next = top;
	      top = temp;
	      print("Initial singly list: ", top);
	      //Case1: Delete the first node
	      top=top.next;
	      print("First node deleted: ", top);
	      //The list we have now is A, D, C
	      //Case2: Delete any node other than first node, suppose C
	      temp=top;
	      while(!(temp.name).equalsIgnoreCase("D")){ //while(temp.name.equals ("D") == false) can also be used
	    	  temp=temp.next;
	      }
	      temp.next=temp.next.next;
	      print("Non first node del: ", top);
	      
	      
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
