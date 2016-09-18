package com.spark.collection;

public class Node {
	private String value;
	private Node nextLink;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Node getNextLink() {
		return nextLink;
	}

	public void setNextLink(Node nextLink) {
		this.nextLink = nextLink;
	}

	public Node(String inputValue) {
		this.setValue(inputValue);
	}

	public boolean isEmpty() {
		return (this.getValue() == null);
	}
	
}
