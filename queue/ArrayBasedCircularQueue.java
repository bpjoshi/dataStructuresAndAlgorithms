package com.bpjoshi.dsalgo.queue;
/**
 * @author Bhagwati Prasad(bpjoshi)
 */
public class ArrayBasedCircularQueue implements Queue {
	private int front = 0, rear = 0;
	private Object [] queue;
	public ArrayBasedCircularQueue(int maxElements){
		this.queue=new Object[maxElements];
	}
	@Override
	public void insert(Object o) throws QueueIsFullException {
		
		
	}

	@Override
	public boolean isEmpty() {
		
		return false;
	}

	@Override
	public boolean isFull() {
		
		return false;
	}

	@Override
	public Object remove() throws QueueIsEmptyException {
		
		return null;
	}

}
