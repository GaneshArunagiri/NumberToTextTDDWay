package com.spark.collection;

public class LinkedList {
	Node head;

	public boolean isEmpty() {
		return (head == null);
	}

	public void add(String value) {
		Node newNode = new Node(value);
		if (head == null)
			head = newNode;
		else {
			Node current = head;
			while (isNodeNotNull(current.nextLink)) {
				current = current.nextLink;
			}
			current.nextLink = newNode;

		}
	}

	public boolean isNodeNotNull(Node node) {
		return node != null;
	}

	public boolean contains(String inputValue) {
		Node current = head;
		while (isNodeNotNull(current)) {
			if (current.value == inputValue)
				return true;
			current = current.nextLink;
		}
		return false;
	}

	public void delete(String inputValue) {

		if (head.value == inputValue) {
			head = head.nextLink;
			return;
		}
		if (isNodeNotNull(head)) {
			Node current = head;
			while (isNodeNotNull(current.nextLink)) {
				if (current.nextLink.value == inputValue) {
					current.nextLink = current.nextLink.nextLink;
					return;
				}
				current = current.nextLink;
			}
		}

	}

}
