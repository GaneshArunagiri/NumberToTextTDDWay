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
	@Test
	public void testAddThreeItemToList(){
		LinkedList list=new LinkedList();
		list.add("SHIVA");
		list.add("VISHNU");
		list.add("BRAHMA");
		assertTrue(list.contains("SHIVA"));
		assertTrue(list.contains("VISHNU"));
		assertTrue(list.contains("BRAHMA"));
	}
	
	@Test
	public void testDeleteAnItemFromList()
	{
		LinkedList list=new LinkedList();
		list.add("SHIVA");
		list.delete("SHIVA");
		assertFalse(list.contains("SHIVA"));
	}
	
	@Test
	public void testDeleteMultipleItemsFromList()
	{
		LinkedList list=new LinkedList();
		list.add("SHIVA");
		list.add("VISHNU");
		list.add("BRAHMA");
		
		list.delete("BRAHMA");
		list.delete("VISHNU");
		
		assertTrue(list.contains("SHIVA"));
		assertFalse(list.contains("VISHNU"));
		assertFalse(list.contains("BRAHMA"));
	}
	

}
