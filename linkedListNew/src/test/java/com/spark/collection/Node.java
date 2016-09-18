package com.spark.collection;

public class Node {
	String value;
	Node nextLink;

	public Node(String inputValue) {
		this.value = inputValue;
	}

	public boolean isEmpty() {
		return (this.value == null);
	}
}
