package com.bpjoshi.dsalgo.queue;

public class QueueIsEmptyException extends Exception {
	public QueueIsEmptyException(){
		super("The queue is empty.");
	}
}
