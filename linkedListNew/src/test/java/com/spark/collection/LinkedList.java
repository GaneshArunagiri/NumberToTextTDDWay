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

	public void add(String inputValue) {
		Node newNode=new Node(inputValue);
		if(start.isEmpty())
			start=newNode;

	}

	public boolean contains(String inputValue) {
		return isNodeValueMatches(inputValue);
	}

	private boolean isNodeValueMatches(String inputValue) {
		return start.getValue()==inputValue;
	}

}
