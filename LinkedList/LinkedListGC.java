class LinkedListGC
{
   static class Node
   {
      String name;
      Node next;
      protected void finalize () throws Throwable
      {
         System.out.println ("About to finalize: " + name);
         super.finalize ();
      }
   }
   public static void main (String [] args)
   {
      Node top = new Node ();
      top.name = "P";
      top.next = null;
      Node temp = new Node ();
      temp.name = "Q";
      temp.next = top;
      top = temp;
      temp = new Node ();
      temp.name = "R";
      temp.next = top;
      top = temp;
      temp = new Node ();
      temp.name = "S ";
      temp.next = top;
      top = temp;
      print ("Initial singly-linked list", top);
      top = null;
      temp = null;
      System.gc ();
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