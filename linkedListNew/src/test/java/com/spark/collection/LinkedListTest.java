package com.spark.collection;

import static org.junit.Assert.*;


import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testCreateEmptyList() {
		LinkedList list=new LinkedList();
		assertTrue(list.isEmpty());
	}

}
