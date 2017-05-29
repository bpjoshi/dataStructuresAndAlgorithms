package com.bpjoshi.dsalgo.queue;
/**
 * @author Bhagwati Prasad(bpjoshi)
 */
public class QueueIsEmptyException extends Exception {
	public QueueIsEmptyException(){
		super("The queue is empty.");
	}
}
