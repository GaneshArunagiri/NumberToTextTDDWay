package com.spark.collection;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	Node head;

	public boolean isEmpty() {
		return (!isNodeNotNull(head));
	}

	public void add(String inputValue) {
		Node newNode = new Node(inputValue);
		if (!isNodeNotNull(head))
			head = newNode;
		else {
			Node current = head;
			while (isNodeNotNull(current.nextLink)) {
				current = current.nextLink;
			}
			current.nextLink = newNode;

		}
	}

	public boolean contains(String inputValue) {
		Node current = head;
		while (isNodeNotNull(current)) {
			if (isNodeValueMatches(inputValue, current))
				return true;
			current = current.nextLink;
		}
		return false;
	}

	public void delete(String inputValue) {

		if (isNodeValueMatches(inputValue, head)) {
			head = head.nextLink;
			return;
		}
		if (isNodeNotNull(head)) {
			Node current = head;
			while (isNodeNotNull(current.nextLink)) {
				if (isNodeValueMatches(inputValue, current.nextLink)) {
					current.nextLink = current.nextLink.nextLink;
					return;
				}
				current = current.nextLink;
			}
		}

	}

	public List<String> values() {
		Node current = head;
		List<String> result = new ArrayList<String>();
		while (isNodeNotNull(current)) {
			result.add(current.value);
			current = current.nextLink;
		}
		return result;
	}

	private boolean isNodeNotNull(Node node) {
		return node != null;
	}

	private boolean isNodeValueMatches(String inputValue, Node current) {
		return current.value == inputValue;
	}

}
