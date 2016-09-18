package com.spark.collection;

import static org.junit.Assert.*;


import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testCreateEmptyList() {
		LinkedList list=new LinkedList();
		assertTrue(list.isEmpty());
	}
	@Test
	public void testAddSingleItemToList(){
		LinkedList list=new LinkedList();
		list.add("SHIVA");
		assertTrue(list.contains("SHIVA"));
	}
	@Test
	public void testAddTwoItemToList(){
		LinkedList list=new LinkedList();
		list.add("SHIVA");
		list.add("VISHNU");
		assertTrue(list.contains("SHIVA"));
		assertTrue(list.contains("VISHNU"));
	}
	

}
