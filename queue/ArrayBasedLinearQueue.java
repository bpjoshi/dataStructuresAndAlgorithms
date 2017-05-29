/**
 * @author Bhagwati Prasad(bpjoshi)
 */
package com.bpjoshi.dsalgo.queue;

/**
 * @author bprasad
 *
 */
public class ArrayBasedLinearQueue implements Queue {

	private int front = -1, rear = -1;
	private Object [] queue;
	public ArrayBasedLinearQueue(int maxElements){
		this.queue=new Object[maxElements];
	}
	@Override
	public void insert(Object o) throws QueueIsFullException {
		if(rear==queue.length-1){
			throw new QueueIsFullException();
		}
		queue[++rear]=o;
	}
	@Override
	public boolean isEmpty() {
		return rear==front;
	}
	@Override
	public boolean isFull() {
		return rear==queue.length-1;
	}
	@Override
	public Object remove() throws QueueIsEmptyException {
	
		if (front == rear)
	          throw new QueueIsEmptyException ();
	      return queue [++front];
	}

}
