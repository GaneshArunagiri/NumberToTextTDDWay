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
		while (isNodeNotNull(current)) {
			if (isNodeValueMatches(current, inputValue))
				return true;
			current = current.getNextLink();
		}
		return false;
	}

	private boolean isNodeNotNull(Node current) {
		 return current != null;
	}

	private boolean isNodeValueMatches(Node currentNode, String inputValue) {
		return currentNode.getValue() == inputValue;
	}

	public void delete(String inputValue) {
		if (isNodeValueMatches(start, inputValue))
			start = start.getNextLink();
	}
}
