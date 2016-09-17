package com.spark.collection;

public class LinkedList {
	Node head;

	public boolean isEmpty() {
		return (head == null);
	}

	public void add(String value) {
		Node newNode = new Node(value);
		head = newNode;

	}

	public boolean contains(String inputValue) {

		return head.value == inputValue;
	}

}
