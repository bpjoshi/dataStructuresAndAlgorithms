package dll;
/**
 * @author Bhagwati Prasad(bpjoshi)
 */
public class DLLInsertionSort 
{
	   // Employee class
	   static class Employee
	   {
	      int empno;
	      String name;
	      Employee next;
	      Employee prev;
	   }
	   public static void main (String [] args)
	   {
	      // Employee Data
	      int [] empnos =
	      {
	         687, 325, 567, 100, 987, 654, 234
	      };
	      String [] names =
	      {
	         "April", "Joan", "Jack", "George", "Brian", "Sam", "Alice"
	      };
	      
	      Employee topForward = null;
	      Employee topBackward = null;
	      //Create one employee node with topForward and topBackward pointing to the same node
	      topForward = new Employee ();
	      topForward.empno = empnos [0];
	      topForward.name = names [0];
	      topForward.next = null;
	      topForward.prev = null;
	      topBackward = topForward;
	      // Insert the remaining employees based on ascending order in emp no
	      for (int i = 1; i < empnos.length; i++)
	      {
	           Employee e = new Employee ();
	           e.empno = empnos [i];
	           e.name = names [i];
	           e.next = null;
	           e.prev = null;
	           //Compare with already created node
	           Employee temp = topForward;
	           while (temp != null && temp.empno <= e.empno)
	              temp = temp.next;
	           //If temp is null then a node must be inserted here.
	           if (temp == null)
	           {
	               topBackward.next = e; 
	               e.prev = topBackward;  
	               topBackward = e;      
	           }
	           else
	           {
	               if (temp.prev == null) 
	               {
	                   e.next = topForward; 
	                   topForward = e;      
	                   temp.prev = e;       
	                                        
	               }
	               else
	               {
	                   e.next = temp.prev.next; 
	                   temp.prev.next = e;                           
	                   e.prev = temp.prev;     
	                   temp.prev = e;           
	               }
	           }
	      }
	      //Print Forward singly linked list: ascedning
	      System.out.println ("Ascending order:\n");
	      Employee temp = topForward;
	      while (temp != null)
	      {
	         System.out.println ("(" + temp.empno + ", " + temp.name + ")");
	         temp = temp.next;
	      }
	      System.out.println ();
	      // Print backward singly linked list: descending
	      System.out.println ("Descending order:\n");
	      temp = topBackward;
	      while (temp != null)
	      {
	         System.out.println ("(" + temp.empno + ", " + temp.name + ")");
	         temp = temp.prev;
	      }
	      System.out.println ();
	   }
	}
