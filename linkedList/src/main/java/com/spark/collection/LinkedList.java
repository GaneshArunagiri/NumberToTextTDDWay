package com.spark.collection;

public class LinkedList {
	Node head;

	public boolean isEmpty() {
		return (head == null);
	}

	public void add(String value) {
		Node newNode = new Node(value);
		if (head==null)
			head = newNode;
		else
			head.nextLink=newNode;

	}

	public boolean contains(String inputValue) {
		Node current=head;
		while(current!=null)
		{
			if(current.value==inputValue) return true;
			current=current.nextLink;
		}
		return false;
	}

}
