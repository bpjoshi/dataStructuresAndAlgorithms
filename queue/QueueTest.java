package com.bpjoshi.dsalgo.queue;

public class QueueTest {
	public static void main(String[] args) {
		ArrayBasedLinearQueue qQ=new ArrayBasedLinearQueue(4);
		System.out.println("Is the queue empty? "+qQ.isEmpty());
		System.out.println("Is the queue Full? "+qQ.isFull());
		try {
			qQ.insert(new String("HOLA"));
			qQ.insert(new String("ROFL"));
		} catch (QueueIsFullException e) {
			e.printStackTrace();
		}

		try {
			String str=(String)qQ.remove();
			System.out.println("removed object from queue: "+ str);
		} catch (QueueIsEmptyException e) {
			
			e.printStackTrace();
		}
		System.out.println("Is the queue empty? "+qQ.isEmpty());
		System.out.println("Is the queue Full? "+qQ.isFull());
	}
}
