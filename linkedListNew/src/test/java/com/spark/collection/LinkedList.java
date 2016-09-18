package com.spark.collection;

public class LinkedList {

	Node start;
	Node end;

	public LinkedList() {
		start = new Node(null);
	}

	public boolean isEmpty() {
		return start.isEmpty();
	}

}
