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
		Node newNode = new Node(inputValue);
		if (start.isEmpty()) {
			start = newNode;
			end = newNode;
		} else
			end.setNextLink(newNode);
		end = newNode;

	}

	public boolean contains(String inputValue) {
		Node current = start;
		while (!current.isEmpty()) {
			if (current.getValue() == inputValue)
				return true;
			current = current.getNextLink();
		}
		return false;
	}

	private boolean isNodeValueMatches(String inputValue) {
		return start.getValue() == inputValue;
	}

	
}
