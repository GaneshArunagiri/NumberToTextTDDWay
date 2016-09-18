package com.spark.collection;

public class LinkedList {

	Node start;
	Node end;

	public boolean isEmpty() {
		return start == null;
	}

	public void add(String inputValue) {
		Node newNode = new Node(inputValue);
		if (this.isEmpty()) {
			start = newNode;
			end = newNode;
		} else {
			end.setNextLink(newNode);
			end = newNode;
		}

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

	public void delete(String inputValue) {
		if (isNodeValueMatches(start, inputValue)) {
			start = start.getNextLink();
			return;
		}
		Node previous = findPreviousNode(inputValue);
		if (isNodeNotNull(previous))
			previous.setNextLink(previous.getNextLink().getNextLink());

	}

	private Node findPreviousNode(String inputValue) {
		Node current = start;
		Node previous = null;
		while (isNodeNotNull(current) && !isNodeValueMatches(current, inputValue)) {
			previous = current;
			current = current.getNextLink();
		}
		return previous;
	}

	private boolean isNodeNotNull(Node current) {
		return current != null;
	}

	private boolean isNodeValueMatches(Node currentNode, String inputValue) {
		return currentNode.getValue() == inputValue;
	}

}
