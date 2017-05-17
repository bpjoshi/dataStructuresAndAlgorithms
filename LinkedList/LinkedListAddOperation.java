
public class LinkedListAddOperation {
	//Static inner class Node
	static class Node{
		String name;
	    Node next;
	}
	public static void main (String [] args){
		Node top=null;
		//Case1: Singly linked list does not exist yet
		top= new Node();
		top.name="A";
		top.next=null;
		print("Case1: ", top);
		//Case2: Node to be inserted before first node
		Node temp=null;
		temp= new Node();
		temp.name="B";
		temp.next=top;
		top=temp;
		print("Case2: ", top);
		//Case3:Node inserted after the last node
		temp= new Node();
		temp.name="C";
		temp.next=null;
		Node temp2=null;
		temp2=top;
		while(temp2.next!=null){
			temp2=temp2.next;
		}
		temp2.next=temp;
		print("Case3: ", top);
		//Case4: Node inserted between nodes ..here between A&C
		temp= new Node();
		temp.name="D";
		temp2=top;
		while(temp2.next!=null && (!temp2.name.equalsIgnoreCase("A"))){
			temp2=temp2.next;
		}
		temp.next=temp2.next;
		temp2.next=temp;
		print("Case4: ", top);
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