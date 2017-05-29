/**
 * @author Bhagwati Prasad(bpjoshi)
 */
package com.bpjoshi.dsalgo.queue;
public interface Queue {
	   void insert (Object o) throws QueueIsFullException;
	   boolean isEmpty ();
	   boolean isFull ();
	   Object remove () throws QueueIsEmptyException;
}
