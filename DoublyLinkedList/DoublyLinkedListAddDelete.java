/**
 * @author Bhagwati Prasad(bpjoshi)
 */
public class DoublyLinkedListAddDelete {
	
	static class Node
	   {
	      String name;
	      Node next;
	      Node previous;
	   }
	
	public static void main(String[] args) {
		//Generating a doubly linked list
		  Node topForward = new Node ();
	      topForward.name = "A";
	      Node temp = new Node ();
	      temp.name = "B";
	      Node topBackward = new Node ();
	      topBackward.name = "C";
	      topForward.next = temp;
	      temp.next = topBackward;
	      topBackward.next = null;
	      topBackward.previous = temp;
	      temp.previous = topForward;
	      topForward.previous = null;
	      //Print forward singly linkedList
	      temp=topForward;
	      System.out.print("Forward Singly Linked List: ");
	      while(temp!=null){
	    	  System.out.print(temp.name+" ");
	    	  temp=temp.next;
	      }
	     System.out.println();
	     //Print backward singly linked list
	     temp=topBackward;
	      System.out.print("Backward Singly Linked List: ");
	      while(temp!=null){
	    	  System.out.print(temp.name+" ");
	    	  temp=temp.previous;
	      }
	     System.out.println();
	     
	     //Delete node B
	     temp=topForward.next;
	     topForward.next=temp.next;
	     topBackward.previous=temp.previous;
	     //Print Forward singly linked list after node deletion
	   //Print forward singly linkedList
	      temp=topForward;
	      System.out.print("Forward Singly Linked List: ");
	      while(temp!=null){
	    	  System.out.print(temp.name+" ");
	    	  temp=temp.next;
	      }
	     System.out.println();
	   //Print backward singly linked list after node deletion
	     temp=topBackward;
	      System.out.print("Backward Singly Linked List: ");
	      while(temp!=null){
	    	  System.out.print(temp.name+" ");
	    	  temp=temp.previous;
	      }
	     System.out.println();
	}
}
